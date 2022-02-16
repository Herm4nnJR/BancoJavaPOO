import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> contas;

    Banco(String nome){
        this.nome = nome;
        contas = new ArrayList<Conta>();
    }

    public void vincularContaBanco(Conta conta){
        contas.add(conta);
    }

    public void listaClientes(){
        for(int i = 0 ; i < contas.size(); i++){
            contas.get(i).imprimirExtrato();
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
