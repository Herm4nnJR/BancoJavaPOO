public class ContaCorrente extends Conta {
    
    private static int SEQUENCIAL = 1010;
    public ContaCorrente(String cliente){
        super.cliente = cliente;
        super.agencia = AGENCIA_CORRENTE;
        super.numero = SEQUENCIAL ++;
        super.creditoLimite = 1000;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("***Extrato da Conta Corrente***");
        super.imprimirInfosComuns();
    }

    
}
