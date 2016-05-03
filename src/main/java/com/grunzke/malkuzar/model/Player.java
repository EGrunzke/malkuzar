package com.grunzke.malkuzar.model;

public class Player {
  private String name;
  private int num;
  
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
}
