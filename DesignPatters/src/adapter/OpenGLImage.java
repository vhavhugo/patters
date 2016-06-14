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
public class OpenGLImage {
    public void glCarregarImagem(String arquivo){
        System.err.println("Imagem" + arquivo + "carrega.");
                
    }
    public void glDesenharImagem(int posicaoX, int posicaoY){
        System.out.println("OpenGL Image desenhada");
    }
}
