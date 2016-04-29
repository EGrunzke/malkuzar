package com.grunzke.malkuzar.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collection;
import java.util.Random;

import javax.swing.JPanel;

import org.codetome.hexameter.core.api.Hexagon;
import org.codetome.hexameter.core.api.HexagonOrientation;
import org.codetome.hexameter.core.api.HexagonalGrid;
import org.codetome.hexameter.core.api.HexagonalGridBuilder;
import org.codetome.hexameter.core.api.HexagonalGridLayout;
import org.codetome.hexameter.core.api.Point;
import org.codetome.hexameter.core.backport.Optional;

import com.grunzke.malkuzar.model.OriginalMap;
import com.grunzke.malkuzar.model.TileType;

public class MapPanel extends JPanel {
  private HexagonalGrid grid;
  
  public MapPanel() {
    grid = new HexagonalGridBuilder()
        .setGridHeight(9)
        .setGridWidth(13)
        .setGridLayout(HexagonalGridLayout.RECTANGULAR)
        .setOrientation(HexagonOrientation.POINTY_TOP)
        .setRadius(32)
        .build();
    addHexSelectListener();
  }
  
  private void addHexSelectListener() {
    this.addMouseListener(new MouseListener() {
      
      @Override
      public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
      }
      
      @Override
      public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
      }
      
      @Override
      public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
      }
      
      @Override
      public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
      }
      
      @Override
      public void mouseClicked(MouseEvent e) {
        Hexagon hex = grid.getByPixelCoordinate(e.getX(), e.getY()).get();
        System.out.println("Clicked " + hex.getGridX() + ":" + hex.getGridY() );
      }
    });
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(2));
    
    Color[] all = new Color[]{
        Colors.RED_TILE,
        Colors.YELLOW_TILE,
        Colors.BROWN_TILE,
        Colors.BLACK_TILE,
        Colors.BLUE_TILE,
        Colors.GREEN_TILE,
        Colors.GRAY_TILE
    };
    final Random random = new Random();
    
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    
    OriginalMap om = new OriginalMap();
    om.getHexes().stream().filter(h -> h.getTile()!=TileType.RIVER).forEach(hex -> {
      Hexagon b = grid.getByAxialCoordinate(hex.getCoordinate()).get();
      Polygon p = polyFromHex(b);
      Color tileColor = hex.getTile().getTileColor();
      g.setColor(tileColor);
      g.fillPolygon(p);
      g.setColor(Colors.BLACK_PURE);
      g.drawPolygon(p);
      g.drawString(hex.getId(), (int) b.getCenterX()-8, (int) b.getCenterY()+17);
    });
  }
  
  private Polygon polyFromHex(Hexagon h) {
    Polygon poly = new Polygon();
    h.getPoints().forEach(pt -> {
      int x = (int)pt.getCoordinateX();
      int y = (int)pt.getCoordinateY();
      poly.addPoint(x,y);
    });
    return poly;
  }
  
  @Override
  public Dimension getPreferredSize() {
      return new Dimension(800, 600);
  }
}
