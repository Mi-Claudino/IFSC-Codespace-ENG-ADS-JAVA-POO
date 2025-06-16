import java.util.Scanner;

public class B1_1Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInt = entrada.nextInt();
        System.out.println("Você digitou o inteiro: " + numeroInt);

        System.out.print("Digite um número decimal (double): ");
        double numeroDouble = entrada.nextDouble();
        System.out.println("Você digitou o double: " + numeroDouble);


        entrada.close();
    }
}

