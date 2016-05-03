package com.grunzke.malkuzar.model;

import java.util.LinkedList;
import java.util.List;

public class Game {
  private LinkedList<Player> activePlayers;
  private LinkedList<Player> passedPlayers;
  private LinkedList<Player> allPlayers;
  private GameMap map;
  private List<Score> roundBonuses;
  
  public Game() {
    activePlayers = new LinkedList<>();
    passedPlayers = new LinkedList<>();
    allPlayers = new LinkedList<>();
  }
  
  public void addPlayer(String name) {
    int num = activePlayers.size()+1;
    Player player = new Player(name, num);
    allPlayers.add(player);
    activePlayers.add(player);
  }
  
  public List<Player> getAllPlayers() {
    return allPlayers;
  }
  
  public LinkedList<Player> getActivePlayers() {
    return activePlayers;
  }
  
  public LinkedList<Player> getPassedPlayers() {
    return passedPlayers;
  }
}
