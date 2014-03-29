package Game_TicTacToe;


import sun.org.mozilla.javascript.internal.ast.WhileLoop;

public class Main {

    public static void main(String[] args) {

        new Game(new HumanPlayer(),new AIPlayer());





    }

    static class Game {
        private Board board = new Board();
        private Player PlayerOne;
        private Player PlayerTwo;
        private Player CurrentPlayer;

        public Game (Player p1,Player p2){
            PlayerOne = p1;
            PlayerTwo = p2;
            CurrentPlayer = p1;

            While(!gameover){


            }



        }






    }

    boolean gameover(Board b){

        return false;
    }

    static public class Board{
        int[][] board = new int[3][3];
        int test;
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
            System.out.print(board[1]);
            System.out.print(board[2]);
            System.out.print(board[3]);


        }
        public int TestTest(){
            return test;
        }



    }



    public interface Player{
        public void doMove(Board b);
    }

    public static class HumanPlayer implements Player{

        @Override
        public void doMove(Board b) {

        }


    }

    public static class AIPlayer implements Player{


        public void doMove(Board b) {


        }

    }


}