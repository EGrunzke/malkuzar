package com.grunzke.malkuzar.model;

public class RoundBonus {
  private String id;
  private String action;
  private int bonus;
  private String cult;
  private String reward;
  private int ratio;
  
  public RoundBonus(String id, String action, int bonus, String cult, String reward, int ratio) {
    this.id = id;
    this.action = action;
    this.bonus = bonus;
    this.cult = cult;
    this.reward = reward;
    this.ratio = ratio;
  }
  
  public static final RoundBonus SCORE1 = new RoundBonus("SCORE1", "Dig", 2, "Earth", "coin", 1);
  public static final RoundBonus SCORE3 = new RoundBonus("SCORE3", "Dwelling", 2, "Water", "priest", 4);
  public static final RoundBonus SCORE5 = new RoundBonus("SCORE5", "Dwelling", 2, "Fire", "4 power", 4);
  public static final RoundBonus SCORE6 = new RoundBonus("SCORE6", "Trading Post", 3, "Water", "dig", 4);
  public static final RoundBonus SCORE8 = new RoundBonus("SCORE8", "Trading Post", 3, "Air", "dig", 4);
  public static final RoundBonus SCORE4 = new RoundBonus("SCORE4", "Stronghold", 5, "Fire", "worker", 2);
  public static final RoundBonus SCORE7 = new RoundBonus("SCORE7", "Stronghold", 5, "Air", "worker", 2);
  public static final RoundBonus SCORE2 = new RoundBonus("SCORE2", "Town", 5, "Earth", "dig", 4);
  public static final RoundBonus SCORE9 = new RoundBonus("SCORE9", "Temple", 4, "Priest", "2 coin", 1);
}
