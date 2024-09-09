import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Cube {
    int[][] yellow = new int[2][2]; //top
    int[][] white = new int[2][2]; //bottom
    int[][] green = new int[2][2]; //front
    int[][] blue = new int[2][2]; //back
    int[][] orange = new int[2][2]; //right
    int[][] red = new int[2][2]; //left

    public Cube(){
        System.out.println("When inputting color, input left to right, top to bottom");
        System.out.println("Input the colors for bottom side");
        cube_filler(white);
        printSide(white);
        System.out.println("Input the colors for top side");
        cube_filler(yellow);
        printSide(yellow);
        System.out.println("Input the colors for front side");
        cube_filler(green);
        printSide(green);
        System.out.println("Input the colors for back side");
        cube_filler(blue);
        printSide(blue);
        System.out.println("Input the colors for right side");
        cube_filler(orange);
        printSide(orange);
        System.out.println("Input the colors for left side");
        cube_filler(red);
        printSide(red);
    }

    static void printBlueprint(int[][] side){
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(side[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    static void cube_filler(int[][] side) {
        String userString;
        int userInput = 0;
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                userString = myObj.next();
                while (!userString.equalsIgnoreCase("yellow") && !userString.equalsIgnoreCase("white")
                        && !userString.equalsIgnoreCase("green") && !userString.equalsIgnoreCase("orange")
                        && !userString.equalsIgnoreCase("blue") && !userString.equalsIgnoreCase("red")) {
                    System.out.println("Invalid Input. Try Again");
                    userString = myObj.next();
                }
                if (userString.equalsIgnoreCase("yellow")) {
                    userInput = 1;
                } else if (userString.equalsIgnoreCase("white")) {
                    userInput = 2;
                } else if (userString.equalsIgnoreCase("green")) {
                    userInput = 3;
                } else if (userString.equalsIgnoreCase("orange")) {
                    userInput = 4;
                } else if (userString.equalsIgnoreCase("blue")) {
                    userInput = 5;
                } else if (userString.equalsIgnoreCase("red")) {
                    userInput = 6;
                }
                side[i][j] = userInput;
            }
        }
    }

    static void printSide(int[][] side) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(side[i][j] == 1){
                    System.out.print("Y ");
                } else if(side[i][j] == 2){
                    System.out.print("W ");
                } else if(side[i][j] == 3){
                    System.out.print("G ");
                } else if(side[i][j] == 4){
                    System.out.print("O ");
                } else if(side[i][j] == 5){
                    System.out.print("B ");
                } else if(side[i][j] == 6){
                    System.out.print("R ");
                }
            }
            System.out.print("\n");
        }
    }

    static void printCube(Cube cube) {
        //System.out.println("This is the cube formated by \ntop\nleft front right back\nbottom");
        System.out.println("---------------------");
        System.out.println("Y - Yellow, W - White, G - Green, O - Orange, B - Blue, R - Red");
        System.out.println("---------------------");
        for (int i = 0; i < 2; i++) {
            System.out.print("      ");
            for (int j = 0; j < 2; j++) {
                if(cube.yellow[i][j] == 1){
                    System.out.print("Y ");
                } else if(cube.yellow[i][j] == 2){
                    System.out.print("W ");
                } else if(cube.yellow[i][j] == 3){
                    System.out.print("G ");
                } else if(cube.yellow[i][j] == 4){
                    System.out.print("O ");
                } else if(cube.yellow[i][j] == 5){
                    System.out.print("B ");
                } else if(cube.yellow[i][j] == 6){
                    System.out.print("R ");
                }
            }
            System.out.print("\n");
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(cube.red[i][j] == 1){
                    System.out.print("Y ");
                } else if(cube.red[i][j] == 2){
                    System.out.print("W ");
                } else if(cube.red[i][j] == 3){
                    System.out.print("G ");
                } else if(cube.red[i][j] == 4){
                    System.out.print("O ");
                } else if(cube.red[i][j] == 5){
                    System.out.print("B ");
                } else if(cube.red[i][j] == 6){
                    System.out.print("R ");
                }
                if (j == 1) {
                    System.out.print("| ");
                }
            }

            for (int j = 0; j < 2; j++) {
                if(cube.green[i][j] == 1){
                    System.out.print("Y ");
                } else if(cube.green[i][j] == 2){
                    System.out.print("W ");
                } else if(cube.green[i][j] == 3){
                    System.out.print("G ");
                } else if(cube.green[i][j] == 4){
                    System.out.print("O ");
                } else if(cube.green[i][j] == 5){
                    System.out.print("B ");
                } else if(cube.green[i][j] == 6){
                    System.out.print("R ");
                }
                if (j == 1) {
                    System.out.print("| ");
                }
            }

            for (int j = 0; j < 2; j++) {
                if(cube.orange[i][j] == 1){
                    System.out.print("Y ");
                } else if(cube.orange[i][j] == 2){
                    System.out.print("W ");
                } else if(cube.orange[i][j] == 3){
                    System.out.print("G ");
                } else if(cube.orange[i][j] == 4){
                    System.out.print("O ");
                } else if(cube.orange[i][j] == 5){
                    System.out.print("B ");
                } else if(cube.orange[i][j] == 6){
                    System.out.print("R ");
                }
                if (j == 1) {
                    System.out.print("| ");
                }
            }

            for (int j = 0; j < 2; j++) {
                if(cube.blue[i][j] == 1){
                    System.out.print("Y ");
                } else if(cube.blue[i][j] == 2){
                    System.out.print("W ");
                } else if(cube.blue[i][j] == 3){
                    System.out.print("G ");
                } else if(cube.blue[i][j] == 4){
                    System.out.print("O ");
                } else if(cube.blue[i][j] == 5){
                    System.out.print("B ");
                } else if(cube.blue[i][j] == 6){
                    System.out.print("R ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            System.out.print("      ");
            for (int j = 0; j < 2; j++) {
                if(cube.white[i][j] == 1){
                    System.out.print("Y ");
                } else if(cube.white[i][j] == 2){
                    System.out.print("W ");
                } else if(cube.white[i][j] == 3){
                    System.out.print("G ");
                } else if(cube.white[i][j] == 4){
                    System.out.print("O ");
                } else if(cube.white[i][j] == 5){
                    System.out.print("B ");
                } else if(cube.white[i][j] == 6){
                    System.out.print("R ");
                }
            }
            System.out.print("\n");
        }
    }
    static void uTurn(Cube cube){
        int copySide[][] = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                copySide[i][j] = cube.yellow[i][j];
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                cube.yellow[i][j] = copySide[1 - j][i];
            }
        }
        for(int i = 0; i < 2; i++){
            copySide[0][i] = cube.green[0][i];
            cube.green[0][i] = cube.orange[0][i];
            cube.orange[0][i] = cube.blue[0][i];
            cube.blue[0][i] = cube.red[0][i];
            cube.red[0][i] = copySide[0][i];
        }
    }

    static void upTurn(Cube cube){
        for(int i = 0; i < 3;i++){
            uTurn(cube);
        }
    }

    static void dTurn(Cube cube){
        int copySide[][] = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                copySide[i][j] = cube.white[i][j];
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                cube.white[i][j] = copySide[1 - j][i];
            }
        }
        for(int i = 0; i < 2; i++){
            copySide[1][i] = cube.green[1][i];
            cube.green[1][i] = cube.red[1][i];
            cube.red[1][i] = cube.blue[1][i];
            cube.blue[1][i] = cube.orange[1][i];
            cube.orange[1][i] = copySide[1][i];
        }
    }

    static void dpTurn(Cube cube){
        for(int i = 0; i < 3;i++){
            dTurn(cube);
        }
    }
    static void fTurn(Cube cube){
        int nArr[][] = new int[2][2];
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                nArr[i][j] = cube.green[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                cube.green[i][j] = nArr[1 - j][i];
            }
        }
        for(int i = 0; i < 2; i++){
            int temp1 = cube.orange[i][0];
            cube.orange[i][0] = cube.yellow[1][i];
            cube.yellow[1][i] = cube.red[1 - i][1];
            cube.red[1 - i][1] = cube.white[0][1 - i];
            cube.white[0][1 - i] = temp1;
        }
    }

    static void fpTurn(Cube cube){
        for(int i = 0; i < 3;i++){
            fTurn(cube);
        }
    }

    static void rTurn(Cube cube){
        int copySide[][] = new int[2][2];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                copySide[i][j] = cube.orange[i][j];
            }
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                cube.orange[i][j] = copySide[1 - j][i];
            }
        }
        for(int i = 0; i < 2; i++){
            copySide[i][1] = cube.blue[1 - i][0];
            cube.blue[1 - i][0] = cube.yellow[i][1];
            cube.yellow[i][1] = cube.green[i][1];
            cube.green[i][1] = cube.white[i][1];
            cube.white[i][1] = copySide[i][1];
        }
    }

    static void rpTurn(Cube cube){
        for(int i = 0; i < 3;i++){
            rTurn(cube);
        }
    }

    static void bTurn(Cube cube){
        int nArr[][] = new int[2][2];
        for(int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                nArr[i][j] = cube.blue[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                cube.blue[i][j] = nArr[1-j][i];
            }
        }
        for(int i = 0; i < 2; i++){
            int temp1 = cube.yellow[0][i];
            cube.yellow[0][i] = cube.orange[i][1];
            cube.orange[i][1] = cube.white[1][1 - i];
            cube.white[1][1 - i] = cube.red[1 - i][0];
            cube.red[1 - i][0] = temp1;
        }
    }

    static void bpTurn(Cube cube){
        for(int i = 0; i<3;i++){
            bTurn(cube);
        }
    }

    static void lTurn(Cube cube){
        int nArr[][] = new int[2][2];
        for(int i = 0; i<2; i++){
            for (int j = 0; j < 2; j++){
                nArr[i][j] = cube.red[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                cube.red[i][j] = nArr[1-j][i];
            }
        }
        for(int i = 0; i < 2; i++){
            int temp1 = cube.green[i][0];
            cube.green[i][0] = cube.yellow[i][0];
            cube.yellow[i][0] = cube.blue[1 - i][1];
            cube.blue[1 - i][1] = cube.white[i][0];
            cube.white[i][0] = temp1;
        }
    }
    static void lpTurn(Cube cube){
        for(int i = 0; i<3;i++){
            lTurn(cube);
        }
    }

    //NEW FUNCTIONS
//PBL methods
    static void AdjDia(Cube cube){
        rTurn(cube);
        upTurn(cube);
        rTurn(cube);
        fTurn(cube);
        fTurn(cube);
        rpTurn(cube);
        uTurn(cube);
        rpTurn(cube);
        System.out.println("Adj/Dia Formula: R U' R F F R' U R' ");
    }

    static boolean isAdjDia(Cube cube){
        if(cube.green[0][0] == cube.green[0][1] && cube.red[0][0] == cube.orange[0][1] && cube.green[1][0] == cube.blue[1][1] && cube.green[1][1] == cube.blue[1][0]){
            return true;
        }
        return false;
    }

    static void AdjAdj(Cube cube){
        rTurn(cube);
        rTurn(cube);
        upTurn(cube);
        bTurn(cube);
        bTurn(cube);
        uTurn(cube);
        uTurn(cube);
        rTurn(cube);
        rTurn(cube);
        upTurn(cube);
        rTurn(cube);
        rTurn(cube);
        System.out.println("Adj/Adj Formula: R2 U' B2 U2 R2 U' R2" );
    }

    static boolean isAdjAdj(Cube cube){
        if(cube.green[0][0] == cube.green[0][1] && cube.red[0][0] == cube.orange[0][1] && cube.green[1][0] == cube.green[1][1] && cube.red[1][0] == cube.orange[1][1]){
            return true;
        }
        return false;
    }

    static void DiaDia(Cube cube){
        rTurn(cube);
        rTurn(cube);
        fTurn(cube);
        fTurn(cube);
        rTurn(cube);
        rTurn(cube);
        System.out.println("Dia/Dia Formula: R2 F2 R2");
    }

    static boolean isDiaDia(Cube cube){
        if(cube.green[0][1] == cube.blue[0][0] && cube.green[0][0] == cube.blue[0][1] && cube.green[1][0] == cube.blue[1][1] && cube.green[1][1] == cube.blue[1][0]){
            return true;
        }
        return false;
    }

    static void Tperm(Cube cube){
        rTurn(cube);
        uTurn(cube);
        rpTurn(cube);
        upTurn(cube);
        rpTurn(cube);
        fTurn(cube);
        rTurn(cube);
        rTurn(cube);
        upTurn(cube);
        rpTurn(cube);
        upTurn(cube);
        rTurn(cube);
        uTurn(cube);
        rpTurn(cube);
        fpTurn(cube);
        System.out.println("T Permutation formula: R U R' U' R' F R2 U' R' U' R U R' F'");
    }

    static boolean isTperm(Cube cube){
        if (cube.green[0][1] == cube.blue[0][0] && cube.red[0][0] == cube.red[0][1] && cube.green[1][0] == cube.green[1][1] && cube.red[1][1] == cube.red[1][0] && cube.orange[1][1] == cube.orange[1][0]){
            return true;
        }
        return false;
    }

    static void Vperm(Cube cube){
        rpTurn(cube);
        uTurn(cube);
        rTurn(cube);
        upTurn(cube);
        rpTurn(cube);
        fpTurn(cube);
        upTurn(cube);
        fTurn(cube);
        rTurn(cube);
        uTurn(cube);
        rpTurn(cube);
        fTurn(cube);
        rpTurn(cube);
        fpTurn(cube);
        rTurn(cube);
        upTurn(cube);
        rTurn(cube);
        System.out.println("V Permutation formula: R' U R U' R' F' U' F R U R' F R' F' R U' R");
    }

    static boolean isVperm(Cube cube){
        if (cube.green[0][0] == cube.blue[1][0] && cube.green[0][1] == cube.blue[0][0] && cube.green[1][0] == cube.green[1][1] && cube.red[1][1] == cube.red[1][0] && cube.orange[1][1] == cube.orange[1][0]){
            return true;
        }
        return false;
    }

    static void pbl(Cube cube){
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 4; i++) {
                if (isAdjDia(cube)) {
                    AdjDia(cube);
                    break;
                } else if (isAdjAdj(cube)) {
                    AdjAdj(cube);
                    break;
                } else if (isDiaDia(cube)) {
                    DiaDia(cube);
                    break;
                } else if (isVperm(cube)) {
                    Vperm(cube);
                    break;
                } else if (isTperm(cube)) {
                    Tperm(cube);
                    break;
                } else
                    uTurn(cube);
            }
            uTurn(cube);
            dpTurn(cube);
        }
    }

    //orient last layer (oll) methods
    static void H(Cube cube){
        rTurn(cube);
        rTurn(cube);
        uTurn(cube);
        uTurn(cube);
        rTurn(cube);
        uTurn(cube);
        uTurn(cube);
        rTurn(cube);
        rTurn(cube);
        System.out.println("H Orientation formula: R2 U2 R U2 R2");
    }

    static boolean isH(Cube cube){
        if (cube.green[0][0] == 1 && cube.green[0][1] == 1 && cube.blue[0][0] ==1 && cube.blue[0][1] == 1){
            return true;
        }
        return false;
    }

    static void Pi(Cube cube){
        rTurn(cube);
        uTurn(cube);
        uTurn(cube);
        rTurn(cube);
        rTurn(cube);
        upTurn(cube);
        rTurn(cube);
        rTurn(cube);
        upTurn(cube);
        rTurn(cube);
        rTurn(cube);
        uTurn(cube);
        uTurn(cube);
        rTurn(cube);
        System.out.println("Pi Orientation formula: R U2 R2 U' R2 U' R2 U2 R");
    }

    static boolean isPi(Cube cube){
        if (cube.green[0][1] == 1 && cube.blue[0][0] == 1 && cube.red[0][0] == 1 && cube.red[0][1] == 1){
            return true;
        }
        return false;
    }

    static void Antisune(Cube cube){
        rTurn(cube);
        uTurn(cube);
        uTurn(cube);
        rpTurn(cube);
        upTurn(cube);
        rTurn(cube);
        upTurn(cube);
        rpTurn(cube);
        System.out.println("Antisune Orientation formula: R U U R' U' R U' R'");
    }

    static boolean isAntisune(Cube cube){
        if (cube.green[0][0] == 1 && cube.yellow[0][1] == 1 && cube.orange[0][0] == 1 && cube.red[0][0] == 1){
            return true;
        }
        return false;
    }

    static void Sune(Cube cube){
        rTurn(cube);
        uTurn(cube);
        rpTurn(cube);
        uTurn(cube);
        rTurn(cube);
        uTurn(cube);
        uTurn(cube);
        rpTurn(cube);
        System.out.println("Sune Orientation formula: R U R' U R U U R' ");
    }

    static boolean isSune(Cube cube){
        if (cube.green[0][1] == 1 && cube.yellow[1][0] == 1 && cube.orange[0][1] == 1 && cube.blue[0][1] == 1){
            return true;
        }
        return false;
    }

    static void L(Cube cube){
        fTurn(cube);
        rpTurn(cube);
        fpTurn(cube);
        rTurn(cube);
        uTurn(cube);
        rTurn(cube);
        upTurn(cube);
        rpTurn(cube);
        System.out.println("L Orientation formula: F R' F' R U R U' R'");
    }

    static boolean isL(Cube cube){
        if (cube.green[0][0] == 1 && cube.yellow[0][0] == 1 && cube.yellow[1][1] == 1 && cube.orange[0][1] == 1){
            return true;
        }
        return false;
    }

    static void T(Cube cube){
        rTurn(cube);
        uTurn(cube);
        rpTurn(cube);
        upTurn(cube);
        rpTurn(cube);
        fTurn(cube);
        rTurn(cube);
        fpTurn(cube);
        System.out.println("T Orientation formula: R U R'U' R' F R F' ");
    }

    static boolean isT(Cube cube){
        if (cube.green[0][0] == 1 && cube.yellow[0][1] == 1 && cube.yellow[1][1] == 1 && cube.blue[0][1] == 1){
            return true;
        }
        return false;
    }

    static void U(Cube cube){
        fTurn(cube);
        rTurn(cube);
        uTurn(cube);
        rpTurn(cube);
        upTurn(cube);
        fpTurn(cube);
        System.out.println("U Orientation formula: F R U' R' U' F'");
    }

    static boolean isU(Cube cube){
        if (cube.yellow[0][1] == 1 && cube.yellow[1][1] == 1 && cube.red[0][0] == 1 && cube.red[0][1] == 1){
            return true;
        }
        return false;
    }

    static void oll(Cube cube){
        for (int i = 0; i<4; i++){
            if (isH(cube)){
                H(cube);
                break;
            } else if (isPi(cube)){
                Pi(cube);
                break;
            } else if (isAntisune(cube)){
                Antisune(cube);
                break;
            } else if (isSune(cube)){
                Sune(cube);
                break;
            } else if (isL(cube)){
                L(cube);
                break;
            } else if(isT(cube)){
                T(cube);
                break;
            } else if(isU(cube)){
                U(cube);
                break;
            }
            uTurn(cube);
        }
    }

    static void finish(Cube cube){
        while (cube.green[0][0] != cube.green[1][0]){
            uTurn(cube);
        }
    }

}