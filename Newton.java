// Newton Raphson Method / Newton SQRT Method
//It is used to find better and better approximations to the roots of a real-valued function.
// In this method we start with a rough guess of a sqrt using a formula:
// root = (x + (n/x)) / 2

package maths;

public class Newton {
    public static void main(String[] args) {
        System.out.println(sqrt(40));

    }
    static double sqrt(double n){
        double x = n; // Initial Guess
        double root;

        while (true){
            root = (x + (n/x)) / 2;

        // Stop when successive estimates differ by less than 0.5
            if (Math.abs(root - x) < 0.5){
                break;
            }
            x = root; // Update Guess
        }
        return root;
    }

}
