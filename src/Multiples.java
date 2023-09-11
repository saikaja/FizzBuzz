public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int counter = 0;
        while (i < 1000)
        {
            boolean multipleof3 = i % 3 == 0;
            boolean multipleof5 = i % 5 == 0;
            // Print our appropriate result.
            if (multipleof3) {
                counter++;


            } else if (multipleof5) {
                counter++;

            }
            i++;}
        System.out.println(counter);
        }
    }
