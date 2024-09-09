public class Multiples {
    public static void main(String[] args) {
        int c = 0; //start count

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
