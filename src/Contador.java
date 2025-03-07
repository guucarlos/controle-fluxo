import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite o primeiro parametro "); 
       int parametroUm = sc.nextInt();
       System.out.println("Digite o segundo parametro");
       int parametroDois = sc.nextInt();

       sc.close();

       try {
        contar(parametroUm, parametroDois);  
       } catch (ParametrosInvalidosException exception) {
            System.out.println("o segundo parâmetro deve ser maior que o primeiro");
       }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        for(int i = 0; i <= contagem; i++){
            System.out.println("Imprimindo numero" + i);
        }
    }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
}
