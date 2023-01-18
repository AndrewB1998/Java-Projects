package fi.utu.tech.exercise1.task1.task2;

import java.util.*;


public class ChessBoard {


    public static Character[][] createInitialBoard() {
        /** Luo 10x10 shakkilaudan alkutilanteessa
         * @.pre true
         * @.post Board.length == 10
         *
         *
         */
        List<Character> pieces = Arrays.asList(ChessPiece.Rook.symbol, ChessPiece.Knight.symbol, ChessPiece.Bishop.symbol, ChessPiece.Queen.symbol, ChessPiece.King.symbol, ChessPiece.Pawn.symbol);
        //^ Lista pelinappuloista, joita iteroidaan myöhemmin
        Character[][] Board = new Character[10][10];

        for (int sarake = 0; sarake < 10; sarake++) { // Käydään silmukan kautta jokainen rivi ja sarake läpi jotta niihin saadaan oikeat merkit
            for (int rivi = 0; rivi < 10; rivi++) {
                if (rivi == 0 || rivi == 9) { // Määritetään "seinät"
                    Board[sarake][rivi] = '|';
                } else if ((sarake == 0 || sarake == 9) && rivi > 0 && rivi < 9) { // Jos alin ja ylin sarake niin rivien seinien sisälle "-" merkki
                    Board[sarake][rivi] = '-';
                } else if (sarake == 1 || sarake == 8) {
                    for (int k = 0; k < 5; k++) {
                        for (int i = 1; i < 6; i++) {
                            Board[sarake][i] = pieces.get(k);
                            if (Board[sarake][5] != ChessPiece.King.symbol) {  //Tarkistetaan ettei kuningattaren tilalle tule kuningas
                                Board[sarake][9 - i] = pieces.get(k);
                            }
                            k += 1;
                        }
                    }
                } else if (sarake == 2 || sarake == 7) { // Asetetaan sotilaat
                    Board[sarake][rivi] = pieces.get(5);
                } else {
                    Board[sarake][rivi] = '.';
                }
            }
        }

        return Board;
    }

    public static void printBoard(Character[][] Board) {
        /** Tulostaa laudan
         * @.pre Board == Character[10][10]
         * @.post true
         */
        for (int rivi = 0; rivi < Board.length; rivi++) {
            Character teksti[] = Board[rivi];
            System.out.println("");
            for (int sarake = 0; sarake < Board.length; sarake++) {
                Character Merkki = teksti[sarake];
                System.out.print(Merkki);

            }
        }
    }
}
