package com.careerit.iplstat;

import java.util.List;

public class PlayerService {

  private List<Player> players;

  public PlayerService(List<Player> players) {
    this.players = players;
  }

  public double amountSpentBy(String team) {
    double amount = 0;
    for (Player player : players) {
      if (player.getTeam().equals(team)) {
        amount += player.getAmount();
      }
    }
    return amount;
  }

  public double maxAmount() {
    return 0;
  }

  public List<Player> maxPaidPlayers() {
    return null;
  }

}
