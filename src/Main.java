import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String continuar;

        do{
            System.out.println("Escolha um numero para realizar a tabuada: ");
            number = sc.nextInt();
            sc.nextLine();

            System.out.println("A tabuada do número"+ number + " é: ");

            for (int i = 0;i < 11; i++){
                System.out.println(i + " x " +number+ " = "+(i * number));
            }

            System.out.println("Deseja continuar s/n");
            continuar = sc.nextLine();

        } while(continuar.equalsIgnoreCase("s"));

        System.out.println("Fim do programa");
        sc.close();
    }
}