import java.util.Scanner;

public class atividade {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Idade do Aluno: ");
        byte idade = sc.nextByte();
        System.out.print("Numero de Faltas: ");
        short faltas = sc.nextShort();
        System.out.print("Id: ");
        int id = sc.nextInt();
        System.out.print("Codigo Nacional De Estudante: ");
        long cne = sc.nextLong();
        System.out.print("Nota do Trabalho: ");
        float notat = sc.nextFloat();
        System.out.print("Nota da Prova Final: ");
        double notap = sc.nextDouble();
        System.out.print("Conceito Final do Aluno: ");
        char conceitofinal = sc.next().charAt(0);
        System.out.print("Aluno está approvado (true/false");
        boolean aprovado = sc.nextBoolean();


        System.out.println();
        System.out.println("--- Dados do Aluno Fictício ---");

        System.out.println("Idade do Aluno: " + idade + " anos");
        System.out.println("Número de Faltas: " + faltas);
        System.out.println("Matrícula ID: " + id);
        System.out.println("Código Nacional do Estudante: " + cne);
        System.out.println("Nota do Trabalho: " + notat);
        System.out.println("Nota da Prova Final: " + notap);
        System.out.println("Conceito Final do Aluno: " + conceitofinal);
        System.out.println("Aluno está Aprovado? " + aprovado);

        sc.close();


    }
}