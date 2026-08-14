import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class atividadeE7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor A (ex.: 1.00): ");
        String valorA = scanner.nextLine();

        System.out.print("Informe o valor B (ex.: 0.90): ");
        String valorB = scanner.nextLine();

        System.out.print("Informe o valor total da compra: ");
        String valorCompra = scanner.nextLine();

        System.out.print("Informe o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        double dA = Double.parseDouble(valorA);
        double dB = Double.parseDouble(valorB);
        double dResult = dA - dB;

        System.out.println("--- Demonstração da Imprecisão do padrão IEEE 754 (double) ---");
        System.out.println("Resultado esperado de " + valorA + " - " + valorB + " seria 0.10");
        System.out.println("Resultado real obtido com double: " + dResult);
        System.out.println();

        BigDecimal bgA = new BigDecimal(valorA);
        BigDecimal bgB = new BigDecimal(valorB);
        BigDecimal bgResult = bgA.subtract(bgB);

        System.out.println("--- Correção exata utilizando java.math.BigDecimal ---");
        System.out.println("Resultado com BigDecimal (String Constructor): " + bgResult);
        System.out.println();

        BigDecimal bgCompra = new BigDecimal(valorCompra);
        BigDecimal bgParcelas = new BigDecimal(numeroParcelas);
        BigDecimal valorParcela = bgCompra.divide(bgParcelas, 2, RoundingMode.HALF_UP);

        System.out.println("--- Divisão de parcelas com Escala e RoundingMode.HALF_UP ---");
        System.out.println("Compra de R$ " + valorCompra + " dividida em " + numeroParcelas + "x: R$ " + valorParcela + " por parcela.");

        scanner.close();
    }
}
