package siga;

public interface FabricaBanco {
    Conexao criarConexao();  //métodos sem corpo que servem como "assinatura"
    Comando criarComando();
}