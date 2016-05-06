package com.grunzke.malkuzar.model;

import com.grunzke.malkuzar.model.factions.Faction;

public class Player {
  private String name;
  private int num;
  private Faction faction;
  
  public Player(String name, int num) {
    this.name = name;
    this.num = num;
  }
  
  public String getName() {
    return name;
  }
  
  public int getNum() {
    return num;
  }
  
  public Faction getFaction() {
    return faction;
  }
  
  public void setFaction(Faction faction) {
    this.faction = faction;
  }
}
