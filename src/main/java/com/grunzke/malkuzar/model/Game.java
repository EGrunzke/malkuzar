package com.grunzke.malkuzar.model;

import java.util.LinkedList;
import java.util.List;

import com.grunzke.malkuzar.model.factions.Faction;

public class Game {
  private LinkedList<Player> activePlayers;
  private LinkedList<Player> passedPlayers;
  private LinkedList<Player> allPlayers;
  private GameMap map;
  private List<Score> roundBonuses;
  private Phase phase;
  
  public Game() {
    activePlayers = new LinkedList<>();
    passedPlayers = new LinkedList<>();
    allPlayers = new LinkedList<>();
    phase = Phase.SETUP;
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
  
  public void selectFaction(Faction f) {
    Player p = nextPlayer();
    if (p.getFaction()!=null) {
      throw new IllegalStateException("Player already has faction");
    }
    p.setFaction(f);
    
    // check to see if we have all set up
    if (activePlayers.peek().getFaction()!=null) {
      phase = Phase.INITIAL_PLACEMENT;
    }
  }
  
  private Player nextPlayer() {
    Player p = activePlayers.getFirst();
    activePlayers.addLast(p);
    return p;
  }
}
