package chess;

import java.util.ArrayList;
import java.util.List;

public class bishop {
    public static void main(String[] args) {
        int bishopX = 4;  // Bishop's X-coordinate (column)
        int bishopY = 4;  // Bishop's Y-coordinate (row)

        List<String> possibleMoves = calculateBishopMoves(bishopX, bishopY);

        System.out.println("Possible moves for the bishop:");
        for (String move : possibleMoves) {
            System.out.println(move);
        }
    }

    public static List<String> calculateBishopMoves(int x, int y) {
        List<String> moves = new ArrayList<>();

        // Moving diagonally towards the top-right direction
        for (int i = 1; x + i <= 8 && y + i <= 8; i++) {
            moves.add((x + i) + ", " + (y + i));
        }

        // Moving diagonally towards the top-left direction
        for (int i = 1; x - i >= 1 && y + i <= 8; i++) {
            moves.add((x - i) + ", " + (y + i));
        }

        // Moving diagonally towards the bottom-right direction
        for (int i = 1; x + i <= 8 && y - i >= 1; i++) {
            moves.add((x + i) + ", " + (y - i));
        }

        // Moving diagonally towards the bottom-left direction
        for (int i = 1; x - i >= 1 && y - i >= 1; i++) {
            moves.add((x - i) + ", " + (y - i));
        }

        return moves;
    }
}

