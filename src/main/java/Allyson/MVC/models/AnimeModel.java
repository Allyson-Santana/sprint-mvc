package Allyson.MVC.models;

public class AnimeModel {

    private String nome;
    private String status;
    private String genero;

    public AnimeModel(String nome, String status, String genero) {
        this.nome = nome;
        this.status = status;
        this.genero = genero;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return this.nome;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }


}
