package br.ufpb.dcx.aps.atividades.atv05;

public class Campo {
    private String nome;
    private String id;
    private String valor;

    public Campo(String id){

        this.id = id;
        this.nome = "";
        this.valor = "";
    }
    public Campo(String id, String nome){
        this(id);
        this.nome = nome;
        this.valor = "";
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getId() {

        return id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isPreenchido(){
        if (getValor() == ""){
            return false;
        }
        return true;
    }
}
