import java.util.Scanner;

public class SPCar {

    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        double uno = 30;
        double palio = 35;
        double jeep = 50;
        double valorCarro = 0;
        String modeloCarro;
        double valorDiaria = 50;
        double valorKm = 0.20;
        double diasLocacao;
        double kmPercorridos;
        double diariaTotal;
        double valorKmTotal;
        double precoFinal;

        System.out.println("SPCar. Esse programa irá calcular o valor total a ser pago.");
        System.out.println("Digite o modelo do carro (uno, palio ou jeep).");
        modeloCarro = leitor.nextLine();

        switch (modeloCarro.toLowerCase()) {
            case "uno":
                valorCarro = uno;
                break;
            case "palio":
                valorCarro = palio;
                break;
            case "jeep":
                valorCarro = jeep;
                break;
        }

        System.out.println("Digite quantos dias de locação.");
        diasLocacao = leitor.nextInt();
        System.out.println("Digite a quantidade de quilometros percorridos.");
        kmPercorridos = leitor.nextInt();

        diariaTotal = diasLocacao * valorDiaria;
        valorKmTotal = kmPercorridos * valorKm;
        precoFinal = valorCarro + diariaTotal + valorKmTotal;

        System.out.println("Total a pagar: R$" + precoFinal);

    }
}
