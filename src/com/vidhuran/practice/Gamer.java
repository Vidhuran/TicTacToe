package com.vidhuran.practice;


public class Gamer {

	private int[] board = new int[9];
	
	public boolean playerMove (int player, int position){
			if(board[position-1] != 0){
				return false;
			}
			else{
				board[position - 1] = player;
				return true;
			}
	}

	public void drawBoard(){
		System.out.println("+---+---+---+");
		System.out.println("| "+ ((board[0] == 1)?"X":"O") +" | "+ ((board[1] == 1)?"X":"O") +" | "+ ((board[2] == 1)?"X":"O") +" |");
		System.out.println("+---+---+---+");
		System.out.println("| "+ ((board[3] == 1)?"X":"O") +" | "+ ((board[4] == 1)?"X":"O") +" | "+ ((board[5] == 1)?"X":"O") +" |");
		System.out.println("+---+---+---+");
		System.out.println("| "+ ((board[6] == 1)?"X":"O") +" | "+ ((board[7] == 1)?"X":"O") +" | "+ ((board[8] == 1)?"X":"O") +" |");
		System.out.println("+---+---+---+");
	}
	
	public int computeWinner (){
		int winner = checkRows();
		if(winner != 0){
			return winner;
		}
		winner = checkCols();
		if(winner != 0){
			return winner;
		}
		winner = checkDiags();
		return winner;
	}
	
	private int checkRows (){
		if((board[0] == 1 && board[1] == 1 && board[2] == 1) || (board[0] == 2 && board[1] == 2 && board[2] == 2))
			return board[0];
		else if((board[3] == 1 && board[4] == 1 && board[5] == 1) || (board[3] == 2 && board[4] == 2 && board[5] == 2))
			return board[3];
		else if((board[6] == 1 && board[7] == 1 && board[8] == 1) || (board[6] == 2 && board[7] == 2 && board[8] == 2))
			return board[6];
		else
			return 0;
	}
	
	private int checkCols (){
		if((board[0] == 1 && board[3] == 1 && board[6] == 1) || (board[0] == 2 && board[3] == 2 && board[6] == 2))
			return board[0];
		else if((board[1] == 1 && board[4] == 1 && board[7] == 1) || (board[1] == 2 && board[4] == 2 && board[7] == 2))
			return board[1];
		else if((board[2] == 1 && board[5] == 1 && board[8] == 1) || (board[2] == 2 && board[5] == 2 && board[8] == 2))
			return board[2];
		else
			return 0;
	}
	
	private int checkDiags (){
		if((board[0] == 1 && board[4] == 1 && board[8] == 1) || (board[0] == 2 && board[4] == 2 && board[8] == 2))
			return board[0];
		else if((board[2] == 1 && board[4] == 1 && board[6] == 1) || (board[2] == 2 && board[4] == 2 && board[6] == 2))
			return board[2];
		else
			return 0;
		}
}
