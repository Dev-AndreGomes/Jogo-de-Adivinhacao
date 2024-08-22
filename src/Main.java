import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroGerado = new Random().nextInt(100);
        int tentativa = 0;
        int numeroDigitado = 0;

        System.out.println("Tente advinhar um numero de 0 a 100 em 5 tentativas");
        for (int i = 0; i < 5; i++) {
            tentativa ++;
            System.out.println(tentativa + "º tentiva");
            numeroDigitado = input.nextInt();
            if (numeroDigitado == numeroGerado){
                System.out.println("Parabéns você acertou em " + tentativa + " tentativas");
            } else {
                if (numeroDigitado < numeroGerado){
                    System.out.println("O número é maior que " + numeroDigitado);
                } else {
                    System.out.println("O numero é menor que " + numeroDigitado);
                }
            }

            if (tentativa == 5 && numeroDigitado != numeroGerado){
                System.out.println("Você não conseguiu acertar, o número era: " + numeroGerado + ", tente novamente e se divirta!");
            }
        }

    }
}