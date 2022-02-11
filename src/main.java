public class main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Auxiliar aux = new Auxiliar();

        double[] valor;
        valor = aux.preencher();

        double soma = calc.somar(valor[0],valor[1]);
        double subtracao = calc.subtrair(valor[0],valor[1]);
        double multiplicacao = calc.multiplicar(valor[0],valor[1]);
        double divisao = calc.dividir(valor[0],valor[1]);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

    }
}
