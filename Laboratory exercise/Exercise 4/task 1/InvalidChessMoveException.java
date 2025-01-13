class InvalidChessMoveException extends Exception {

    public InvalidChessMoveException(String move) {
        super("Невалиден ход: " + move);
    }
}