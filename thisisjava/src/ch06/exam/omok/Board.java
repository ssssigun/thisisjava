package ch06.exam.omok;

public class Board {
    int size;
    String[][] map;
    int currentX;
    int currentY;
    Board(int size) {
        this.size = size;
        map = new String[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                map[row][col] = ".";
            }
        }
    }
    public void print() {
        for (int row = 0; row < size; row++) {
//한자리수는 공백 넣어서 오목칸 일정하게 유지하기
//    		if(row<10) {
//    			System.out.print(" " + row);       		
//    		}else {
//        		System.out.print(row);       		
//    		}
        	System.out.printf("%2d",row);
        	
    		for (int col = 0; col < size; col++) {
    			System.out.print(" " + map[row][col]);
    		}
            System.out.println();
        }
        System.out.print("  ");
//마지막 밑에 알파벳 출력하기
        for (int col = 0; col < size; col++) {
        	System.out.print(" " + (char)(65+col));
        }	
        System.out.println();
    }
    

}