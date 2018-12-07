package bubblesort;

/**
 * maior >=
 * menor <=
 * @author TayLima
 */public class Bubble_Exemplo {
    
    public static void main(String[] args) {
         int Array[] = {3,6,2,1,8,4};
         int aux;
         boolean controle;
         
         for (int i = 0; i < Array.length; i++) {
             controle = true;
             for (int j = 0; j < (Array.length - 1); j++) {
                 if (Array[j] > Array[j + 1]) {
                     aux = Array[j];
                     Array[j] = Array[j + 1];
                     Array[j + 1] = aux;
                     controle = false;
                 }
             }
             if (controle) {
                 break;
             }
        }
         
         for (int i = 0; i < Array.length; i++) {
             System.out.println(Array[i] + " "); // ler/ percorrer vetor
        }
    }   
}
