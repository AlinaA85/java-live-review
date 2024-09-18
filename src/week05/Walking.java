package week05;

public class Walking {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Step " + i);
            if (i % 3 == 0) {
                System.out.println("Jump " + i);
            } else {
                System.out.println("Step " + i);
            }

        }
        System.out.println("=============================================");

        /*
        Declare variables steps and assign 50
        When we reach step 35, stop walking
         */
        int steps = 50;
        for (int i = 1; i <= steps; i++) {
            System.out.println("Step " + i);
            if(i==35){
                System.out.println("Stop walking");
                break; // exit loop
            }
        }



    }
}
