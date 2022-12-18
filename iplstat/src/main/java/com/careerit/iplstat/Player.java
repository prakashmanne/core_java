package com.careerit.iplstat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {
  private String name;
  private String team;
  private String role;
  private double amount;
  private String country;
}
