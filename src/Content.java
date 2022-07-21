public class Content {
    private final String titulo;
    private final String urlImagem;
    private final String imdbRating;
    // final: não pode ser alterado depois de criado

    public Content(String titulo, String urlImagem, String imdbRating) {
        this.titulo = titulo;
        this.urlImagem = urlImagem;
        this.imdbRating = imdbRating;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getUrlImagem() {
        return urlImagem;
    }
    public String getImdbRating() {
        return imdbRating;
    }

    
}
