package Models;
import java.util.*;

public class Contador {
	public static void Inicializar(String[] args) {
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			exception.Error();
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for(int i = 0; contagem > i; i++){
        System.out.println("Este é o número " + (i+1));
    }
		//realizar o for para imprimir os números com base na variável contagem
	}
}
