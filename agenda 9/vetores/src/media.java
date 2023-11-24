import javax.swing.JOptionPane;

public class media {
    public static void main(String[] args){

        double nota[] = new double [5];
        double soma = 0;
        double media;
        int contador;

        //laço para ler as notas do aluno
        for(contador = 0; contador < 5; contador++){
            nota[contador] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " +(contador+1)+ " nota do aluno."));
        }
        //laço para somar as notas do aluno
        for(contador = 0; contador < 5; contador++){
            soma = soma + nota[contador];
        }
        media = soma/5;
        if(media >= 5){
            JOptionPane.showMessageDialog(null,"O aluno tirou " +Math.round(media)+ ", portando está APROVADO.");
        }else{
            JOptionPane.showMessageDialog(null,"O aluno tirou "+Math.round(media)+", portando está REPROVADO.");
        }
    }
    
}
