import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        askQuestion();
    }

    public static void askQuestion(){

        System.out.println("Please enter your age");

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        if(input < 16 ){
            System.out.println("You can't drive");
        }else if (input == 16 || input == 17){
            System.out.println("You can drive but not vote.");
        }else if (input >= 18 && input <= 24){
            System.out.println("You can vote but not rent a car.");
        }else
            System.out.println("You can do pretty much anything.");

    }

}
