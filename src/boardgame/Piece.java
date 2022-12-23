package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // We don't allow the Board to be changed. That's why we have only the 'get' method
    // (protected) Just classes inside the same package or subclasses will access one piece's board
    protected Board getBoard() {
        return board;
    }
}