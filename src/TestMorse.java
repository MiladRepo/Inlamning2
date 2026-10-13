import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

public class TestMorse {

    @Test
    public void testFromMorseCode(){

        String code = ".-";
        String letter = MorseCode.Decrypt(code);

        assertEquals("A", letter);
    }

    @Test 
    public void testFromLetter(){
        
        String letter = "A";
        String morseCode = MorseCode.Encrypt(letter);

        assertEquals(".-", morseCode);
    }

    @Test 
    public void testFromSmallLetter(){
        
        String letter = "a";
        String morseCode = MorseCode.Encrypt(letter);

        assertEquals(".-", morseCode);
    }

    @Test 
    public void testCodeToWord(){

        String code = ".... . .---";
        String word = MorseCode.Decrypt(code);

        assertEquals("HEJ", word);
    }

    @Test 
    public void testWordToCode(){

        String word = "Hej";
        String code = MorseCode.Encrypt(word);

        assertEquals(".... . .---", code);
    }

    @Test 
    public void testLongWordToCode(){
        String word = "Hello World";
        String code = MorseCode.Encrypt(word);

        assertEquals(".... . .-.. .-.. --- .-- --- .-. .-.. -..", code);
    }

    @Test 
    public void testWrongLetters(){
        String word = "Hellå Wörld";
        String code = MorseCode.Encrypt(word);

        assertEquals(".... . .-.. .-.. _ .-- _ .-. .-.. -..", code);
    }
    @Test 
    public void testWrongCode(){
        String code = "..-- . .----";
        String word = MorseCode.Decrypt(code);

        assertEquals("_E_", word);
    }
}
