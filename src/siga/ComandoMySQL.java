package siga;

public class ComandoMySQL implements Comando {
    public void executar(String sql) { System.out.println("[MySQL] executando: " + sql); }
}
