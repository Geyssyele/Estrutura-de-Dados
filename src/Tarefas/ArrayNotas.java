/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefas;

/**
 *
 * @author 20171TINF0137
 */
public class ArrayNotas {
    public static void main(String[] args) {
        String nomeAluno[] = new String[9];
        nomeAluno[0] = "geyssy";
        nomeAluno[1] = "gilvan";
        nomeAluno[2] = "wendell";
        nomeAluno[3] = "vitoria";
        nomeAluno[4] = "fael";
        nomeAluno[5] = "claudemir";
        nomeAluno[6] = "jesse";
        nomeAluno[7] = "dany";
        nomeAluno[8] = "nicholas";

        StringBuilder sb = new StringBuilder(); //modifica uma cadeia de caracteres sem criar um novo objeto\par
        
        for (int i = 0; i < nomeAluno.length; i++) {
            String word = nomeAluno[i];
            word = word.substring(0, 1).toUpperCase() + word.substring(1);//o método substring retorna um subconjunto de uma string entre um inidce e outro,ou ate o final da string.\par
            sb.append("\n").append(word);
            
            
            //metodo da classe StrinBuilder
            // O append serve pra adiconar algo a ultima linha no fim do StrinBuilder
            
        
        }
        System.out.println(sb.toString().replaceFirst(" ",""));
            // ToString é metodo para retormar uma representação string do ojeto.
            // ReplaceFirt é o metodo de substituilçao de caracteres que foram apresentado na expressão regular no código
        
    }
}
    
