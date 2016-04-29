package com.grunzke.malkuzar.model;

import org.codetome.hexameter.core.api.AxialCoordinate;
import org.codetome.hexameter.core.api.Hexagon;

public class Hex {
  private String id;
  private String key;
  private AxialCoordinate coordinate;
  private Hexagon hexagon;
  private TileType tile;
  
  public Hex(String id, String key, TileType tile) {
    this.id = id;
    this.key = key;
    this.coordinate = AxialCoordinate.fromKey(key);
    this.tile = tile;
  }
  
  public String getId() {
    return id;
  }
  
  public AxialCoordinate getCoordinate() {
    return coordinate;
  }
  
  public TileType getTile() {
    return tile;
  }
}
