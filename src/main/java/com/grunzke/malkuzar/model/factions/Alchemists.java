package com.grunzke.malkuzar.model.factions;

import com.grunzke.malkuzar.model.Cost;
import com.grunzke.malkuzar.model.TileType;

public class Alchemists extends Faction {
  public Alchemists() {
    super("Alchemists", TileType.SWAMP);
    super.setStrongholdCost(new Cost(0, 4, 6));
    super.setSanctuaryCost(new Cost(0, 4, 6));
  }
}
