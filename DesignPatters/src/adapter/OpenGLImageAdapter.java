/*
 Converter uma interface em outra que o cliente espera.
O adapter faz com que classes trabalhem juntas apesar
de interfaces incopatíveis.
 */
package adapter;
/**
 *
 * @author Victor Hugo
 */
public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget {
    @Override
    public void carregarImagem(String nomeDoArquivo) {
        glCarregarImagem(nomeDoArquivo);
    }

    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura) {
        glDesenharImagem(posX, posY);
    }
    
}
