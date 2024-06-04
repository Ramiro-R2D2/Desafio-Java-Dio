package Models;

public class ParametrosInvalidosException extends RuntimeException {
    public void Error(){
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
}
