package com.bridgelabz.snakeandladder;
public class SnakeAndLadder {
    public static void main(String[] args) {
        int player1 = 0, player2 = 0;
        final int SNAKE = 2;
        final int LADDER = 1;
        final int STAY_SAME_POSITION = 0;
        int currentPlayer = -1;

        while (player1 <= 99 && player2 <= 99) {
            int dice = (int) (Math.random() * 6) + 1;
            System.out.println(dice);
            int checkPlayOption = (int) (Math.random() * 3);
            System.out.println(checkPlayOption);
            if (currentPlayer == -1) {

                switch (checkPlayOption) {
                    case STAY_SAME_POSITION:
                        player1 = player1;
                        break;
                        case LADDER:
                        player1 = player1 + dice;
                        if (player1 > 100) {
                            player1 = player1 - dice;
                        }
                        currentPlayer=currentPlayer++;
                        System.out.println("player1 position: " + player1);
                        break;
                        case SNAKE:
                        player1 = player1 - dice;
                        if (player1 < 0) {
                            player1 = 0;
                        }
                        System.out.println("player1 position: " + player1);
                        break;
                    }
            }
                      else
                {
                    switch (checkPlayOption) {
                        case STAY_SAME_POSITION:

                            player2 = player2;
                            break;

                        case LADDER:
                            player2 = player2 + dice;
                            if (player2 > 100) {
                                player2 = player2 - dice;
                            }
                            System.out.println("player2 position: " + player2);
                            currentPlayer=--currentPlayer;
                            break;
                        case SNAKE:
                            player2 = player2 - dice;
                            if (player2 < 0) {
                                player2 = 0;
                            }
                            System.out.println("player2 position: " + player2);
                            break;
                    }

                }
                System.out.println(currentPlayer = -currentPlayer);
            }
            if (player1 > player2) {
                System.out.println("player1 win  the game!" + player1);
            } else {
                System.out.println("player2 win the game! " + player2);
            }
        }
    }









































































