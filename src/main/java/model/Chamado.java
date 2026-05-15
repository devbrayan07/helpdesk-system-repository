package model;

public class Chamado {

    private int idChamado;
    private String titulo;
    private String descricao;
    private String prioridade;
    private String statusChamado;
    private String categoria;
    private Usuario usuario;
    private Usuario tecnico;

    public Chamado() {
        // Default Constructor
    }

    public Integer getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(Integer idChamado) {
        this.idChamado = idChamado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
