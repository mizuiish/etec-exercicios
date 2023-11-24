public class App {
    public static void main(String[] args) {
        for (int i = 6; i <= 10; i++) { //estrutura de repetição da tabuada de 6 a 10
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) { //estrutura de repetição para calcular o valor "i" de 1 ao 10
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado); //imprime resultado
            }
            System.out.println(); // imprime uma linha em branco entre as tabuadas
        }
    }
}
