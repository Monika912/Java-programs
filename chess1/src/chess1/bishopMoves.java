package chess1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bishopMoves {
	static List<String> calculateBishopMoves(int x, int y){
		List<String> moves = new ArrayList<>();
		
		for(int i=1;x+i<=8 && y+i<=8;i++) {
			moves.add((x+i) + " " + (y+i));
		}
		for(int i=1;x-i>=1 && y+i<=8;i++) {
			moves.add((x-i) + " " + (y+i));
		}
		for(int i=1;x+i<=8 && y-i>=1;i++) {
			moves.add((x+i) + " " + (y-i));
		}
		for(int i=1;x-i>=1 && y-i>=1;i++) {
			moves.add((x-i) + " " + (y-i));
		}
		return moves;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int bishopX = scan.nextInt();
		int bishopY = scan.nextInt();
		List<String> possiblemoves = calculateBishopMoves(bishopX, bishopY);
		
		System.out.println("Possible moves are:");
		
		for(String moves : possiblemoves) {
			System.out.println(moves);
		}

	}

}
