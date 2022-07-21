import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception 
    {
         
        // Conexão HTTP IMDB
        // String url = "https://imdb-api.com/en/API/Top250Movies/k_l4vniiwe";
        //String url = "https://api.mocki.io/v2/549a5d8b";
        //var extrator = new IMDBContentExtractor();

        // Conexão HTTP NASA
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-14";
        var extrator = new NASAContentExtractor();

        // Obtem o JSON a partir do URL
        var http = new HTTPClient();
        String json = http.buscaDados(url);
        
        List<Content> conteudos = extrator.ContentExtract(json);
        
        // exibir e manipular os dados
        var stickerGenerator = new StickerGenerator();
        
        for (int i = 0; i < 3; i++) 
        {   
            Content conteudo = conteudos.get(i);

            String titulo = conteudo.getTitulo();
            String urlImagem = conteudo.getUrlImagem();
            
            String notaFilme = conteudo.getImdbRating();
            String textoFigurinha = "NOTA: " + notaFilme;
            //String textoFigurinha = "TOPZERA";

            System.out.println(titulo);

            InputStream inputStream = new URL(urlImagem).openStream();
            stickerGenerator.Generate(inputStream, textoFigurinha, titulo); // Gera a figurinha com a imagem do filme
                                    
            System.out.println();
        }
    }
}

