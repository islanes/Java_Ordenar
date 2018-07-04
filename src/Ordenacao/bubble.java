
package Ordenacao;

public class bubble {
     
    public static int[] bubblesort(int[]vet){
              
                 int j, i , aux ;
         
                      
                    for (i= 0 ; i< (vet.length-1); i++)
                        {
                           for (j= 1; j< vet.length ; j++)
                            {
                                if ( vet[j] < vet[j-1])
                                {
                                    aux = vet[j];
                                    vet[j] = vet[j-1];
                                    vet[j-1]= aux;
                                }
                            }
                 
                    }   
                        
             return vet;
     
     
     
          } 
}
     
 
         
         
  
    

