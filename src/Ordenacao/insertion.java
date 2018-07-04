
package Ordenacao;

public class insertion {
    
    public static int[] insertionSort(int [] v){
        
              int j, i , x;
        
                for (j= 1; j< v.length; j++){
                  x = (int) v[j];

                   for (i= j-1; i >= 0 && v[i]> x ; --i) 
                      v[i+1] = v[i];
                       v[i+1]= x;
               
                }
              return v;               
          }     
    }
