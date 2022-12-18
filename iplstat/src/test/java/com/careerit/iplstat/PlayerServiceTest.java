package com.careerit.iplstat;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PlayerServiceTest {

  private List<Player> playerList;

  private PlayerService playerService;

  @BeforeEach
  public void init() {
    CsvReaderUtilTest obj = new CsvReaderUtilTest();
    playerList = obj.loadFromCsvFile();
    System.out.println(playerList.size());
    playerService = new PlayerService(playerList);
  }

  @Test
  void totalAmountByTeam() {
    double expected = (11.5 + 12) * 10_00_000;
    double actual = playerService.amountSpentBy("PBKS");
    Assertions.assertEquals(expected, actual);
  }

}
