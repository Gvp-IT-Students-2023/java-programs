package p2;

import java.util.*;

interface Sports {
  String getName();

  int getMaxPlayers();

  List getPlayers();
}

public class VolleyBall implements Sports {

  @Override
  public String getName() {
    return "Volley ball";
  }

  @Override
  public int getMaxPlayers() {
    return 6;
  }

  @Override
  public List getPlayers() {
    List players = new ArrayList();
    players.add("V Player 1");
    players.add("V Player 2");
    players.add("V Player 3");
    players.add("V Player 4");
    players.add("V Player 5");
    players.add("V Player 6");
    return players;
  }
}
