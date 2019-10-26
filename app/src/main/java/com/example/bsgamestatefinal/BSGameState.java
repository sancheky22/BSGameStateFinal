package com.example.bsgamestatefinal;

/** @author Daniel Co
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author William Leung
 * **/
public class BSGameState {


    public int p1TotalHits;
    public int p2TotalHits;
    public int playerID;
    public int p1ShipsAlive;
    public int p1ShipsSunk;
    public int p2ShipsAlive;
    public int p2ShipsSunk;
    //public int playerNum;
    public int boatHealth;
    public boolean isHit;
    public String phaseOfGame;
    public String[][] shipLocations;
    public boolean isVisible;
    public String[][] shotLocations;
    public BSLocation[][] p1Board;
    public BSLocation[][] p2Board;


    public BSGameState() {
        this.playerID = 0;
        this.p1TotalHits = 0;
        this.p2TotalHits = 0;
        this.p1ShipsAlive = 10;
        this.p1ShipsSunk = 0;
        this.p2ShipsAlive = 10;
        this.p2ShipsSunk = 0;
        this.isHit = false;
        this.phaseOfGame = "SetUp";

        this.shipLocations = null;
        this.p1Board = new BSLocation[10][10];
        this.p2Board = new BSLocation[10][10];


    }


    // Copy Constructor
    public BSGameState(BSGameState original) {
        this.playerID = 0;
        this.p1TotalHits = 0;
        this.p2TotalHits = 0;
        this.p1ShipsAlive = 10;
        this.p1ShipsSunk = 0;
        this.p2ShipsAlive = 10;
        this.p2ShipsSunk = 0;
        this.isHit = false;
        this.phaseOfGame = "SetUp";
        this.shotLocations = null;
        this.shipLocations = null;
        this.p1Board = new BSLocation[10][10];
        this.p2Board = new BSLocation[10][10];

        // copy the player-to-move information

        //HumanPlayer = original.HumanPlayer;
        //ComputerPlayer = original.ComputerPlayer;
    }

    /**
     * // Getter for boat selected
     * public int getBoat(int shipType) {
     * if (shipType == 0){
     * return carrier;
     * }else if(shipType == 1){
     * return battleShip;
     * }else if(shipType == 2){
     * return cruiser;
     * }else if(shipType == 3){
     * return submarine;
     * }else if(shipType == 4){
     * return destroyer;
     * }
     * }
     */

    // Setter for boat selected
   /* //public void setBoat(Ship shipType, int ship) { return this.shipType; }
    public boolean rotate(int playerID, int shipType, String xCoord, String yCoord, BSGameState gameState) {
        boolean valid = false;
        if (playerID == gameState.getplayerID()) {
            switch (shipType) {
                case 1: //code
                    valid = true;
                    break;

                case 2: //code
                    valid = true;
                    break;

                case 3: //code
                    valid = true;
                    break;

                case 4: //code
                    valid = true;
                    break;
                case 5: //code
                    valid = true;
                    break;

                default: //code
                    valid = false;
                    break;
            }
        }
        return valid;
    }*/

    // gets which players turn it is
    public int getPlayerID() {
        return this.playerID;
    }

    // sets current players turn
    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public boolean fire(String[][] bsBoard) {
        return false; // default return value
    }

    public boolean addShip(int playerNum, BSShip ship) {
        if (playerNum == this.getPlayerID()) {
            for (int row = ship.gety1(); row == ship.gety2(); row++) {
                for (int col = ship.getx1(); row == ship.getx2(); col++) {
                    if (playerNum == 0) {
                        this.p1Board[row][col].setSpot(2);
                    } else {
                        this.p2Board[row][col].setSpot(2);
                    }
                }
            }
        return true;
        }
        else{
            return false;
        }
        return false;
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

    @Override
    public String toString() {

        return "P1 Hits: " + this.p1TotalHits + " P2 Hits: " + this.p2TotalHits
                + " Player Turn:" + this.playerID + " P1 Ships Alive: " + this.p1ShipsAlive + " P2 Ships Alive: " + this.p2ShipsAlive
                + " P1 Ships Sunk: " + this.p1ShipsSunk + " P2 Ships Sunk: " + this.p2ShipsSunk + " Phase:" + this.phaseOfGame;


    }


    //fire method
    public boolean fire(int x, int y) {

        if (this.getPlayerID() == 0) {
            BSLocation temp = this.p1Board[y][x];
            if (checkSpot(temp) == 3 || checkSpot(temp) == 4) {
                this.p1Board[y][x] = temp;
                return false;
            } else if (checkSpot(temp) == 2) {
                this.p1TotalHits = this.p1TotalHits + 1;
                temp.setSpot(3);
                this.p1Board[y][x] = temp;
                return true;
            } else if (checkSpot(temp) == 1) {
                temp.setSpot(4);
                this.p1Board[y][x] = temp;
                return false;
            }
        } else if (this.getPlayerID() == 1) {
            BSLocation temp = this.p2Board[y][x];
            if (checkSpot(temp) == 3 || checkSpot(temp) == 4) {
                this.p2Board[y][x] = temp;
                return false;
            } else if (checkSpot(temp) == 2) {
                this.p2TotalHits = this.p2TotalHits + 1;
                temp.setSpot(3);
                this.p2Board[y][x] = temp;
                return true;
            } else if (checkSpot(temp) == 1) {
                temp.setSpot(4);
                this.p2Board[y][x] = temp;
                return false;
            }
        }
        return false;
    }

}

    /**
     * fire method: take board as parameter & fire on selected coordinates, return true if successful fire
     **/
    //public boolean fire(String[][] bsBoard) {
    // return false; // default return value
    //}


/**
 * placeShip method: place a ship using given coordinates, return true if ship is placed successfully
 */
    //public boolean placeShip(int playerID, int shipType, String xCoord, String yCoord, BSGameState gameState) {
    //return false; // default return value
    // }

    /**
     * newGame method: to start a new game, return true if successful
     **/
   /* public boolean newGame(BSGameState gameState) {
        return false; //default return value
    }

    *//**
     * quitGame method: to exit the game at any point, return true if successful
     **//*
    public boolean quitGame(BSGameState gameState) {
        return false; //default return value
    }*/


    /**
     * toString method: describes the state of the game as a string
     **/



    /**
     * Menu method; implement menu
     **/
 /*   public boolean implementMenu(BSGameState gameState) {
        return false; //default return value
    }


    *//**
     * Exit game method; exit the game
     **//*
    public boolean exitGame(BSGameState gameState) {
        return false; //default return value
    }


    *//**
     * CheckIfValidLocation method; check if location is valid, return true if successful
     **//*
    public boolean CheckIfValidLocation(BSGameState gameState) {
        return false; //default return value
    }

}*/
