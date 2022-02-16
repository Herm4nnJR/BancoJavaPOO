public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 8010;
    public ContaPoupanca(String cliente){
        super.cliente = cliente;
        super.agencia = AGENCIA_POUPANCA;
        super.numero = SEQUENCIAL ++;
    }
    @Override
    public void imprimirExtrato(){
        System.out.println("***Extrato da Conta Poupanca***");
        super.imprimirInfosComuns();
    }
}
