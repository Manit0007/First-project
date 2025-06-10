public class largestamong3 {

    public static void main(String[] args) {
       int a = 10, b = 20, c = 15; // Example numbers
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest among the three.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest among the three.");
        } else {
            System.out.println(c + " is the largest among the three.");
        }      
    }
}