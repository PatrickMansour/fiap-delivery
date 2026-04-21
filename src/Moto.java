public class Moto extends Veiculo {

    private boolean possuiBau;

    public Moto(String placa, double capacidadeCarga, boolean possuiBau) {
        super(placa, capacidadeCarga); // chama construtor da classe pai
        this.possuiBau = possuiBau;
    }
    public boolean isPossuiBau() { return possuiBau; }
    public void setPossuiBau(boolean possuiBau) { this.possuiBau = possuiBau; }

    @Override
    public String getDescricao() {
        String bau = possuiBau ? "Sim" : "Nao";
        return "Moto [Placa: " + getPlaca() +
               " | Capacidade: " + getCapacidadeCarga() +
               " kg | Possui Bau: " + bau + "]";
    }
}
