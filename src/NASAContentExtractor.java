import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NASAContentExtractor implements ContentExtractor{
    public List<Content> ContentExtract(String json){
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);        

        List<Content> contents = new ArrayList<>();

        for (Map<String, String> atributos : listaDeAtributos) {
            String titulo = atributos.get("title");
            String urlImagem = atributos.get("url");            
            var content = new Content(titulo, urlImagem, null);
            contents.add(content);
        }

        return contents;
    }
}
