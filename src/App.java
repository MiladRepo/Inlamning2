import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var scanner = new Scanner(System.in);
        var answer = "";
        do{
            System.out.println("Tryck 1 för att få ut kod, tryck 2 för att få ut bokstäver, Skriv \"exit\" för att avsluta");
            answer = scanner.next();
            switch (answer) {
            case "1":
                System.out.println("Skriv in ditt ord:");
                answer = scanner.next();
                var code = MorseCode.Encrypt(answer);
                System.out.println("Din kod är: " + code);
                break;
            case "2":
                System.out.println("Skriv in din kod:");
                answer = scanner.next();
                var word = MorseCode.Decrypt(answer);
                System.out.println("Ditt ord är: " + word);
                break;
            case "exit":
                System.out.println("Avslutar programmet");
                break;
            default:
                break;
            }
        }while(!answer.equals("exit"));
        
        scanner.close();
    }
}
