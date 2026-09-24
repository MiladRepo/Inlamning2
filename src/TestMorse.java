import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

public class TestMorse {

    @Test
    public void testFromMorseCode(){

        var code = ".-";
        var letter = MorseCode.Decrypt(code);

        assertEquals("A", letter);
    }

    @Test 
    public void testFromLetter(){
        
        var letter = "A";
        var morseCode = MorseCode.Encrypt(letter);

        assertEquals(".-", morseCode);
    }

    @Test 
    public void testCodeToWord(){

        var code = ".... . .---";
        var word = MorseCode.Decrypt(code);

        assertEquals("HEJ", word);
    }

    @Test 
    public void testWordToCode(){

        var word = "Hej";
        var code = MorseCode.Encrypt(word);

        assertEquals(".... . .---", code);
    }

    @Test 
    public void testLongWordToCode(){
        var word = "Hello World";
        var code = MorseCode.Encrypt(word);

        assertEquals(".... . .-.. .-.. --- .-- --- .-. .-.. -..", code);
    }

    @Test 
    public void testWrongLetters(){
        var word = "Hellå Wörld";
        var code = MorseCode.Encrypt(word);

        assertEquals(".... . .-.. .-.. _ .-- _ .-. .-.. -..", code);
    }
    @Test 
    public void testWrongCode(){
        var code = "..-- . .----";
        var word = MorseCode.Decrypt(code);

        assertEquals("_E_", word);
    }
}
