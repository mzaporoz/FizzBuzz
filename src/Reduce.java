public class Reduce {
    //prints how many steps it takes to reach 0 if you start at 100
    //if n is even, divide by 2, if n is odd, subtract 1. repeat.
    public static void main(String[] args) {
        int c = 0; //step count
        int i = 100;
        while (i > 0) {
            if (i % 2 == 0) {
                i = i / 2;
                c++;
            }
            else {
                i = i - 1;
                c++;
            }
        }
        System.out.println(c);
    }
}
