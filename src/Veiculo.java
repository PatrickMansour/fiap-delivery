public abstract class Veiculo {

    private String placa;
    private double capacidadeCarga; // em kg

    public Veiculo(String placa, double capacidadeCarga) {
        this.placa = placa;
        setCapacidadeCarga(capacidadeCarga); 
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public double getCapacidadeCarga() { return capacidadeCarga; }

    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga <= 0) {
            System.out.println("ERRO: Capacidade invalida. Usando 1.0 kg.");
            this.capacidadeCarga = 1.0;
        } else {
            this.capacidadeCarga = capacidadeCarga;
        }
    }

    public String getDescricao() {
        return "Veiculo [Placa: " + placa + " | Capacidade: " + capacidadeCarga + " kg]";
    }
}
