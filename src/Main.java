import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números inteiros");

            int escolha = 0;

            while(escolha != 3){
                System.out.println("--MENU--");
                System.out.println(" 1 - área do quadrado ");
                System.out.println(" 2 - área do círculo ");
                System.out.println(" 3 - encerrar ");
                escolha = sc.nextInt();
                if (escolha == 1){
                    System.out.println("Digite o lado do quadrado ");
                    double lado = sc.nextInt();
                    double areaDoQuadrado = lado * lado;
                    System.out.println(areaDoQuadrado);
                } else if(escolha == 2){
                    double pi = 3.14;
                    System.out.println(" Digite o raio do circulo ");
                    double raio = sc.nextDouble();
                    double areaDoCirculo = pi * raio * raio;
                    System.out.println(areaDoCirculo);
                } else if(escolha == 3) {
                    System.out.println("programa encerrado!");
                }

            }

            sc.close();

        }
    }
