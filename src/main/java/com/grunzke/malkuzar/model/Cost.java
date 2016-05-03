package com.grunzke.malkuzar.model;

public class Cost {
  private int coins;
  private int workers;
  private int priests;

  public Cost(int priests, int workers, int coins) {
    this.coins = coins;
    this.workers = workers;
    this.priests = priests;
  }

  public int getCoins() {
    return coins;
  }

  public int getWorkers() {
    return workers;
  }

  public int getPriests() {
    return priests;
  }
}
