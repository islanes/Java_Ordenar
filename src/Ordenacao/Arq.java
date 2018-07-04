
package Ordenacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class Arq {
 
    public int[] lerArquivo(String endereco) throws FileNotFoundException, IOException {
 
        File arquivo = new File(endereco);
        int counter = 0;
        int [] array = new int[100];
 
     
    try{
        FileReader filereader = new FileReader(arquivo); 
       BufferedReader bufferreader = new BufferedReader(filereader);
            
           
            while (bufferreader.ready()) {
         
                array[counter] = Integer.parseInt(bufferreader.readLine());
               
                counter++;
            }
            
            
                bufferreader.close();
 
                filereader.close();
           }
             catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("ERRO: " + e);
             
             }
    
            System.out.println(); 
   
            
         return array;
        
        
    } 
    
}
