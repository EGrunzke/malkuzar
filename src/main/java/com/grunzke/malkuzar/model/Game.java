package com.grunzke.malkuzar.model;

import java.util.LinkedList;
import java.util.List;

public class Game {
  private LinkedList<Player> activePlayers;
  private LinkedList<Player> passedPlayers;
  private GameMap map;
  private List<Score> roundBonuses;
}
