package Models;

public class BankSystem {
    private String Agencia;
    private String Nome;
    private int NumeroCliente;
    private Float Saldo;
    public BankSystem(ClienteBanco Client){
        Agencia = Client._Agencia;
        Nome = Client._NomeCliente;
        NumeroCliente = Client._NumeroCliente;
        Saldo = Client._Saldo;
    }
    public String Notification(){
        String mensage ="Olá $Nome, obrigado por criar uma conta em nosso banco, sua agência é $Agencia, conta $NumeroCliente e seu saldo $Saldo já está disponível para saque";
        return mensage;
    }
}
