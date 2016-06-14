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
public class SDL_Surface {
    public void SDL_CarregarSurface(String arquivo){
    System.out.println("Imagem" +arquivo+"carregada.");
    }
    public void SDL_DesenharSurface(int largura, int altura, int posicaoX,int posicaoY){
        System.out.println("SDL_Surface desenhar");
    }
}
