package vetores;
import javax.swing.JOptionPane;

public class multiVetores {
    public static void main(String[] args){
        int valor [] = new int [20];
        int contador;
        String numeros;
        int multiplicador;

        for(contador = 0; contador < 5; contador++){
            valor[contador]= Integer.parseInt(JOptionPane.showInputDialog("Digite o " +(contador+1)+"º valor"));
        }
        numeros = "Os números digitados foram: \n";
        for(contador = 0; contador <5; contador++){
            if(valor[contador] % 2 == 0){
                multiplicador = valor[contador] * 2;
                numeros = numeros + String.valueOf(multiplicador) + "\n";
            }else{
                numeros = numeros + String.valueOf(valor[contador]) + "\n";
            }

            JOptionPane.showMessageDialog(null, numeros);
        }

    }
    
}
