import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception 
    {
        // Origem do conteudo 
        API_EXTRATOR myApi = API_EXTRATOR.LINGUAGENS; // ENUM para selecionar a origem do conteúdo com apenas uma linha de código
        var url = myApi.getUrl();
        var extrator = myApi.getExtrator();

        // Obtem o JSON a partir do URL
        var http = new HTTPClient();
        String json = http.buscaDados(url);
        
        List<Content> conteudos = extrator.ContentExtract(json);
        
        // exibir e manipular os dados
        var stickerGenerator = new StickerGenerator();
        
        for (int i = 0; i < conteudos.size(); i++) 
        {   
            Content conteudo = conteudos.get(i);

            String titulo = conteudo.getTitulo();
            String urlImagem = conteudo.getUrlImagem();
            
            //String notaFilme = conteudo.getImdbRating();
            //String textoFigurinha = "NOTA: " + notaFilme;
            //String textoFigurinha = "TOPZERA";

            System.out.println(titulo);

            InputStream inputStream = new URL(urlImagem).openStream();
            stickerGenerator.Generate(inputStream, titulo, titulo); // Gera a figurinha com a imagem do filme
                                    
            System.out.println();
        }
    }
}

