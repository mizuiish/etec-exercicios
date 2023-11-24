public class facultativo {
    public static void main(String[] args) throws Exception {

        int numeroInicial = 6;
        int numeroFinal = 10;
        int multiplicador = 1;
        int resultado; //valor não declarado aqui para que acompanhe os valores do numeroInicial dentro da função
       

        while (numeroInicial <= numeroFinal) {
            System.out.println("Tabuada do " + numeroInicial + ":");
            while (multiplicador <= numeroFinal) {
                resultado = numeroInicial * multiplicador; 
                System.out.println(numeroInicial + " x " + numeroFinal + " = " + resultado);
                multiplicador++;
            } 
            
            multiplicador = 1; //reinicia o multiplicador para a próxima tabuada
            numeroInicial++;
        }
    }
}

/* Algoritmo 

Algoritmo Tabuada
   Declare 
   numeroInicial Como Inteiro
   numeroFinal Como Inteiro
   multiplicador Como Inteiro
   resultado Como Inteiro

   numeroInicial <- 6
   numeroFinal <- 10
   multiplicador <- 1

   Enquanto numeroInicial <= numeroFinal Faça
      Escreva "Tabuada do ", numeroInicial, ":"

      Enquanto multiplicador <= 10 Faça
         resultado <- numeroInicial * multiplicador
         Escreva numeroInicial, " x ", multiplicador, " = ", resultado
         multiplicador <- multiplicador + 1
      Fim Enquanto

      multiplicador <- 1
      numeroInicial <- numeroInicial + 1

      Escreva (linha em branco) 
   Fim Enquanto
Fim Algoritmo
*/