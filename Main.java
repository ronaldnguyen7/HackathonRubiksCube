// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner;
import java.util.Arrays;
// import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        Cube test = new Cube();
        boolean firstMenu = true;
        boolean secondMenu = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Access the rubik solver (must have white side completed)");
        System.out.println("2) Solve the cube yourself");
        while(firstMenu){
            int choice = scanner.nextInt();
            if(choice == 1){
                test.oll(test);
                test.pbl(test);
                test.finish(test);
                test.printCube(test);
                firstMenu = false;
            } else if (choice == 2){
                secondMenu = true;
                firstMenu = false;
            }
        }
        while(secondMenu){
            printOptions();
            int choice = scanner.nextInt();
            if(choice == 1){
                test.fTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 2){
                test.fpTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 3){
                test.uTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 4){
                test.upTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 5){
                test.dTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 6){
                test.dpTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 7){
                test.rTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 8){
                test.rpTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 9){
                test.lTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 10){
                test.lpTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 11){
                test.bTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 12){
                test.bpTurn(test);
                test.printCube(test);
                System.out.println("---------------------");
                System.out.println("Next option");
            } else if (choice == 13){
                System.out.println("Switch to rubik solver (Must have all white on bottom)");
                test.oll(test);
                test.pbl(test);
                test.finish(test);
                test.printCube(test);
                secondMenu = false;
            } else {
                System.out.println("Invalid input. Try Again");
            }
        }
    }

    static void printOptions(){
        System.out.println("---------------------");
        System.out.println("Choose your action");
        System.out.println("---------------------");
        System.out.println("1) Turn face clockwise");
        System.out.println("2) Turn face counter-clockwise");
        System.out.println("3) Turn top-side clockwise");
        System.out.println("4) Turn top-side counter-clockwise");
        System.out.println("5) Turn bottom-side clockwise");
        System.out.println("6) Turn bottom-side counter-clockwise");
        System.out.println("7) Turn right-side clockwise");
        System.out.println("8) Turn right-side counter-clockwise");
        System.out.println("9) Turn left-side clockwise");
        System.out.println("10) Turn left-side counter-clockwise");
        System.out.println("11) Turn back-side clockwise");
        System.out.println("12) Turn back-side counter-clockwise");
        System.out.println("13) Switch to rubik solver (Must all be white on the bottom)");
        System.out.println("---------------------");
    }

}