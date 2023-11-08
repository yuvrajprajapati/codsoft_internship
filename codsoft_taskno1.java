import java.util.Scanner;
 import java.util.Random;
    public class codsoft_taskno1 {
        public static void main(String[] args) {
            Scanner pc=new Scanner(System.in);
            Random random = new Random();
            System.out.println("welcome! to number guessing game ");
            int number=random.nextInt(1,100);
            int rounds=5;
            int success=0;
            System.out.println("if you want to play press 1");
            int replay=pc.nextInt();
            while(replay==1){
                for(int i=1;i<=rounds;i++){
                    System.out.println(" guess the Number");
                    int guess=pc.nextInt();
                    if(guess>number)
                        System.out.println("Too High");
                    else if(guess<number)
                        System.out.println("Too Low");
                    else
                    { System.out.println("Your Guess is correct you win!! ");
                        success++;
                        break;
                    }
                }
                if(rounds==5){
                    System.out.println("Sorry!! You Loose "+" Right number is="+number);
                }
                System.out.println("if u want to replay press 1 ");
                System.out.println("i u do not want to play press any key");
                replay=pc.nextInt();
            }
            System.out.println("Your total wins are="+success);
        }
    }

