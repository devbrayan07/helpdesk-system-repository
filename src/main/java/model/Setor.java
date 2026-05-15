package model;

public class Setor {

    private Integer idSetor;
    private String nomeSetor;
    private String descricaoSetor;
    private Boolean ativo;


    public void setIdSetor(Integer id) {
        this.idSetor = id;
    }

    public Integer getIdSetor() {
        return idSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor  = nomeSetor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public String getDescricaoSetor() {
        return  descricaoSetor;
    }

    public void setDescricaoSetor(String descricaoSetor) {
        this.descricaoSetor = descricaoSetor;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}

