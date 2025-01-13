import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ChessMoveMatcher {

    protected static final String CHESS_MOVE_REGEX =
            "([KQRBN]?[a-h]?[1-8]?x?[a-h][1-8](=[QRBN])?)|" +
                    "(O-O(-O)?)";

}
