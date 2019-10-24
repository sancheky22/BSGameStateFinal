package com.example.bsgamestatefinal;

public class BSLocation {
    private boolean isWater;
    private boolean isShip;
    private boolean isHit;
    private boolean isMiss;

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
}
