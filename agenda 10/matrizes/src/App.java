import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        
        // laço para preencher a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String leia = JOptionPane.showInputDialog("Digite o valor para matriz[" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(leia);
            }
        }
        
        // for para calcular a soma dos elementos
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
        }
        
        // Exibir a matriz e a soma
        String mensagem = "Matriz 5x5:\n";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mensagem += matriz[i][j] + "\t";
            }
            mensagem += "\n";
        }
        mensagem += "Soma dos elementos: " + soma;
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
