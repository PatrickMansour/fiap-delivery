public class Principal {
    public static void main(String[] args) {
 
        Caminhao caminhao = new Caminhao("ABC1D23", 5000.0, 4);
        Moto moto = new Moto("XYZ9F87", 30.0, true);


        Pacote pacoteGrande = new Pacote("BR999", 120.0, "Pendente");
        Pacote pacotePequeno = new Pacote("BR001", 2.5, "Pendente");

    
        Rota rotaCaminhao = new Rota(pacoteGrande, caminhao);
        rotaCaminhao.iniciarEntrega();
        rotaCaminhao.finalizarEntrega();

   
        Rota rotaMoto = new Rota(pacotePequeno, moto);
        rotaMoto.iniciarEntrega();
        rotaMoto.finalizarEntrega();


        System.out.println("\n=== Teste de validacao ===");
        Caminhao caminhaoInvalido = new Caminhao("ERR0000", -500.0, 2);
        System.out.println("Capacidade aplicada: " + caminhaoInvalido.getCapacidadeCarga() + " kg");
    }
}
