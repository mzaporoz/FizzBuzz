public class Multiples {
    public static void main(String[] args) {
        //prints how many multiples of 3 or 5 there are below 1000
        int c = 0; //number count

        for (int i = 0; i < 1000; i++) {
            boolean multipleOf3 = i % 3 == 0;
            boolean multipleOf5 = i % 5 == 0;

            if (multipleOf3 || multipleOf5) {
                c++;
            }
        }
        System.out.println(c);

    }
}
