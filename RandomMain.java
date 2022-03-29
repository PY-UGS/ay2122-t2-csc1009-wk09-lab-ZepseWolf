
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RandomMain {
    @Test
    public static void main(String[] args) throws Exception {
        RandomCharacter rm = new RandomCharacter();

        for(int i = 0 ; i< 15 ; i++)
        {
            assertTrue(Character.isLowerCase(RandomCharacter.getRandomLowerCaseLetter()));
            assertTrue(Character.isUpperCase(RandomCharacter.getRandomUpperCaseLetter()));
            assertTrue(Character.isDigit(RandomCharacter.getRandomDigitCharacter()));
            assertTrue(Character.isLetterOrDigit(RandomCharacter.getRandomCharacter()));
            assertTrue(RandomCharacter.getPrimeNum());
        }
        System.out.println("Test of main completed");

    }
}
