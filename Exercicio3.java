import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();
        
        String invertida = inverterString(entrada);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String entrada) {
        char[] caracteres = entrada.toCharArray();
        int inicio = 0;
        int fim = entrada.length() - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}