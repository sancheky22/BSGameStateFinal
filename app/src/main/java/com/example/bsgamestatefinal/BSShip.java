package com.example.bsgamestatefinal;

/** @author Daniel Co
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author William Leung
 * **/

public class BSShip {
    private int xCoord; //starting x coordinate for ship
    private int yCoord; //starting y coordinate for ship
    private int xCoord2; //ending  coordinate for ship
    private int yCoord2; //ending y coordinate for ship
    private int Owner;

    public BSShip(int xLocationStart, int xLocationEnd, int yLocationStart, int yLocationEnd, int idOfOwner, int shipSize){
        this.xCoord=xLocationStart;
        this.yCoord=yLocationStart;
        this.xCoord2=xLocationEnd;
        this.yCoord2=yLocationEnd;
        this.Owner=idOfOwner;
    }

}
