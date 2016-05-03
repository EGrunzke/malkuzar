package com.grunzke.malkuzar.model.factions;

import com.grunzke.malkuzar.model.Cost;
import com.grunzke.malkuzar.model.TileType;

public class Auren extends Faction {
  public Auren() {
    super("Auren", TileType.FOREST);
    super.setStrongholdCost(new Cost(0,4,6));
  }
}
