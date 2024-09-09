/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        //with while loop
        int i = 1;

        while (i < 100) {
            doFizzBuzz(i);
            i++;

        }
//        //with for loop
//        for (int i = 1; i < 100; i++) { //When creating variable i, type is declared before
//            doFizzBuzz(i);
//
//        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0; //Create boolean object stating whether i % 3 is T/F
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { //'&&' is 'and' in python
            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        return i;
    }
}
