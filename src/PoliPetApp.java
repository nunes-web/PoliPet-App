import java.util.ArrayList;

public class PoliPetApp {
    public static void main(String[] args) {
        ArrayList<Cachorro> listaCachorros = new ArrayList<>();
        ArrayList<Gato> listaGatos = new ArrayList<>();
        ArrayList<Passaro> listaPassaros = new ArrayList<>();
        ArrayList<Domesticaveis> listaDomesticaveis = new ArrayList<>();

        // Teste Cachorros
        Cachorro c1 = new Cachorro("Doguin", 20.0, 0, true, true);
        Cachorro c2 = new Cachorro("Doguin Caro", 15.5, 0, false, false);

        listaCachorros.add(c1);
        listaCachorros.add(c2);

        // for each teste
        for (Cachorro c : listaCachorros) {
            System.out.println("Nome: " + c.getNome());
            System.out.println("Peso: " + c.getPeso());
            System.out.println("Custo Diário: R$ " + c.calcularCustoDiario());
            System.out.println("Som: " + c.emitirSom());
            System.out.println("Interação: " + c.interagir());
            System.out.printf("Precisa de passeio? ");
            if (c.precisaPasseio()) {
                System.out.println("Sim");
            } else {
                System.out.println("Não");
            }
            System.out.println();
        }

        // Teste Gatos
        Gato g1 = new Gato("Merlin", 5, 0);
        Gato g2 = new Gato("Morgana", 25.5, 0);

        listaGatos.add(g1);
        listaGatos.add(g2);

        // for each teste
        for (Gato g : listaGatos) {
            System.out.println("Nome: " + g.getNome());
            System.out.println("Peso: " + g.getPeso());
            System.out.println("Custo Diário: R$ " + g.calcularCustoDiario());
            System.out.println("Som: " + g.emitirSom());
            System.out.println("Interação: " + g.interagir());
            System.out.println();
        }

        // Teste Passaros
        Passaro p1 = new Passaro("Piuzinho", 0.4, 0, true);
        Passaro p2 = new Passaro("Meg", 1, 0, false);

        listaPassaros.add(p1);
        listaPassaros.add(p2);

        // for each teste
        for (Passaro p : listaPassaros) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("Custo Diário: R$ " + p.calcularCustoDiario());
            System.out.println("Som: " + p.emitirSom());
            System.out.println("Interação: " + p.interagir());
            System.out.println();
        }
    }

}
