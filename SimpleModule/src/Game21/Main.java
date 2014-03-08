package Game21;


import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        User U = new User();
        Comp C = new Comp();
        C.LastWon = true;


        do{
        Turn (C,U);

        }while (! ((C.MaxStones == 0) || (U.MaxStones == 0))  );

        if(C.MaxStones == 0){
            System.out.println("Comp Vijgral igru!");
        }
        if(U.MaxStones == 0){
            System.out.println("Ti Vijgral igru!");
        }

    }


    public static void Turn (Comp C,User U) {
        int Summ;

        //Vibiraem summu
        C.SetStones();
        U.SetStones();
        Summ = C.Stones  +  U.Stones;
        System.out.println("Vasha summa = "+Summ);

        //Gadaem summu
        if(C.LastWon){
            C.Guess(U,0);
            U.Guess(C.Guess);
        }
        else{
            U.Guess(0);
            C.Guess(U,U.Guess);
        }
        if(Summ == C.Guess){
            C.MaxStones--;
            System.out.println("Comp vijgral raund.U nego teperj "+C.MaxStones+" kamnja");
        }
        else if(Summ == U.Guess){
            U.MaxStones--;
            System.out.println("Ti vijgral raund.U tebja teperj "+U.MaxStones+" kamnja");
            C.LastWon = !C.LastWon;
        }
        else {
            System.out.println("Nikto ne vijgral raund");
        }

    }

    public static class Player {
        int Stones = 0;
        int MaxStones = 3;
        int Guess = 0;
        boolean LastWon;

    }

    public static class User extends Player {
        public void SetStones(){
            System.out.println("Viberi Chislo ot 0 do "+MaxStones);

            int i;

            do{

                 //try
                    Scanner sc = new Scanner(System.in);
                    i = sc.nextInt();


                if  ( !((Object)i  instanceof Integer) || (i >MaxStones) || (i <0) ){
                    System.out.print("Ti Idiot? Poprobuj Snova");
                }
            }while( (i >MaxStones) || (i <0) || !((Object)i instanceof Integer));


            System.out.println("Ti Vibral "+i);
            Stones=(Integer)i;
        }
        public void Guess(int Taken){
            System.out.println("Skolko U vas kamnej vmeste?");

            int i;

            if(Taken != 0){
                System.out.println("Nelzja ugadivatj "+Taken);

                do{
                    Scanner sc = new Scanner(System.in);
                    i = sc.nextInt();
                    if  (i == Taken || !((Object)i instanceof Integer)){
                        System.out.print("Ti Idiot? Poprobuj Snova");
                    }
                }while( i==Taken || !((Object)i instanceof Integer));
            }
            else{
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
            }


            System.out.println("Ti Dumaesh u vas Vmeste "+i);
            Guess =  i;
        }
    }

    public static class Comp extends Player {
        public void SetStones(){
            Random rr = new Random();
            int RandomInt = rr.nextInt(MaxStones+1);
            System.out.println("Comp vibral "+RandomInt);
            Stones = RandomInt;
        }
        public void Guess(Player U,int Taken){
            Random rr = new Random();
            int RandomInt = rr.nextInt(U.MaxStones+1);
            if (Taken!=0) {
                do{
                    RandomInt = rr.nextInt(U.MaxStones+1);
                }while (Stones+RandomInt == Taken);
            }
            Guess = Stones+RandomInt;
            System.out.println("Comp Dumaet u vas vmeste "+Guess);
        }
    }


}



















