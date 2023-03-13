import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new java.util.Scanner(System.in);
        int valor1, valor2, valor3;
        System.out.println("Informe o primeiro valor: ");
        valor1 = sc.nextInt();
        if (valor1 < 0 || valor1 > 10) { 

            System.out.println("O valor informado nao atende a regra definida!"); 
            
            System.exit(0);
        }
        System.out.println("Informe o segundo valor: ");
        valor2 = sc.nextInt();;
        if (valor2 < 0 || valor2 > 10) { 

            System.out.println("O valor informado nao atende a regra definida!"); 
            
            System.exit(0); 
        }
        System.out.println("Informe o terceiro valor: ");
        valor3 = sc.nextInt();
        if (valor3 < 0 || valor3 > 10) { 

            System.out.println("O valor informado nao atende a regra definida!"); 
            
            System.exit(0); 

        }

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O primeiro numero foi o maior = " + valor1);

        }

        if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O segundo numero foi o maior = " + valor2);

        }

        if (valor3 > valor1 && valor3 > valor2) {
            System.out.println("O terceiro numero foi o maior = " + valor2);

        }

        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println("O primeiro numero foi o menor = " + valor1);

        }

        if (valor2 < valor1 && valor2 < valor3) {
            System.out.println("O segundo numero foi o menor = " + valor2);

        }

        if (valor3 < valor1 && valor3 < valor2) {
            System.out.println("O terceiro numero foi o menor = " + valor2);

        }


        

    }
}
