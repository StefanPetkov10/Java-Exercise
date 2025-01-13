import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String[] moves = scanner.nextLine().split(", ");

        String[] moves = new String[] {
                "e4", "Nf3", "Bb5", "O-O", "O-O-O", "e8=Q", "Nxe5", "a1=R", "Qc4", "Kh1g3",
                "Pz9", "T3", "Lxd2", "b9", "K12", "O-O-O-O", "b0", "e8=X"
        };

        for (String move : moves) {
            try {
                checkMove(move);
                System.out.println(move + " е валиден ход.");
            } catch (InvalidChessMoveException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void checkMove(String move) throws InvalidChessMoveException {
        Pattern pattern = Pattern.compile(ChessMoveMatcher.CHESS_MOVE_REGEX);
        Matcher matcher = pattern.matcher(move);
        if (!matcher.matches()) {
            throw new InvalidChessMoveException(move);
        }
    }
}