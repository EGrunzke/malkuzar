package com.grunzke.malkuzar.model;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

public class GameTest {
  @Test
  public void setup() throws Exception {
    Game g = new Game();
    g.addPlayer("DimCrim");
    g.addPlayer("Maestro");
    g.addPlayer("Devastating_D");
    g.addPlayer("pwn");
    
    List<Player> allPlayers = g.getAllPlayers();
    assertEquals(4, allPlayers.size());
    Iterator<Player> i = allPlayers.iterator();
    
    Player dim = i.next();
    assertEquals("DimCrim", dim.getName());
    assertEquals(1, dim.getNum());
    
    Player maestro = i.next();
    assertEquals("Maestro", maestro.getName());
    assertEquals(2, maestro.getNum());
    
    Player dev = i.next();
    assertEquals("Devastating_D", dev.getName());
    assertEquals(3, dev.getNum());
    
    Player pwn = i.next();
    assertEquals("pwn", pwn.getName());
    assertEquals(4, pwn.getNum());
  }
}
