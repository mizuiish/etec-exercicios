import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
    
    String [] convidados = new String[10];
    String listaLadoEsq = "";
    String listaLadoDir = "";
    int i;

    for(i=0; i < 10; i++){
        convidados[i] = JOptionPane.showInputDialog("Nome do " + (i+1) + "º convidado");
    }

    listaLadoEsq = "Lista dos convidados do lado esquerdo do salão: \n";
    listaLadoDir = "Lista dos convidados do lado direito do salão: \n";

    for(i=0; i < 10; i++){
        if(i%2==0){
            listaLadoEsq = listaLadoEsq + convidados [i]+"\n";
        } else{
            listaLadoDir = listaLadoDir + convidados[i]+"\n";
        }
    }
        JOptionPane.showMessageDialog(null, listaLadoEsq+"\n\n\n"+listaLadoDir);
    }
}

