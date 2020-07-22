package BT_Optional.dophuctapthuattoan;

public class AlgorithmComplexity {

        public static void main(String[] args) {
            System.out.println("Enter a string:");
           // String inputString = "CodeGymRasingtheBar";
            String inputString = "CodeGym Rasing the Bar";

            int[] frequentChar = new int[255];
            for (int i = 0; i < inputString.length(); i++) {
                int ascii = (int) inputString.charAt(i);
                frequentChar[ascii] += 1;
            }

            int max = 0;
            char character = (char) 255;
            for (int j = 0; j < 255; j++) {
                if (frequentChar[j] > max) {
                    max = frequentChar[j];
                    character = (char) j;
                }
            }
            System.out.println("The most appearing is '" + character + "' with a frequency of " + max + " times");


        }

}
