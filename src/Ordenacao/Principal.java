package Ordenacao;

import java.io.IOException;
import java.util.Scanner;


public class Principal {
    
    
     public static void main(String[] args) throws IOException{

       Scanner ler = new Scanner(System.in);
       String Resp;
       //test com do
      do{
      
        System.out.println("Programa de Ordenação de Dados.");
        System.out.println("Escolha Qual tipo De dados serão Utilizados:");
        System.out.println("1- Gerados pelo programa.");
        System.out.println("2- Ler de um arquivo .txt.");

        String lendo=ler.next(); 
        
         switch(lendo){
         case "1":
              System.out.println("Você digitou uma operação 1."); 
              System.out.println("Escolha a quantidade que sera gerada: \n1- 100\n2- 1000\n3- 10000");
             
              String op = ler.next();
              
             //escolhendo a quantidade de dados q serão gerados:
             switch(op){
                 case "1":
              System.out.println("Total de dados gerados: 100");
              DadosGerados d = new DadosGerados(); //instanciando objetos do tipo DadosGerados e Ordenar
              Ordenar ordena = new Ordenar();
              ordena.Resultado( d.Gerar(100));//instancia o obj 
                  break;
                      
                      
            case "2":
              System.out.println("Total de dados gerados: 1.000");    
              DadosGerados d2 = new DadosGerados(); 
              Ordenar ordena2 = new Ordenar();
              ordena2.Resultado( d2.Gerar(1000));
                   break;
                
            case "3":
              System.out.println("Total de dados gerados: 10.000");    
              DadosGerados d3 = new DadosGerados(); 
              Ordenar ordena3 = new Ordenar();
              ordena3.Resultado( d3.Gerar(10000));
                     break;
            
                     
              default:
                System.out.println("Você digitou uma operação inválida.");
             }
              
        break;//finalizando o caso 1
             
        //Opção de abrir arquivo txt.
         case "2":
             String endereco;
              System.out.println("Você digitou uma operação 2\nO Arquivo sera Aberto.");
              Arq arquivo = new Arq();
              Ordenar ordena5 = new Ordenar();//int[] vetDesordenado = arquivo.lerArquivo("C:\\testedado\\r.txt");
              try{
              System.out.println("Digite o caminho do arquivo\nExemplo de caminho C:\\testedado\\r.txt: ");
              endereco= ler.next();
              
           
              int[] vetDesordenado = arquivo.lerArquivo(endereco);
              ordena5.Resultado(vetDesordenado);
         }catch (IOException e) {
                    
                System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
                
                System.out.println("O programa deve ser executado novamente\nRetorne quando o caminho correto do arquivo.");
               
                              
            } 
              catch(NumberFormatException erro){
             System.out.printf("Formato incorreto de dados: %s.\n", erro.getMessage());
            
              }
             break;
             
        default:
                System.out.println("Você digitou uma operação inválida.");   
         }
          //Resp= "s";
          System.out.println("Você deseja continuar?\nDigite: S/N");
          Resp= ler.next();

     }while(Resp.equals("S") || Resp.equals("s"));
      if(Resp != "s" || Resp != "S"){
          System.out.println("Programa encerrado com sucesso");  
      System.exit(0);
      }
       
}
}
    
    