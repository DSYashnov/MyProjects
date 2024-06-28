package chapter_7.threadMethods.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> actions = new ArrayList<>();
        actions.add(Action.KAMEN);
        actions.add(Action.BUMAGA);
        actions.add(Action.NOJNICSY);
        List<Action> actions2 = new ArrayList<>();
        actions2.add(Action.BUMAGA);
        actions2.add(Action.KAMEN);
        actions2.add(Action.KAMEN);
        new BestFriend("Stanislav", actions, exchanger);
        new BestFriend("Kamen", actions2, exchanger);
    }
}
enum Action {
    KAMEN, NOJNICSY, BUMAGA;
}

class BestFriend extends Thread {
    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
    }

    private void whoWins (Action myAction, Action friendAction) {
                if (myAction == Action.KAMEN && Action.NOJNICSY == friendAction
                || (myAction == Action.NOJNICSY && friendAction == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendAction == Action.KAMEN)) {
            System.out.println(name + " WINS!!!!!!!!!");
        }
    }

    public void run() {
          Action reply;
          for (Action action : myActions) {
              try {
                  reply = exchanger.exchange(action);
                  whoWins(action, reply);
                  sleep(2000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              System.out.println();
          }
    }
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;
}