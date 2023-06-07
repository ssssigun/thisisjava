package ch06.exam.omok;

import java.util.Scanner;

public class Omok {
    public static void main(String[] args) {
        Player user = new Player("사용자", "O");
        Player computer = new Player("컴퓨터", "X");
        Board board = new Board(19);
        
    	play(board, user, computer);
    }
//게임을 진행하는 함수
    private static void play(Board board, Player user, Player computer) {
    	boolean run = true;
//게임 중일때는 true이므로 무한으로 돌아가고 오목이 된 경우에는 false해서 나온다.
    	while(run) {
		    putStone(board, user);		//사용자 오목 확인
		    if(user.victory) break;
		    putStone(board, computer);	//컴퓨터 오목 확인
		    if(computer.victory) break;
    	}			
    }
//플레이어에 맞는 돌을 놓는 함수
    public static void putStone(Board board , Player player){
    	Scanner scan = new Scanner(System.in);
    	boolean run = true;
    	
    	while(run) {
    		board.print();
    		System.out.println();
    		System.out.print(player.name+" > ");
    		String user = scan.nextLine();
//공백 없이 입력되면 다시 입력 받게하기
    		if(user.contains(" ")) {												
    			String[] input = user.split(" ");
    			board.currentX = (int)Character.toUpperCase(input[0].charAt(0)) - 65;
    			board.currentY = Integer.parseInt(input[1]);
//범위 밖으로 입력을 하면 다시 입력 받기
    			if(0<=board.currentX && board.currentX<=18 && 0<=board.currentY && board.currentY<=18) {
    				if(board.map[board.currentY][board.currentX].contains(".")) {						
    					board.map[board.currentY][board.currentX] = player.stone;
    					run = false;
    				}else {
    					System.out.println("이미 놓은 곳입니다!!!");
    				}
    			}else {
    				System.out.println("보드 밖으로는 돌을 놓을 수 없습니다!");
    			}
//이미 놓은 곳인지 확인하기
    		}else {
    			System.out.println("공백을 넣어 입력해주세요!!!");
    		}
    	}
//놓았을때 오목인지 확인하기!(중요)
    	if(checkOmok(board,player)){
    		player.victory =true;
    		board.print();
    		System.out.println("------------- " + player.name + "가 이겼습니다! -------------");
    	}
    }
    
// 오목이 완성되었는지 확인하는 함수
    public static boolean checkOmok(Board board, Player player) {
    	int[] cnt = {0,0,0,0};
    	int[] x = {board.currentX, board.currentX-4, board.currentX-4 , board.currentX-4};
    	int[] y = {board.currentY-4,board.currentY, board.currentY-4, board.currentY+4};
    	int[] dx = {0,1,1,1};
    	int[] dy = {1,0,1,-1};

    	
    	for(int i=0;i<9;i++) {
    		for(int j=0;j<x.length;j++) {
	    		int indexX = x[j]+dx[j]*i;  
				int indexY = y[j]+dy[j]*i;
				
				if(0<=indexX && indexX<=18 && 0<=indexY && indexY<=18) {
					if(player.stone.equals(board.map[indexY][indexX])) {
						if(++cnt[j] == 5) return true;
					}else {
						cnt[j] = 0;
					}
				}
    		}
    	}
    	return false;
    }
} 