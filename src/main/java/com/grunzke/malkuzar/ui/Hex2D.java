package com.grunzke.malkuzar.ui;

import java.awt.Polygon;
import java.util.Collection;

import org.codetome.hexameter.core.api.Hexagon;
import org.codetome.hexameter.core.api.Point;

public class Hex2D extends Polygon {
  public Hex2D(Hexagon h) {
    super();
    Collection<Point> points = h.getPoints();
    points.forEach(pt -> {
      int x = (int)pt.getCoordinateX();
      int y = (int)pt.getCoordinateY();
      this.addPoint(x,y);
    });
  }
}
