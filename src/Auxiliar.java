import java.util.Scanner;


public class Auxiliar {
    public double[] preencher(){
        System.out.println("Digite o primeiro número");
        Scanner sc = new Scanner(System.in);
        double n1 [] = new double[2];
        n1[0] = sc.nextDouble();
        System.out.println("Digite o segundo número");
        n1[1] = sc.nextDouble();
        return n1;
    }//preenher


}//Auxiliar

