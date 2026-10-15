package siga;

public class FabricaPostgreSQL implements FabricaBanco {
    @Override 
    public Conexao criarConexao() { return new ConexaoPostGreSQL(); }
    
    @Override
    public Comando criarComando() { return new ComandoPostgreSQL(); }

}