package com.grunzke.malkuzar.model.factions;

import com.grunzke.malkuzar.model.Cost;
import com.grunzke.malkuzar.model.TileType;

public class Swarmlings extends Faction {
  public Swarmlings() {
    super("Swarmlings", TileType.LAKE);
    super.setDwellingCost(new Cost(0,2,3));
    super.setTradingPostCost(new Cost(0,3,4));
    super.setStrongholdCost(new Cost(0,5,8));
    super.setTempleCost(new Cost(0,3,6));
    super.setSanctuaryCost(new Cost(0,5,8));
  }
}
