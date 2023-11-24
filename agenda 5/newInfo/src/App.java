import javax.swing.JOptionPane;

public class App {
    public static void main(String args[]) {

        String nome;
        nome = JOptionPane.showInputDialog("Entre com seu nome: ");
        JOptionPane.showMessageDialog(null, "O seu nome é " + nome + ".");

        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        if (idade >= 60 && idade < 80) {
            JOptionPane.showMessageDialog(null,
                    "Sua idade é " + idade + ", você será encaminhando para a fila de prioridade.");

        } else {
            if (idade >= 80) {
                JOptionPane.showMessageDialog(null,
                        "Sua idade é " + idade + ", você será encaminhado para a fila 80+.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Sua idade é " + idade + ", você será encaminhado para a fila comum.");
            }
        }

    }
}
