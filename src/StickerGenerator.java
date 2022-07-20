import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;

public class StickerGenerator {

    public void Generate(InputStream inputStream, String fileName) throws Exception
    {
        // leitura da imagem
        BufferedImage imagemOriginal = ImageIO.read(inputStream);
        
        // cria nova imagem em memória com transparencia e com tamanho novo
        int width = imagemOriginal.getWidth();
        int height = imagemOriginal.getHeight();
        int novaAltura = height + 200;
        BufferedImage novaImagem = new BufferedImage(width, novaAltura, BufferedImage.TRANSLUCENT);
        
        // copiar a imagem original pra nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // escrever uma frase na nova imagem
        Font fonte = new Font(Font.SANS_SERIF, Font.BOLD, 32);
        graphics.setFont(fonte);
        graphics.setColor(Color.CYAN);
        graphics.drawString("TOPZERA", 0, novaAltura - 100);

        // escrever a nova imagem em um arquivo
        fileName = fileName.replace(":", "-"); // Substitui o ":" por "-" para evitar problemas com o Windows
        fileName = "StickerGenerator/" + fileName + ".png";
        ImageIO.write(novaImagem, "png", new File(fileName));
    }
    
    public static void main(String[] args) throws Exception {           
        var gerador = new StickerGenerator();

        InputStream inputStream = new URL("https://www.alura.com.br/assets/img/imersao-java/jaque-imersao-java-bio.1657213671.png").openStream();
        gerador.Generate(inputStream, "Figurinha : !!!");
    }
}
