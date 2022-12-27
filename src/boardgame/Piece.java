package boardgame;

public abstract class Piece {
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


    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }


    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}