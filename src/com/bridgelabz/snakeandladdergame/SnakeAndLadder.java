package com.bridgelabz.snakeandladdergame;
public class SnakeAndLadder {
        public static void main(String[] args) {
            System.out.println("Snake and Ladder Game");
            int player = 0;
            final int SNAKE = 2;
            final int LADDER = 1;
            final int STAY_SAME_POSITION = 0;
            int dice = (int) (Math.random() * 6) + 1;

            int checkPlayOption = (int) (Math.random() * 3);
            switch (checkPlayOption) {
                case STAY_SAME_POSITION:
                    player = player;
                    break;
                case LADDER:

                    player = player + dice;
                    break;
                case SNAKE:
                    player = player - dice;

                    break;
            }

        }
}










































































