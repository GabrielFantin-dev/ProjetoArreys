import java.util.ArrayList;

public class ListaDeConvidados {

    public void mostrarMensagem() {
        System.out.println("Lista de Convidados da Festa!");
    }

    public void listarNomes(ArrayList<String> lista) {
        for (String nome : lista) {
            System.out.println(nome);
        }
    }

    public boolean verificarConvidado(ArrayList<String> lista, String nomeProcurado) {
        for (String nome : lista) {
            if (nome.equalsIgnoreCase(nomeProcurado)) {
                return true;
            }
        }
        return false;
    }
}