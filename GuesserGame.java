import java.util.Scanner;
class Guesser{
    int guessnum;
    int guessingNumber(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Guesser : Please!Kindly guess the number");
        guessnum=scan.nextInt();
        return guessnum;
    }
}
class Player{
    int guessnum;
    //hello i am writing code
    int guessingNumber(){
        Scanner scan =new Scanner(System.in);
        System.out.println(" Players : Please!Kindly guess the number");
        guessnum=scan.nextInt();
        return guessnum;
    }
    
}
class Umpire{
    int numFromGuesser;
    int numFromAbhay;
    int numFromAman;
    int numFromShiwam;
    int numFromDhruv;
    int numFromAnurag;

    void CollectnumFromGuesser(){
        Guesser g=new Guesser();
        numFromGuesser=g.guessingNumber();

    }
    void CollectnumFromPlayer(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        Player p4=new Player();
        Player p5=new Player();
        numFromAbhay=p1.guessingNumber();
        numFromAman=p2.guessingNumber();
        numFromShiwam=p3.guessingNumber();
        numFromDhruv=p4.guessingNumber();
        numFromAnurag=p5.guessingNumber();
    }

    void Compare(){
        if(numFromGuesser==numFromAbhay){
            if(numFromGuesser==numFromAman&& numFromGuesser==numFromShiwam && numFromGuesser==numFromDhruv && numFromGuesser==numFromAnurag){
                System.out.println("sab ne answer shi diya hai!aap sab jeet gye");
                System.out.println("Bahut tej ho rhe ho sab ke sab");
            }
            else if(numFromGuesser==numFromShiwam && numFromGuesser==numFromDhruv && numFromGuesser==numFromAnurag){
                System.out.println("Abhay,Siwam,Dhruv,Anurag aap sabhi jeet gye");
            }
            else if(numFromGuesser==numFromDhruv&& numFromGuesser==numFromAnurag){
                System.out.println("Abhay,Dhruv,Anurag aap sabhi jeet gye");
            }
            else if(numFromGuesser==numFromAnurag){
                System.out.println("Abhay Anurag aap jeet  gye");
            }
            System.out.println("Congratulation : Abhay aap jeet gaye");
        }
        else if(numFromGuesser==numFromAman){
            if(numFromGuesser==numFromShiwam && numFromGuesser==numFromDhruv && numFromGuesser==numFromAnurag){
                System.out.println("Aman,Shiwam,DhruvandAnurag aap sab jeet gye");
            }
            else if(numFromGuesser==numFromDhruv && numFromGuesser==numFromAnurag){
                System.out.println("Aman,Dhruvand Anurag aap jeet gye");
            }
            else if(numFromGuesser==numFromAnurag){
                System.out.println("Aman and Anurag aap jeet gye");
            }
            System.out.println("Congratulation : Aman aap jeet gaye");
        }
        else if(numFromGuesser==numFromShiwam){
            if(numFromGuesser==numFromDhruv && numFromGuesser==numFromAnurag){
                System.out.println("Shiwam,Dhruv,Anurag aap sabhi jeet gye");
            }
            else if(numFromGuesser==numFromAnurag){
                System.out.println("Siwam and Anurag aap jeet gye");
            }
            System.out.println("Congratulation : Shiwam aap jeet gaye");
        }
        else if(numFromGuesser==numFromDhruv){
            if(numFromGuesser==numFromAnurag){
                System.out.println("Dhruv and Anurag  aap jeet gye");
            }
            System.out.println("Congratulation : Dhruv aap jeet gaye");
        }
        else if(numFromGuesser==numFromAnurag){
            System.out.println("Congratulation : Player5 aap jeet gaye");
        }
        else{
            System.out.println("sab ke sab haar gye koi nhi next time ");
        }
    }



}
public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("Start Game");

        Umpire U=new Umpire();
        U.CollectnumFromGuesser();
        U.CollectnumFromPlayer();
        U.Compare();
    }
    
}
