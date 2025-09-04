public class Gato extends Animal {
    // Atributos

    // Construtor
    public Gato(String nome, double peso, double custoDiario) {
        super(nome, peso, custoDiario);
        this.nome = nome;
        this.peso = peso;
        this.custoDiario = calcularCustoDiario();
    }

    // Métodos

    @Override
    public double calcularCustoDiario() {
        return 40 + (0.3 * peso);
    }

    @Override
    public String emitirSom() {
        return "Miau Miau";
    }

    @Override
    public String interagir() {
        return "O gato " + this.nome + " está brincando de caçar mosquitos.";
    }

}
