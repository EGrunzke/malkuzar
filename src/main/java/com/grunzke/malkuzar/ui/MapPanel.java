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
    
    Color red = new Color(0xF08080);
    Color yellow = new Color(0xF0F080);
    Color brown = new Color(0xB08040);
    Color black = new Color(0x404040);
    Color blue = new Color(0x60C0F0);
    Color green = new Color(0x80F080);
    Color gray = new Color(0xC0C0C0);
    Color line = new Color(0x000000);
    
    Color[] all = new Color[]{
        new Color(0xF08080),
        new Color(0xF0F080),
        new Color(0xB08040),
        new Color(0x404040),
        new Color(0x60C0F0),
        new Color(0x80F080),
        new Color(0xC0C0C0)
    };
    final Random random = new Random();
    
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    
    
    
    int i = 0;
    grid.getHexagons().forEach(hex -> {
      Polygon poly = new Polygon();
      Collection<Point> points = hex.getPoints();
      points.forEach(pt -> {
        int x = (int)pt.getCoordinateX();
        int y = (int)pt.getCoordinateY();
        poly.addPoint(x,y);
      });
      int ni = random.nextInt(8);
      if (ni<7) {
        g.setColor(all[ni]);
        g.fillPolygon(poly);
        g.setColor(line);
        g.drawPolygon(poly);
        g.drawString(hex.getGridX() + ":" + hex.getGridY(), (int) hex.getCenterX(), (int) hex.getCenterY());
        System.out.println(hex.getGridX() + ":" + hex.getGridY());
      }
    });
  }
  
  @Override
  public Dimension getPreferredSize() {
      return new Dimension(800, 600);
  }
}
