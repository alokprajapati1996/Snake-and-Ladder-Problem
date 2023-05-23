package com.bridgelabz.snakeandladdergame;
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game");
        int countDiceNoTime=0;
        int countPosionNoTimes=0;
        int player = 0;
        final int SNAKE = 2;
        final int LADDER = 1;
        final int STAY_SAME_POSITION = 0;
        while (player <= 99) {
            int dice = (int) (Math.random() * 6) + 1;
            System.out.println("random dice: "+dice);
            countDiceNoTime++;
            int checkPlayOption = (int) (Math.random() * 3);
            System.out.println("check position to move: "+checkPlayOption);
            switch (checkPlayOption) {
                case STAY_SAME_POSITION:
                    player = player;
                    break;
                case LADDER:
                    countPosionNoTimes++;
                    player = player + dice;
                    if(player>100){
                        player=player-dice;
                    }
                    System.out.println("player position: "+player);
                    break;
                case SNAKE:
                    countPosionNoTimes++;
                    player = player - dice;
                    if (player < 0) {
                        player = 0;
                    }
                    System.out.println("player position: "+player);
                    break;
            }
        }
        System.out.println("yes i win to reahed "+player);
        System.out.println("Total number of times play dice: "+countDiceNoTime);
        System.out.println("total number of times position to play: "+countPosionNoTimes);
    }
}











































































