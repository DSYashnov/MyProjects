package chapter_7.threadMethods.exchanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.KAMEN);
        friend1Action.add(Action.BUMAGA);
        friend1Action.add(Action.NOJNICSY);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.BUMAGA);
        friend2Action.add(Action.KAMEN);
        friend2Action.add(Action.KAMEN);
        new BestFriend("Stanislav", friend1Action, exchanger);
        new BestFriend("Kamen", friend2Action, exchanger);
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
        this.start();
    }

    private void whoWins (Action myAction, Action friendAction) {
                if ((myAction == Action.KAMEN && friendAction == Action.NOJNICSY)
                || (myAction == Action.NOJNICSY && friendAction == Action.BUMAGA)
                || (myAction == Action.BUMAGA && friendAction == Action.KAMEN))
                {
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