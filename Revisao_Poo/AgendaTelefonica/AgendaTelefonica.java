package AgendaTelefonica;
import java.util.ArrayList;
public class AgendaTelefonica {
    private ArrayList<Contato> contatos;
    public AgendaTelefonica() {
        contatos = new ArrayList<>();
    }

    public  void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public void removerContato(Contato contato){
        for (Contato c:contatos){
            if (contato.getNome().equalsIgnoreCase(c.getNome())) {
                contatos.remove(c);
            }
        }
    }
    public String buscarContato(String nome) throws Exception{
        for (Contato c: contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c.getNumeroTelefone();
            }
        }
        throw new RuntimeException("numero nao encontrado");
    }

    public  void listaDeContatos(){
        for (Contato c: contatos) {
            System.out.println(c.getNome() +"\t"+ c.getNumeroTelefone()+"\n");
        }
    }






}
