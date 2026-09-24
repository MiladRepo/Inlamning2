import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    private static HashMap<String, String> _map = new HashMap<String, String>(){{
        put("A", ".-");
        put("B", "-...");
        put("C", "-.-.");
        put("D", "-..");
        put("E", ".");
        put("F", "..-.");
        put("G", "--.");
        put("H", "....");
        put("I", "..");
        put("J", ".---");
        put("K", "-.-");
        put("L", ".-..");
        put("M", "--");
        put("N", " -.");
        put("O", "---");
        put("P", ".--.");
        put("Q", "--.-");
        put("R", ".-.");
        put("S", "...");
        put("T", "-");
        put("V", "...-");
        put("W", ".--");
        put("X", "-..-");
        put("Y", "-.--");
        put("Z", "--..");
    }};

    public static String Decrypt(String code) {

        var word = "";
        var splitted = code.split(" ");
        for (int i = 0; i < splitted.length; i++) {
            if(!_map.containsValue(splitted[i])){
                    word += "_";
                    continue;
                }
            for (var item : _map.entrySet()) {
                if(item.getValue().equals(splitted[i])){
                    word += item.getKey();
                    continue;
                }
            }
        }
        return word;
    }

    public static String Encrypt(String text) {

        var code = "";
        var splitted = text.replace(" ", "").toUpperCase().split("");
        for (int i = 0; i < splitted.length; i++) {  
            if(_map.containsKey(splitted[i])){
                code += _map.get(splitted[i]) + " ";
                continue;
            }
            code += "_ ";
        }
        return code.trim();
    }

}
