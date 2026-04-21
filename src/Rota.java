public class Rota {

    private Pacote pacote;
    private Veiculo veiculo; 

    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public Pacote getPacote() { return pacote; }
    public void setPacote(Pacote pacote) { this.pacote = pacote; }

    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

    public void iniciarEntrega() {
        pacote.atualizarStatus("Em transito");
        System.out.println("=== Iniciando Entrega ===");
        System.out.println("Pacote: " + pacote.getCodigo() +
                           " | Peso: " + pacote.getPeso() +
                           " kg | Status: " + pacote.getStatus());
        System.out.println("Veiculo: " + veiculo.getDescricao());
        System.out.println("========================");
    }

    public void finalizarEntrega() {
        pacote.atualizarStatus("Entregue");
        System.out.println("Pacote " + pacote.getCodigo() + " entregue com sucesso!");
    }
}
