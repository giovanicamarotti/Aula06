package siga;

public class AcessoDados {

    private static AcessoDados instancia;

    private AcessoDados() {
    }

    public static AcessoDados getInstancia() {
        if (instancia == null) {
            instancia = new AcessoDados();
        }
        return instancia;
    }

    public void conectar(FabricaBanco fabrica) {
        // seu código atual
    }
}
