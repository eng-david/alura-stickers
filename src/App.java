import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception 
    {
         
        // fazer uma conexão HTTP e buscar os top 250 filmes
        // String url = "https://imdb-api.com/en/API/Top250Movies/k_l4vniiwe";
        String url = "https://api.mocki.io/v2/549a5d8b";
        
        var endereço = URI.create(url);
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(endereço).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        //System.out.println(body);
        
        // extrair só os dados que interessam (título, poster, classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);
        
        // exibir e manipular os dados
                
        for (Map<String,String> filme : listaDeFilmes) 
        {
            String nomeFilme = filme.get("title");
            String urlImagem = filme.get("image");
            String notaFilme = filme.get("imDbRating");
            notaFilme = "Classificação IMDB: " + notaFilme;

            System.out.println(nomeFilme);
            System.out.println(urlImagem);
            System.out.println(notaFilme);
                        
            System.out.println();
        }
    }
}

