package fi.utu.tech.exercise1.task1.task2;

public enum ChessPiece {
    King('K'), Queen('Q'), Rook('R'),
    Bishop('B'), Knight('N'), Pawn('P');

    ChessPiece(Character c) {
        this.symbol = c;
    }

    public final Character symbol;
}
