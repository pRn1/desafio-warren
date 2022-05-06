public class Warren1{
  
    public static int reverso(int n){
    
        int reverso = 0;
        
        while (n > 0){
            reverso = 10 * reverso + n % 10;
            n /= 10;
        }
    return reverso;
}
    public static boolean verificaImpares ( int soma){
        boolean resposta = false;
        
        String numero = String.valueOf(soma); 
        char[] digitos = numero.toCharArray();
        
        for(int i = 0; i < digitos.length; i++){
            resposta = digitos[i] % 2 != 0;
            if(resposta == false){
                break;
            }
    }

    return resposta;
}
    public static void main(String[] args) {
        
       	int n, tamanho = 0; 
 
        for(n = 0; n < 1000000; n++){
            int soma = n + reverso(n);
                if( n % 10 != 0){ 
                    if(verificaImpares(soma) == true){
                        System.out.println(n);
                        tamanho++; 
                    }
                }
            }
        System.out.println(tamanho);  
    }     
  }
