public class main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.preencher();

        System.out.println("Soma: "+calc.somar());
        System.out.println("Subtrair: "+calc.subtrair());
        System.out.println("Multiplicação: "+calc.multiplicar());
        System.out.println("Dividir: "+calc.dividir());
        System.out.println("Exponenciação: "+calc.expo());


    }
}
