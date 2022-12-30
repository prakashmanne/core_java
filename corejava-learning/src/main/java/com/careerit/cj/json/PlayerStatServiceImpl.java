package com.careerit.cj.json;
import java.util.ArrayList;
import java.util.List;

public class PlayerStatServiceImpl implements  PlayerStatService{

  private List<Player> players;

  public PlayerStatServiceImpl(){
    FileReadUtil fileReadUtil = new FileReadUtil();
    players = fileReadUtil.readJsonData().getPlayers();
  }

  @Override
  public List<Player> getPlayerByCountry(String country) {
    return null;
  }

  @Override
  public List<Player> getPlayerByTeam(String team) {
    return null;
  }

  @Override
  public AmountStatDto getStatsOfTeam(String team) {
    return null;
  }

  @Override
  public AmountStatDto getStatsOfIpl() {
    return null;
  }

  @Override
  public List<String> getTeamNames() {
    return null;
  }

  @Override
  public List<String> getCountryNames() {
        List<String> countryNameList = new ArrayList<>();
        for(Player p:players){
            if(!countryNameList.contains(p.getCountry())){
              countryNameList.add(p.getCountry());
            }
        }
        return countryNameList;
  }
}
