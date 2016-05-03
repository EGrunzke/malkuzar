package com.grunzke.malkuzar.model;

import static com.grunzke.malkuzar.model.TileType.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OriginalMap {
  private Map<String, Hex> hexById;
  
  public OriginalMap() {
    hexById = new HashMap<>();
    createHex("A1", 0, 0, PLAINS);
    createHex("A2", 1, 0, MOUNTAIN);
    createHex("A3", 2, 0, FOREST);
    createHex("A4", 3, 0, LAKE);
    createHex("A5", 4, 0, DESERT);
    createHex("A6", 5, 0, WASTELAND);
    createHex("A7", 6, 0, PLAINS);
    createHex("A8", 7, 0, SWAMP);
    createHex("A9", 8, 0, WASTELAND);
    createHex("A10", 9, 0, FOREST);
    createHex("A11", 10, 0, LAKE);
    createHex("A12", 11, 0, WASTELAND);
    createHex("A13", 12, 0, SWAMP);
    
    createHex("B1", 0, 1, DESERT);
    createHex("r0", 1, 1, RIVER);
    createHex("r1", 2, 1, RIVER);
    createHex("B2", 3, 1, PLAINS);
    createHex("B3", 4, 1, SWAMP);
    createHex("r2", 5, 1, RIVER);
    createHex("r3", 6, 1, RIVER);
    createHex("B4", 7, 1, DESERT);
    createHex("B5", 8, 1, SWAMP);
    createHex("r4", 9, 1, RIVER);
    createHex("r5", 10, 1, RIVER);
    createHex("B6", 11, 1, DESERT);
    
    createHex("r6", -1, 2, RIVER);
    createHex("r7", 0, 2, RIVER);
    createHex("C1", 1, 2, SWAMP);
    createHex("r8", 2, 2, RIVER);
    createHex("C2", 3, 2, MOUNTAIN);
    createHex("r9", 4, 2, RIVER);
    createHex("C3", 5, 2, FOREST);
    createHex("r10", 6, 2, RIVER);
    createHex("C4", 7, 2, FOREST);
    createHex("r11", 8, 2, RIVER);
    createHex("C5", 9, 2, MOUNTAIN);
    createHex("r12", 10, 2, RIVER);
    createHex("r13", 11, 2, RIVER);
    
    createHex("D1", -1, 3, FOREST);
    createHex("D2", 0, 3, LAKE);
    createHex("D3", 1, 3, DESERT);
    createHex("r14", 2, 3, RIVER);
    createHex("r15", 3, 3, RIVER);
    createHex("D4", 4, 3, WASTELAND);
    createHex("D5", 5, 3, LAKE);
    createHex("r16", 6, 3, RIVER);
    createHex("D6", 7, 3, WASTELAND);
    createHex("r17", 8, 3, RIVER);
    createHex("D7", 9, 3, WASTELAND);
    createHex("D8", 10, 3, PLAINS);

    createHex("E1", -2, 4, SWAMP);
    createHex("E2", -1, 4, PLAINS);
    createHex("E3", 0, 4, WASTELAND);
    createHex("E4", 1, 4, LAKE);
    createHex("E5", 2, 4, SWAMP);
    createHex("E6", 3, 4, PLAINS);
    createHex("E7", 4, 4, MOUNTAIN);
    createHex("E8", 5, 4, DESERT);
    createHex("r18", 6, 4, RIVER);
    createHex("r19", 7, 4, RIVER);
    createHex("E9", 8, 4, FOREST);
    createHex("E10", 9, 4, SWAMP);
    createHex("E11", 10, 4, LAKE);
    
    createHex("F1", -2, 5, MOUNTAIN);
    createHex("F2", -1, 5, FOREST);
    createHex("r20", 0, 5, RIVER);
    createHex("r21", 1, 5, RIVER);
    createHex("F3", 2, 5, DESERT);
    createHex("F4", 3, 5, FOREST);
    createHex("r22", 4, 5, RIVER);
    createHex("r23", 5, 5, RIVER);
    createHex("r24", 6, 5, RIVER);
    createHex("F5", 7, 5, PLAINS);
    createHex("F6", 8, 5, MOUNTAIN);
    createHex("F7", 9, 5, PLAINS);

    createHex("r25", -3, 6, RIVER);
    createHex("r26", -2, 6, RIVER);
    createHex("r27", -1, 6, RIVER);
    createHex("G1", 0, 6, MOUNTAIN);
    createHex("r28", 1, 6, RIVER);
    createHex("G2", 2, 6, WASTELAND);
    createHex("r29", 3, 6, RIVER);
    createHex("G3", 4, 6, FOREST);
    createHex("r30", 5, 6, RIVER);
    createHex("G4", 6, 6, DESERT);
    createHex("G5", 7, 6, SWAMP);
    createHex("G6", 8, 6, LAKE);
    createHex("G7", 9, 6, DESERT);

    createHex("H1", -3, 7, DESERT);
    createHex("H2", -2, 7, LAKE);
    createHex("H3", -1, 7, PLAINS);
    createHex("r31", 0, 7, RIVER);
    createHex("r32", 1, 7, RIVER);
    createHex("r33", 2, 7, RIVER);
    createHex("H4", 3, 7, LAKE);
    createHex("H5", 4, 7, SWAMP);
    createHex("r34", 5, 7, RIVER);
    createHex("H6", 6, 7, MOUNTAIN);
    createHex("H7", 7, 7, PLAINS);
    createHex("H8", 8, 7, MOUNTAIN);
    
    createHex("I1", -4, 8, WASTELAND);
    createHex("I2", -3, 8, SWAMP);
    createHex("I3", -2, 8, MOUNTAIN);
    createHex("I4", -1, 8, LAKE);
    createHex("I5", 0, 8, WASTELAND);
    createHex("I6", 1, 8, FOREST);
    createHex("I7", 2, 8, DESERT);
    createHex("I8", 3, 8, PLAINS);
    createHex("I9", 4, 8, MOUNTAIN);
    createHex("r35", 5, 8, RIVER);
    createHex("I10", 6, 8, LAKE);
    createHex("I11", 7, 8, FOREST);
    createHex("I12", 8, 8, WASTELAND);
  }
  
  private void createHex(String id, int x, int z, TileType tile) {
    hexById.put(id, new Hex(id, x+","+z, tile));
  }
  
  public Collection<Hex> getHexes() {
    return hexById.values();
  }
}
