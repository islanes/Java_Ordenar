package Ordenacao;

class DadosGerados {
    
    public int[] Gerar(int quant){
    
  int [] numvetor = new int [quant];
        
                    for (int i = 0; i <numvetor.length; i++) {
                      numvetor[i] = (int) (Math.random()*quant);
               }
                    
                 
                    
        return numvetor;
    
    }
 
}
    

