import java.util.Scanner;

public class Calculadora {
    double n1, n2;

        void preencher(){
            System.out.println("Digite o primeiro número");
            Scanner sc = new Scanner(System.in);
            n1 = sc.nextDouble();
            System.out.println("Digite o segundo número");
            n2 = sc.nextDouble();

        }//preenher

    double somar(){return n1+n2;}

    double subtrair(){
        return n1-n2;
    }

    double multiplicar(){
        return n1*n2;
    }

    double dividir(){
        return n1/n2;
    }

    double expo() {
           return Math.pow(n1,n2);
    }
}
