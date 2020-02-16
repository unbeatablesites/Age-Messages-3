import java.util.Scanner;

public class App {

    public static void main(String[] args) {

    }

    public static void askQuestion(){

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        if(input < 16 ){
            System.out.println("You can't drive");
        }

    }

}
