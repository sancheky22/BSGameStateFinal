package com.example.bsgamestatefinal;

public class BSGameState {


    private int p1TotalHits;
    private int p2TotalHits;
    private int playerTurn;
    private int p1ShipsAlive;
    private int p1ShipsSunk;
    private int p2ShipsAlive;
    private int p2ShipsSunk;
    //private int playerNum;
    private int boatHealth;
    private boolean isHit;
    private String phaseOfGame;
    private String[][] shipLocations;
    private boolean isVisible;
    private String[][] shotLocations;

    private BSLocation[][] p1Board;
    private BSLocation[][] p2Board;



    public BSGameState() {
        this.playerTurn = 1;
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
        this.p2Board=new BSLocation[10][10];


    }


    // Copy Constructor
    public BSGameState(BSGameState original) {
        this.playerTurn = 1;
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
        this.p2Board=new BSLocation[10][10];

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
        if (playerID == gameState.getPlayerTurn()) {
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
    public int getPlayerTurn() {
        return this.playerTurn;
    }

    // sets current players turn
    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

    @Override
    public String toString() {
        String gameInfo = new String("");

        return gameInfo; //default return value
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
