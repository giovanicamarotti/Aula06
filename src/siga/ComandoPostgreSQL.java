package siga;

public class ComandoPostgreSQL implements Comando {
    public void executar(String sql) { System.out.println("[PostgreSQL] executando: " + sql); }
}
