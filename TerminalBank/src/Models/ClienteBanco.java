package Models;
import java.text.DecimalFormat;

public class ClienteBanco {
    protected int _NumeroCliente;
    protected String _Agencia;
    protected Float _Saldo;
    protected String _NomeCliente;
    public ClienteBanco(int NumeroCliente, String Agencia, Float Saldo, String NomeCliente){
        _NumeroCliente = NumeroCliente;
        _Agencia = Agencia;
        _Saldo = Saldo;
        _NomeCliente = NomeCliente;
    }
}