package com.grunzke.malkuzar.model.factions;

import com.grunzke.malkuzar.model.Cost;
import com.grunzke.malkuzar.model.TileType;

public class ChaosMagicians extends Faction {
  public ChaosMagicians() {
    super("Chaos Magicians", TileType.WASTELAND);
    super.setStrongholdCost(new Cost(0, 4, 4));
  }
}
