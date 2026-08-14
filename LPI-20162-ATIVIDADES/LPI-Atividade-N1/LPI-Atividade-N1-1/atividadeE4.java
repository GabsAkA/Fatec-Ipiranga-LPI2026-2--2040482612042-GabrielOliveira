import java.util.Scanner;

public class atividadeE4 {
    public static final String NOME_INSTITUICAO = "FATEC Ipiranga";
    public static final int PRAZO_MAXIMO_DIAS = 14;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de dias do empréstimo: ");
        final int diasEmprestimo = scanner.nextInt();

        System.out.println("Instituição: " + NOME_INSTITUICAO);
        System.out.println("Prazo Máximo Padrão: " + PRAZO_MAXIMO_DIAS + " dias.");

        final int diasCalculados = calcularDiasDevolucao(diasEmprestimo);
        System.out.println("Dias calculados para devolução: " + diasCalculados);



        scanner.close();
    }
    public static int calcularDiasDevolucao(final int diasSolicitados) {

        if (diasSolicitados > PRAZO_MAXIMO_DIAS) {
            return PRAZO_MAXIMO_DIAS;
        }
        return diasSolicitados;
    }
}

