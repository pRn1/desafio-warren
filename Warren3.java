import java.util.*;

public class Warren3{
    static boolean interromper = false;
    static boolean verifica = true;
    static ArrayList<Integer> adicionarDigitos = new ArrayList<>();
    static ArrayList<Integer> digitos = new ArrayList<>();
    static ArrayList<Integer> primeiroVetor = new ArrayList<>();
    static int menorDigito = 0;
    static int maiorDigito = 0;
    static int n;
    
    public static void solucao(){
        ArrayList<Integer> vetorSolucao = new ArrayList<>();
        ArrayList<Integer> vetorOpcao = new ArrayList<>();
        int numero = 0, menor = 0, maior = 0, x = 0;
        
        
        if(adicionarDigitos.isEmpty()){
            while(numero < n){
                adicionarDigitos.add(digitos.get(0));
                primeiroVetor.add(digitos.get(0));
                numero += digitos.get(0);       
            }
        }
        vetorSolucao = adicionarDigitos;
        
        for(int i = 0; i < vetorSolucao.size(); i++){
            if(menor == 0 || vetorSolucao.get(i) < menor){
                menor = vetorSolucao.get(i);
            }
        }
        
        for(int i = 0; i < digitos.size(); i++){
            if(digitos.get(i) > menor){
                maior = digitos.get(i);
                break;
            }
        }
        
        for(int i = 0; i < vetorSolucao.size(); i++){
            if(vetorSolucao.get(i) == menor){
                vetorOpcao.add(maior);
                break;
            }
            vetorOpcao.add(vetorSolucao.get(i));     
        }
        
        for(int i = 0; i < vetorOpcao.size(); i++){
            x += vetorOpcao.get(i);
        }
        while(x < n){
            vetorOpcao.add(digitos.get(0));
            x += digitos.get(0);
        }
        
        if(verifica == true && menorDigito == primeiroVetor.size()){
            System.out.println(primeiroVetor);     
        }
        verifica = false;
        
        vetorSolucao.clear();
        for(int i = 0; i < vetorOpcao.size(); i++){
            vetorSolucao.add(vetorOpcao.get(i));
        }
        
        if(x == n && menorDigito == vetorSolucao.size()){
            System.out.println(vetorOpcao);
            interromper = true;
        }
        
        for(int i = 0; i < vetorSolucao.size(); i++){
            if(vetorSolucao.get(i) < maiorDigito && maiorDigito != digitos.get(0)){
               solucao();  
            } 
        }
    }

    public static void main(String[] args){
        
        Scanner leitor = new Scanner(System.in);

        int tamanhoVetor, posicao = 0;
        
        System.out.println("Informe um numero n: ");
        n = leitor.nextInt();
        
        System.out.println("Informe quantos numeros comporao vetor: ");
        tamanhoVetor = leitor.nextInt();
        
        for(int i = 0; i < tamanhoVetor; i++){
            System.out.println("Informe a " + (posicao + 1) + 
                               " ª posicao do vetor.");
            digitos.add(leitor.nextInt());
            posicao++;
        
        }
        
        Collections.sort(digitos);
        
        for(int i = 0; i < digitos.size(); i++){
            if( i + 1 == digitos.size()){
                maiorDigito = digitos.get(i);
            }
        }
        
        System.out.println(n);
        
        while(interromper == false){
            adicionarDigitos.clear();
            primeiroVetor.clear();
            menorDigito++;
            solucao();
        }
    }
}