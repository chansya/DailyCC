import java.util.Scanner;

public class Mar13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        sc.close();
        System.out.println(MinToSec(min));
    }
    public static int MinToSec(int min){
        int result = 0;
        return min * 60;
    }
}
