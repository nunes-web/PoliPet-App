public class Cachorro extends Animal implements Domesticaveis {
    // Atributos
    private boolean adestrado;
    private boolean precisaPasseio;

    // Construtor
    public Cachorro(String nome, double peso, double custoDiario, boolean adestrado, boolean precisaPasseio) {
        super(nome, peso, custoDiario);
        this.nome = nome;
        this.peso = peso;
        this.adestrado = adestrado;
        this.precisaPasseio = precisaPasseio;
        this.custoDiario = calcularCustoDiario();
    }

    // Métodos

    @Override
    public double calcularCustoDiario() {
        if (adestrado == true) {
            return (50 + 10) + (0.5 * peso);
        } else {
            return 50 + (0.5 * peso);
        }
    }

    @Override
    public String emitirSom() {
        return "Au Au";
    }

    @Override
    public String interagir() {
        return "O cachorro " + this.nome + " está brincando de correr atrás do próprio rabo.";
    }

    @Override
    public boolean precisaPasseio() {
        if (precisaPasseio) {
            return true;
        } else {
            return false;
        }
    }
}
