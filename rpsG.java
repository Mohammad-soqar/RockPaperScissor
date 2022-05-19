
import java.util.Scanner;

public class rpsS {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("To play with CPU press : 1\nTo play 1vs1 press : 2");
        int choose = scan1.nextInt();
        if (choose == 1){
            System.out.println("1-Rock\n2-Paper\n3-Scissor");
            System.out.println("Player 1 : ");
            int p1 = scan1.nextInt();

            int p2 = 1 +(int) (Math.random() * 3);
            if(p2 == 1){
                System.out.println("Cpu chose Rock");
            }
            else if (p2 == 2){
                System.out.println("Cpu chose Paper");
            }
            else{
                System.out.println("Cpu chose Scissor");
            }
            System.out.println(rps(p1, p2 ,1));
        }
        if (choose == 2) {

            System.out.println("1-Rock\n2-Paper\n3-Scissors");
            System.out.println("Player 1 : ");
            int p1 = scan1.nextInt();
            System.out.println("Player 2 : ");
            int p2 = scan1.nextInt();
            System.out.println(rps(p1, p2, 2));
        }
    }
    public static String rps(int s1, int s2 , int choice){

        if (s1 == 1 && s2 == 3 || s1 == 2 && s2 == 1 || s1 == 3 && s2 == 2){
            return "Player 1 wins";
        }
        if(s1 == 3 && s2 == 1 || s1 == 1 && s2 == 2 || s1 == 2 && s2 == 3){
            if(choice == 1){
                return "Cpu wins";
            }
            else if(choice == 2){
                return "Player 2 wins";
            }
        }
        if (s1 == s2){
            return "TIE";
        }

        return null;
    }
}
