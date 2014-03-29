package Game_TicTacToe;


public class Main {

    public static void main(String[] args) {

    }

    public class Board{
        int[][] board = new int[3][3];
        public boolean PlaceOnBoard(int x,int y,int token){
            if( board[x][y]!=0 ){
                board[x][y]=token;
                return true;
            }
            else {
                System.out.println("Zanjato");
                return false;
            }
        }
        public void PrintBoard(){



        }



    }



    public interface Player{
        public void doMove(Board b);
    }

    public class HumanPlayer implements Player{

        @Override
        public void doMove(Board b) {

        }


    }

    public class AIPlayer implements Player{


        public void doMove(Board b) {


        }

    }


}