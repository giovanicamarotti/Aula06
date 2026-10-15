package siga;

public class ConsultaBuilder {
    private final String tabela;
    private String filtro = null;
    private String ordenacao = null;
    private int limite = 0;
    private int offset = 0;
    private int timeoutSegundos = 0;
    private boolean somenteAtivos = false;

    public ConsultaBuilder(String tabela) {
        this.tabela = tabela;
    }

    public ConsultaBuilder comFiltro(String filtro) {
        this.filtro = filtro;
        return this;
    }

    public ConsultaBuilder comOrdenacao(String ordenacao) {
        this.ordenacao = ordenacao;
        return this;
    }

    public ConsultaBuilder comLimite(int limite) {
        this.limite = limite;
        return this;
    }

    public ConsultaBuilder comOffset(int offset) {
        this.offset = offset;
        return this;
    }

    public ConsultaBuilder comTimeout(int timeoutSegundos) {
        this.timeoutSegundos = timeoutSegundos;
        return this;
    }

    public ConsultaBuilder somenteAtivos() {
        this.somenteAtivos = true;
        return this;
    }


    public String construir() {
        StringBuilder sb = new StringBuilder("SELECT * FROM ").append(tabela);
        if (filtro != null) sb.append(" WHERE ").append(filtro);
        if (somenteAtivos) sb.append(filtro != null ? " AND ativo = 1" : " WHERE ativo = 1");
        if (ordenacao != null) sb.append(" ORDER BY ").append(ordenacao);
        if (limite > 0) sb.append(" LIMIT ").append(limite);
        if (offset > 0) sb.append(" OFFSET ").append(offset);
        return sb.toString();
    }
}
