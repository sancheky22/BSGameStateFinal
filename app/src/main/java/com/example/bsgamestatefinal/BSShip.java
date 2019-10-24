package com.example.bsgamestatefinal;

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
