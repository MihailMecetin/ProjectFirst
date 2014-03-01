package Game21;


import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        User U = new User();
        Comp C = new Comp();


        C.SetStones();
        System.out.println(C.GetStones());

        Turn (C,U);









    }


    public static void Turn (Player C,Player U) {
        int Summ;
        ((Comp)C).SetStones();
        ((User)U).SetStones();
        Summ = ((Comp)C).Stones  +  ((User)U).Stones;
        System.out.println(Summ);





    }

    public static class Player {
        int Stones = 0;
        int MaxStones = 3;
        public void SetStones(int i){
           this.Stones=i;
        }
        public int GetStones(){
            return Stones;
        }
    }

    public static class User extends Player {
        public void SetStones(){
            System.out.println("Viberi Chislo ot 0 do "+MaxStones);

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            System.out.println("Ti Vibral "+i);
            Stones=i;
        }
        public int Guess(){
            System.out.println("Skolko U vas kamnej vmeste?");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            System.out.println("Ti Dumaesh u vas "+i);

            return i;
        }
    }

    public static class Comp extends Player {
        public void SetStones(){
            Random rr = new Random();
            int RandomInt = rr.nextInt(MaxStones+1);
            System.out.println("Comp vibral "+RandomInt);
            Stones = RandomInt;
        }
        public int Guess(Player U){
            Random rr = new Random();
            int RandomInt = rr.nextInt(U.MaxStones+1);
            return Stones+RandomInt;
        }
    }


}



















