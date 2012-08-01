package com.vidhuran.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {

	private static int player;
	private static BufferedReader bufferedReader;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			setUpGame();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void setUpGame() throws IOException{
		Gamer game = new Gamer();
		player = 1;
		System.out.println("Welcome screen and instructions.");
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		startGame(game);
	}
	
	private static void startGame(Gamer game) throws IOException{
		int winner;
		do{
			System.out.print("Player " + ((player == 1)?"X":"O") + "'s turn. Enter your move : ");
			String input = bufferedReader.readLine();
			int position = Integer.parseInt(input);
			game.playerMove(player, position);
			game.drawBoard();
			winner = game.computeWinner();
			if(winner != 0){
				System.out.println("Player " + ((winner == 1)?"X":"O") + " has won.");
			}
			playerTurn();	
		}while(winner == 0);
		
	}
	private static void playerTurn(){
		if(player == 1){
			player = 2;
		}
		else if (player == 2){
			player = 1;
		}
	}
}
