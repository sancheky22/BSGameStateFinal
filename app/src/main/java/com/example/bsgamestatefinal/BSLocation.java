package com.example.bsgamestatefinal;

/** @author Daniel Co
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author William Leung
 * **/

public class BSLocation {
    public boolean isWater;
    public boolean isShip;
    public boolean isHit;
    public boolean isMiss;

    public BSLocation(){
        this.isWater=true;
        this.isShip=false;
        this.isHit=false;
        this.isMiss=false;
    }

}
