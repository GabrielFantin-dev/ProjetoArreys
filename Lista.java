import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        // Criando a lista de convidados
        ArrayList<String> convidados = new ArrayList<>();

        
        convidados.add("Alice");
        convidados.add("Bob");
        convidados.add("Charlie");

        
        ListaDeConvidados lista = new ListaDeConvidados();

        
        lista.mostrarMensagem();

        
        lista.listarNomes(convidados);

        
        boolean encontrado = lista.verificarConvidado(convidados, "Alice");

        System.out.println("Alice está na lista? " + encontrado);
    }
}

