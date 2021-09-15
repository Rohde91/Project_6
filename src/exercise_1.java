public class exercise_1 {
    public static void main(String[] args) {
        loop(10);
    }

    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
        // Output: 10, 5, 6, 3, 4, 2
        // The while loop will run till i==0 by dividing whit 2 repeading until the value is 0
        // If the loop cant divide by 2 whitout getting a odd number, it will add 1 to i
        // Fx. it cant divide 5 by 2 whitout getting odd, so it then adds 1 to be able to divide
        // test made whit n=100 and n=57, both whitout errors.

        // n can be any positive number due to this, even or odd
        // if it starts whit an odd number, it will just start at the else
    }
}
