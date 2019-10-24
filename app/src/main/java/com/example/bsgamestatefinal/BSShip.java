package com.example.bsgamestatefinal;

/** @author Daniel Co
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author William Leung
 * **/

public class BSShip {
    private int shipHealth;
    private int shipHits;
    private boolean isSunk;
    private int xCoord;
    private int yCoord;
    private int Owner;

    public BSShip(int xLocation, int yLocation, int idOfOwner, int shipSize){
        this.xCoord=xLocation;
        this.yCoord=yLocation;
        this.Owner=idOfOwner;
        this.shipHealth=shipSize;
        this.isSunk=false;
    }
}
