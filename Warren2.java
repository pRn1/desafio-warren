import java.util.Scanner;
import java.util.Arrays;

public class Warren2 {
    

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int x , tempoChegada, qtdAlunos, normal = 0, atraso = 0;
        int[] chegada;
   
        System.out.println("Informe a quantidade de alunos da turma: ");
        qtdAlunos = leitor.nextInt();
        
     
        System.out.println("Informe o limite de alunos atrasados: ");
        x = leitor.nextInt();
        
        chegada = new int[qtdAlunos];
        
        for(int i = 0; i < qtdAlunos; i++){
            System.out.println("Informe o tempo de chegada do aluno: ");
            tempoChegada = leitor.nextInt();
            chegada[i] = tempoChegada;
            if (tempoChegada <= 0 ){
                normal++;
            }else{
                atraso++;
            }
        }
        System.out.println("Limite alunos atrasados = " + x);
        System.out.println("Tempos de chegada em relacao ao inicio da aula = " 
                + Arrays.toString(chegada));
        
        if(atraso > x){
            System.out.println("Aula cancelada, " + normal + " alunos chegaram a tempo para a aula e, " + atraso + " chegaram atrasados");
        }else{
            System.out.println("Aula normal, " + normal + " alunos chegaram a tempo para a aula e, " + atraso + " chegaram atrasados.");
        }
   
    }
}
