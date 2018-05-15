package Classes.ChessStuff.GameManager;

import Classes.ChessStuff.Human.Player;

public class Manager {

    private  Player currentPlayer;

    private static Manager manager;

    public static Manager getInstance(){

        if( Manager.manager==null)
            Manager.manager=new Manager();
        return Manager.manager;

    }


}

