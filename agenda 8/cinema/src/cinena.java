
import javax.swing.JOptionPane;

public class cinena {
    public static void main(String[] args) throws Exception {
        
        int clientes = 0;
        int idade;
        String avaliacao;
        int avaliacaoA = 0;
        int idadeRuim = 0;
        int avaliacaoE = 0;
        double mediaRuim = 0;
        int somaIdadeRuim = 0;
        double porcentagemPessimo;

        do {
            
            idade = Integer.parseInt(JOptionPane.showInputDialog("Pesquisa de satisfação! Você é o cliente número '" + clientes + "'. Por favor informe sua idade:"));
            
            avaliacao = JOptionPane.showInputDialog("Qual sua avaliação sobre o filme? (A- ÓTIMO, B- BOM, C-REGULAR, D- RUIM, E- PÉSSIMO)").toUpperCase();

            switch (avaliacao) {
                case "A":
                    avaliacaoA++;
                    break;
                case "D":
                    idadeRuim++;
                    somaIdadeRuim += idade;
                    break;
                case "E":
                    avaliacaoE++;
                    break;
                default:
                    break;
            }
            clientes++; 
        } while (clientes <= 40);
        

        System.out.println("Avaliações Ótimas: " + avaliacaoA + ".");
        mediaRuim = (double) somaIdadeRuim / idadeRuim;
        System.out.println("Média de idade dos clientes com avaliação Ruim: " + Math.round(mediaRuim) + "."); //Math.round usado para tirar o "".0" do resultado da operação matemática
        porcentagemPessimo = (double) avaliacaoE / clientes * 100;
        System.out.println("Percentual de avaliações Péssimo: " + Math.round(porcentagemPessimo) + "%.");
    }

}
