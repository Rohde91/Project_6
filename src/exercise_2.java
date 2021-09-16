public class exercise_2 {

    public static void main(String[] args) {
        //TODO Lav eventuelt Scanner, så man selv kan indtaste et tal

        double result = squareRoot(16);
        System.out.println(result);
    }

    public static double squareRoot(double a)
    {
        double x = a/2;
        double oldX = (-1);
        
        //TODO Kan bruge while loop som gør det kortere og har samme effekt

        for(int i = 0; Math.abs(oldX - x) > 0.0001; /*i < 10;*/ i++) {

            //oldX bliver brugt som den gamle værdi af x til udregningerne, så den kan fortsætte i løkken.
            oldX = x;
            x = ( x + a / x ) / 2;

        }

        return x;
    }
}
