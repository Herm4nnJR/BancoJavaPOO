public class ContaUniversitaria extends Conta {
    private static int SEQUENCIAL = 5010;
    public ContaUniversitaria(String cliente){
        super.cliente = cliente;
        super.agencia = ANGECIA_UNIVERSITARIA;
        super.numero = SEQUENCIAL ++;
        super.creditoLimite = 99.99;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("***Extrato da Conta Corrente***");
        super.imprimirInfosComuns();
    }
}
