public abstract class Conta implements IConta{
    
    protected static final int AGENCIA_CORRENTE = 1;
    protected static final int AGENCIA_POUPANCA = 7;
    protected static final int ANGECIA_UNIVERSITARIA = 9;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected String cliente;
    protected double creditoLimite;

    @Override
    public void sacar(double valor){
        if (saldo + creditoLimite >= valor){
            saldo -= valor;
        }
        else
            System.out.println(String.format("%s seu Saldo é Insuficiente! Saque nao realizado",this.cliente));
    }
    @Override
    public void depositar(double valor){
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta ContaDestino){
        if (saldo + creditoLimite >= valor){
        this.sacar(valor);
        ContaDestino.depositar(valor);
        }
        else System.out.println(String.format("%s seu Saldo é Insuficiente! Transferencia nao realizada",this.cliente));
    }
    
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


}
