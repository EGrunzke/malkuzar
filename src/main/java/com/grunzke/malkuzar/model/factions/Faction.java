package com.grunzke.malkuzar.model.factions;

import com.grunzke.malkuzar.model.Cost;
import com.grunzke.malkuzar.model.TileType;

public abstract class Faction {
  private String name;
  private TileType tileType;
  
  // Building costs
  private Cost dwelling;
  private Cost tradingPost;
  private Cost stronghold;
  private Cost temple;
  private Cost sanctuary;
  
  public Faction(String name, TileType tileType) {
    this.name = name;
    this.dwelling = new Cost(0, 1, 2);
    this.tradingPost = new Cost(0, 2, 3);
    this.stronghold = new Cost(0, 4, 8);
    this.temple = new Cost(0, 2, 5);
    this.sanctuary = new Cost(0, 4, 8);
    this.tileType = tileType;
  }
  
  public String getName() {
    return name;
  }
  
  public TileType getTileType() {
    return tileType;
  }
  
  public Cost getDwellingCost() {
    return dwelling;
  }
  
  protected void setDwellingCost(Cost dwelling) {
    this.dwelling = dwelling;
  }
  
  public Cost getTradingPostCost() {
    return tradingPost;
  }
  
  protected void setTradingPostCost(Cost tradingPost) {
    this.tradingPost = tradingPost;
  }
  
  public Cost getStrongholdCost() {
    return stronghold;
  }
  
  protected void setStrongholdCost(Cost stronghold) {
    this.stronghold = stronghold;
  }
  
  public Cost getTempleCost() {
    return temple;
  }
  
  protected void setTempleCost(Cost temple) {
    this.temple = temple;
  }
  
  public Cost getSanctuaryCost() {
    return sanctuary;
  }

  protected void setSanctuaryCost(Cost sanctuary) {
    this.sanctuary = sanctuary;
  }
}
