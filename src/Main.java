public class Main {

    //Below is a declared constant
    public static final int SIZE = 7;

    //this is the main where all the module calls are placed
    public static void main(String[] args) {
        triangle();
        middle();
        diamonds1();
        diamonds2();
        middle();
        diamonds1();
        diamonds2();
        middle();
        triangle();
    }

    //this function contains a for loop that print out slashes that increase iteration
    // that is frequently used in a couple modules
    public static void slashes(int p){
        for (int r=1; r<=p; r++){
            System.out.print("/\\");
        }
    }

    //The function below contains a for loop that prints a single or double dot
    // (decrease iteration)
    public static void dots(int p, String print) {
        for (int o = 1; o <=SIZE - p; o++){
            System.out.print(print);
        }
    }


    //The function below contains a for loop that prints out a single or double dot
    public static void dots2(int t, String print) {
        for (int v=1; v<= t-1; v++){
            System.out.print(print);
        }
    }

    //The function below contains a for loop that prints slashes pointing down (increase iteration)
    public static void slash1(int t) {
        for (int u = 1; u <= SIZE + 1 - t; u++) {
            System.out.print("\\/");
        }
    }

    //The function below also contains a for loop that prints slashes which point down (increase iteration)
    public static void slash2(int j, String print){
        for (int i = 1; i <= j; i++) {
            System.out.print(print);
        }
    }

    //The function below prints the top of the rocket
    public static void triangle() {
        for (int j = 1; j <= (SIZE * 2) - 1; j++) {
            for (int m = 1; m <= (SIZE * 2) - j; m++) {
                System.out.print(" ");
            }
            slash2(j, "/");
            System.out.print("**");
            slash2(j, "\\");
            System.out.println();
        }
    }

    //The function below prints out the mid-section that is used between sections of the rockets
    public static void middle() {
        System.out.print("+");
        for(int n=1; n<= SIZE*2; n++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }


    //The function below prints the top and bottom of the rocket
    public static void diamonds2(){
        for(int p=1; p<= SIZE; p++) {
            System.out.print("|");

            dots(p, ".");
            slashes(p);
            dots(p, "..");
            slashes(p);
            dots(p, ".");

            System.out.print("|");
            System.out.println();
        }
    }

    //The function below prints out the middle boxes of the rocket
    public static void diamonds1(){
        for(int t=1; t<= SIZE; t++){
            System.out.print("|");
            dots2(t,".");
            slash1(t);
            dots2(t, "..");
            slash1(t);
            dots2(t, ".");
            System.out.println("|");
        }
    }
}