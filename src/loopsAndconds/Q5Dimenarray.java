package loopsAndconds;
import java.util.Arrays;
public class Q5Dimenarray {
    public static void main(String[] args) {
        int NumArray[] = {6, 2, 16, 10, 25, 7, 3, 5, 13, 88};
        int sum = 0;
        double avg = 0.0;
        for (int i : NumArray) {
            sum += i;
        }
        avg = ((double)sum /10);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);
    }
}
