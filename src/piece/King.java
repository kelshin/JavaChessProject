package piece;

public class King extends Piece {
    public King(boolean isWhite) {
        super(PieceValue.KING_VALUE, isWhite);
    }

    @Override
    public void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{value='" + getValue() + "'}";
    }
}
