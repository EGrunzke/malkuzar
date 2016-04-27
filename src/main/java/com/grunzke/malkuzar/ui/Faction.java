package com.grunzke.malkuzar.ui;

import java.awt.Color;

public enum Faction {
  SWARMLINGS(0x60C0F0),
  MERMAIDS(0x60C0F0),
  WITCHES(0x80F080),
  AUREN(0x80F080),
  ENGINEERS(0xC0C0C0),
  DWARVES(0xC0C0C0),
  GIANTS(0xF08080),
  CHAOSMAGICIANS(0xF08080),
  NOMADS(0xF0F080),
  FAKIRS(0xF0F080),
  HALFLINGS(0xB08040),
  CULTISTS(0xB08040),
  DARKLINGS(0x404040),
  ALCHEMISTS(0x404040);
  
  private Color tile;
  
  private Faction(int tileRGB) {
    tile = new Color(tileRGB);
  }
}
