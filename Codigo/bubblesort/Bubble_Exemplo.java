package bubblesort;

/**
 * maior >=
 * menor <=
 * @author TayLima
 */public class Bubble_Exemplo {
    
    public static void main(String[] args) {
         // String Array[] = {"Denylson","Taynnar","Elias","Henrique","Dionis","Bia"};
         int Array[] = {3,5,9,7,6,8,2,8,17,18,8,7,74,1,78,1,8,21,7,5,5,1,8,1,8,2,87,178,2,8,9,89,1,8,8};
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
