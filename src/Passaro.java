public class Passaro extends Animal {
    // Atributos
    protected boolean raro;

    // Construtor
    public Passaro(String nome, double peso, double custoDiario, boolean raro) {
        super(nome, peso, custoDiario);
        this.nome = nome;
        this.peso = peso;
        this.raro = raro;
        this.custoDiario = calcularCustoDiario();
    }

    // Métodos

    @Override
    public double calcularCustoDiario() {
        if (raro == true) {
            return ((30 + (0.1 * peso)) + 5);
        } else {
            return 50 + (0.5 * peso);
        }
    }

    @Override
    public String emitirSom() {
        return "Piu Piu";
    }

    @Override
    public String interagir() {
        return "O pássaro " + this.nome + " está brincando de gangorra na gaiola.";
    }

}
