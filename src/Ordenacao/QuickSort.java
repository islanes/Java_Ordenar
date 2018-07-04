
package Ordenacao;


public class QuickSort {
         //////***********************Algoritmo para Ordenar
    
                        public static int separa(int[] v, int p , int r){
                            int c= v[p], i= p+1, j= r, t;
                                while (i <=j){
                                if (v[i] <= c) ++i;
                                else if (c< v[j]) --j;
                                else{
                                    t= v[i]; v[i] = v[j]; v[j] = t;
                                    ++i; --j;

                                }
                                }
                        
                            v[p] = v[j] ; v[j] = c;
                            return j;
                            
                         
                        }
//***************
                        public static int[] quicksort (int []v,int p, int r ){
                           

                                int j;
                                if (p< r){
                                j= separa (v,p,r);
                                quicksort (v,p,j-1);
                                quicksort (v,j+1,r);
                                }
                             return v;

                        }
}
