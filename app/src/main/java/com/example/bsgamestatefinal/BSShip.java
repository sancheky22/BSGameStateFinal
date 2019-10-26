package com.example.bsgamestatefinal;

/** @author Daniel Co
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author William Leung
 * **/

public class BSShip {
    public int shipHealth;
    public int shipHits;
    public boolean isSunk;
    public int xCoord;
    public int yCoord;
    public int Owner;

    public BSShip(int xLocation, int yLocation, int idOfOwner, int shipSize){
        this.xCoord=xLocation;
        this.yCoord=yLocation;
        this.Owner=idOfOwner;
        this.shipHealth=shipSize;
        this.isSunk=false;
    }

    public int getx1(){
        return this.xCoord1;
    }

    public int getx2(){
        return this.xCoord2;
    }

    public int gety1(){
        return this.yCoord1;
    }

    public int gety2(){
        return this.yCoord2;
    }
}
