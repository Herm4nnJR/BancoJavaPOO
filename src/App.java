public class App {
    public static void main(String[] args) throws Exception {
        Banco banco1 = new Banco("Banco do Hermann");
        
        ContaCorrente ccorrente1 = new ContaCorrente("Josias");
        banco1.vincularContaBanco(ccorrente1);
        ContaPoupanca cpoupanca1 = new ContaPoupanca("Theo");
        banco1.vincularContaBanco(cpoupanca1);
        ContaUniversitaria cuniversitaria1 = new ContaUniversitaria("Jully");
        banco1.vincularContaBanco(cuniversitaria1);
        ContaCorrente ccorrente2 = new ContaCorrente("Lucas");
        banco1.vincularContaBanco(ccorrente2);
        ContaPoupanca cpoupanca2 = new ContaPoupanca("Bruna");
        banco1.vincularContaBanco(cpoupanca2);
        ContaUniversitaria cuniversitaria2 = new ContaUniversitaria("Gabriela");
        banco1.vincularContaBanco(cuniversitaria2);

        ccorrente1.depositar(2000);
        cpoupanca1.depositar(1000);
        cuniversitaria1.depositar(320);
        ccorrente2.depositar(11532.23);
        cpoupanca2.depositar(1400.53);

        ccorrente1.transferir(1732.15, cpoupanca1);
        ccorrente2.transferir(12000, cuniversitaria2);
        cpoupanca1.transferir(739.55, cuniversitaria1);
        ccorrente1.sacar(3000);
        ccorrente2.transferir(10000, ccorrente1);

        banco1.listaClientes();
    }
}
