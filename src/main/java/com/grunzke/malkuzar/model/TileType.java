package com.grunzke.malkuzar.model;

import java.awt.Color;

import com.grunzke.malkuzar.ui.Colors;

public enum TileType {
  SWAMP(Colors.BLACK_TILE),
  PLAINS(Colors.BROWN_TILE),
  DESERT(Colors.YELLOW_TILE),
  WASTELAND(Colors.RED_TILE),
  MOUNTAIN(Colors.GRAY_TILE),
  FOREST(Colors.GREEN_TILE),
  LAKE(Colors.BLUE_TILE),
  RIVER(null),
  NONE(null);
  
  private Color tileColor;
  
  private TileType(Color tileColor) {
    this.tileColor = tileColor;
  }
  
  public Color getTileColor() {
    return tileColor;
  }
}
