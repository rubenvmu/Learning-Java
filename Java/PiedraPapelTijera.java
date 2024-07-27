
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        System.out.println("Piedra, Papel o Tijera contra BOT");
        playGame();
    }
    public static void playGame() {
        String[] options = {"Piedra", "Papel", "Tijera"};
        Random random = new Random();
        String computerChoice = options[random.nextInt(options.length)];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu opción (piedra, papel o tijera): ");
        String userChoice = scanner.nextLine();

        if (userChoice.equals(computerChoice)) {
            System.out.println("Empate!");
        } else if ((userChoice.equals("Piedra") && computerChoice.equals("Tijera")) ||
                   (userChoice.equals("Papel") && computerChoice.equals("Piedra")) ||
                   (userChoice.equals("Tijera") && computerChoice.equals("Papel"))) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste! La computadora eligió " + computerChoice);
        }
    }
}