package Asgn03;

import java.util.ArrayList;
import java.util.List;

/**
 * Assignment 03
 * @author Mitashi Parikh
 * ...
 * @version 1.0
 * Blackboard Class - the blackboard for the blackboard pattern
 *          Is the central location for accessing data and is observervable
 *          Singleton pattern
 */
public class Blackboard extends MyObservable {
    private List<Tile> myTileList = new ArrayList<>();
    //opponentShips
    int shotIndex;
    boolean myTurn;
    private static Blackboard blackboard;

    /**
     *
     */
    private Blackboard(){}

    /**
     * 
     */
    public static Blackboard getBlackboard() {
        if(blackboard == null){
            blackboard = new Blackboard();
        }
        return blackboard;
    }

    /**
     * 
     */
    public List<Tile> getTileList(){
        return myTileList;
    }

    public void addTile(Tile t) {myTileList.add(t);}


    /**
     * updateData - calls notifying which then updates all the observers
    */
    public void updateData(){
        notifying();
    }

}
