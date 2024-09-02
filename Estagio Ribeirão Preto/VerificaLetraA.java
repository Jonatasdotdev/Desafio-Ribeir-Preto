import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int contador = contarOcorrenciasDeA(texto);

      
        if (contador > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não foi encontrada na string.");
        }

        scanner.close();
    }

    public static int contarOcorrenciasDeA(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
