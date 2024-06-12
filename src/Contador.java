import java.util.Scanner;

public class Contador {
    public static void main(String[] args)  {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            //System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            System.out.println(e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        } else {
            //realizar o for para imprimir os números com base na variável contagem
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i <= contagem; i++) {
                System.out.println("Numeros com base na variável contagem " + i);
            }

            //realizar o for para imprimir Intervalo entre Parametro um e Parametro dois
            for (int x = (parametroUm+1); x < parametroDois; x++) {
                System.out.println("Intervalo entre Parametro um e Parametro dois " + x);
            }
        }
    }
}