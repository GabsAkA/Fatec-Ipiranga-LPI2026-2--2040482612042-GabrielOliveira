    import java.util.Scanner;
public class atividadeE6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome de usuário: ");
        String texto = sc.nextLine();

        if (texto != null && !texto.isEmpty()) {
            System.out.println("Usuário válido fornecido: " + texto);
        } else {
            System.out.println("Entrada rejeitada: O texto está nulo ou vazio.");
        }

        sc.close();
    }
}

