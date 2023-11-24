import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEntrevistados = 10;
        int excelenteContador = 0;
        int ruimContador = 0;

        for (int i = 1; i <= totalEntrevistados; i++) { //laço de repetição para os entrevistados
            System.out.println("Entrevistado #" + i);
            System.out.print("Digite o nome: "); 
            String nome = scanner.next();//usuário irá digitar seu nome
            System.out.print("Digite a idade: "); 
            int idade = scanner.nextInt(); //usuário irá digitar sua idade
            System.out.print("Opinião sobre o atendimento (1-EXCELENTE, 2-BOM, 3-RUIM): "); 
            int opiniao = scanner.nextInt(); //usuário irá dar sua avaliação de atendimento

            // estrutura de decisão para contar a quantidade de cada resposta
            switch (opiniao) {
                case 1:
                    excelenteContador++;
                    break;
                case 2:
                    ruimContador++;
                    break;
            }
        }

        System.out.println("Resultado da Pesquisa:"); //impressão do resultado da pesquisa 
        System.out.println("Quantidade de respostas EXCELENTES: " + excelenteContador);
        System.out.println("Quantidade de respostas RUINS: " + ruimContador);

    }
}
