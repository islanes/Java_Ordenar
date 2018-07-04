package Ordenacao;

import java.util.Arrays;


public class Ordenar {
    
    private static long tempo1;
    private static long tempo2;
    private static long tempo3;
      
    public static void Resultado(int [] arrayDesordenado){
            //Copiando o vetor desordenado em vetores para ordenação do dados
            
            int [] vet1 = Arrays.copyOf(arrayDesordenado, arrayDesordenado.length); 

            int [] vet2= Arrays.copyOf(arrayDesordenado, arrayDesordenado.length);

            int [] vet3= Arrays.copyOf(arrayDesordenado, arrayDesordenado.length); 

            int [] Ordenado1= new int[arrayDesordenado.length];
            int [] Ordenado2= new int[arrayDesordenado.length];
            int [] Ordenado3= new int[arrayDesordenado.length];
            
            
              //Imprimindo o arquivo:       
              System.out.println(">>> Vetor Desordenado:");
              for(int i=0 ; i< arrayDesordenado.length; i++){
              System.out.println(arrayDesordenado[i]);
              }
            
            //Chamando os metodos de ordenação e passando como parametro o vetor para ordenar 
            Ordenado1= quickSort(vet1);
                        
            Ordenado2= Insertionsort(vet2);
                 
            Ordenado3= Bubblesort(vet3);

                        

               //Imprimindo o vetor ordenado
              System.out.println("Vetor Ordenado com BubbleSort: ");
               for(int i=0 ; i< Ordenado3.length; i++){
                 System.out.println(Ordenado3[i]);

              }
               //Imprimindo o vetor ordenado
              System.out.println("Vetor Ordenado com InsertionSort: ");
               for(int i=0 ; i< Ordenado2.length; i++){
                 System.out.println(Ordenado2[i]);

              }
                            //Imprimindo o vetor ordenado
              System.out.println("Vetor Ordenado com QuickSort: ");
               for(int i=0 ; i< Ordenado1.length; i++){
                 System.out.println(Ordenado1[i]);

              }
               
               
                System.out.println("Total de Dados Ordenados: "+arrayDesordenado.length);
                System.out.println("Tempo de Processamento do BubbleSort: " + tempo1/ 1000000.0 + "ms");
                System.out.println("Tempo de Processamento de InsertionSort: " + tempo2/ 1000000.0 + "ms");
                System.out.println("Tempo de Processamento de QuickSort: " + tempo3/ 1000000.0 + "ms");
               //Mostrando o mais metodo rapido 
                tempo(); 
        
    } 
        
    public static int[] Bubblesort(int[] array) {
           
        long tempoinicial = System.nanoTime();
        array = bubble.bubblesort(array);
        long tempofinal = System.nanoTime();
        tempo1= tempofinal - tempoinicial;
   
        
        return array;
    }
    
    
     public static int[] Insertionsort(int[] array) {
           
        long tempoinicial = System.nanoTime();
        array = insertion.insertionSort(array);
        long tempofinal = System.nanoTime();
        tempo2= tempofinal - tempoinicial;
        
        return array;
    }
     
     
       public static int[] quickSort(int[] array) {
        long tempoinicial = System.nanoTime();
        array = QuickSort.quicksort(array, 0, (array.length - 1));
        long tempofinal = System.nanoTime();
        tempo3 = tempofinal - tempoinicial;
        
        return array;
    }
      
     public static void tempo(){
            
            if (tempo1<tempo2 && tempo1<tempo3) {
                System.out.println("O Metodo mais rapido é o BubbleSort\nTempo utilizado: "+tempo1/1000000.0 + "ms");
                   }
            
            else if(tempo2<tempo1 && tempo2<tempo3){
                System.out.println("O Metodo mais rapido é o InsertionSort\nTempo utilizado: "+tempo2/1000000.0  + "ms");
                   }
          
            else{
              
                 System.out.println("O Metodo mais rapido é o QuickSort\nTempo utilizado: "+tempo3/1000000.0 + "ms");
            }
             }
}

