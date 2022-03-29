
import static org.junit.Assert.*;
import org.junit.Test;
public class RandomTest {

    @Test
    public final void testLower(){
        for(int i = 0 ; i< 15 ; i++){
            assertTrue(Character.isLowerCase(RandomCharacter.getRandomLowerCaseLetter()));
        }
    }

    @Test
    public final void testUpper(){
        for(int i = 0 ; i< 15 ; i++){
            assertTrue(Character.isUpperCase(RandomCharacter.getRandomUpperCaseLetter()));
        }
    }

    @Test
    public final void testDigit(){
        for(int i = 0 ; i< 15 ; i++) {
            assertTrue(Character.isDigit(RandomCharacter.getRandomDigitCharacter()));
        }
    }

    @Test
    public final void testChar() throws Exception {
        for(int i = 0 ; i< 15 ; i++) {
            assertTrue(Character.isLetterOrDigit(RandomCharacter.getRandomCharacter()));
        }
    }

    @Test
    public final void testPrime() throws Exception {
        for(int i = 0 ; i< 15 ; i++) {
            assertTrue(RandomCharacter.getPrimeNum());
        }
    }
}
