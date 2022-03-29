
import java.util.Random;
import java.util.Scanner;

public class RandomCharacter {
    private static Random random = new Random();
    public static char getRandomLowerCaseLetter(){
        char value = (char) (random.nextInt(26) + 97);
        return value;
    }
    public static char getRandomUpperCaseLetter(){
        char value = (char) (random.nextInt(26) + 65);
        return value;
    };
    public static char getRandomDigitCharacter(){
        char value = Character.forDigit(random.nextInt(10),10);
        return (char)(value);
    };
    public static char getRandomCharacter() throws Exception {
        int chose = random.nextInt(3);
        switch (chose){
            case 0:
                return getRandomLowerCaseLetter();
            case 1:
                return getRandomUpperCaseLetter();
            case 2:
                return (char)getRandomDigitCharacter();
            default:
                throw new Exception("Error");
        }
    };

    public static boolean getPrimeNum() throws Exception{
        int[] nums= {2,3,5,7};

        return (checkForPrime(nums[random.nextInt(4)]));
    }

    static boolean checkForPrime(int inputNumber)
    {
        boolean isItPrime = true;

        if(inputNumber <= 1)
        {
            isItPrime = false;

            return isItPrime;
        }
        else
        {
            for (int i = 2; i<= inputNumber/2; i++)
            {
                if ((inputNumber % i) == 0)
                {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }
}
