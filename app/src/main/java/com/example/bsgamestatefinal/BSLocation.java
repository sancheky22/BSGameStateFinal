package com.example.bsgamestatefinal;

/** @author Daniel Co
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author William Leung
 * **/

public class BSLocation {
    private boolean isWater;
    private boolean isShip;
    private boolean isHit;
    private boolean isMiss;

    private BSGameState myGameState;

    public BSLocation(){
        this.isWater=true;
        this.isShip=false;
        this.isHit=false;
        this.isMiss=false;
    }

    public int checkSpot(BSLocation location){
        if(location.isWater){
            return 1;
        }
        else if(location.isShip){
            return 2;
        }
        else if(location.isHit){
            return 3;
        }
        else if(location.isMiss){
            return 4;
        }
        else{
            return 0;
        }
    }

    /**to be called on a location object residing in gameState location array.
     *  Example: gameState.p1Board[][].setSpot(2) will set isShip boolean true and set isMiss, isHit, and isWater false
     *  When the input is set true, the rest will be false so checkspot can later determine what to tell GUI to do
     *  isWater is by default true and will never need to be set again
     */

    public void setSpot(int spotType){
        if(spotType==2){
            this.isShip=true;

            this.isHit=false;
            this.isMiss=false;
            this.isWater=false;
        }
        if(spotType==3){
            this.isHit=true;

            this.isShip=false;
            this.isWater=false;
            this.isMiss=false;
        }
        if(spotType==4){
            this.isMiss=true;

            this.isShip=false;
            this.isHit=false;
            this.isWater=false;
        }
    }
}
