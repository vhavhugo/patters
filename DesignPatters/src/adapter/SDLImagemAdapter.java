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
public class SDLImagemAdapter extends SDL_Surface implements ImagemTarget{
    
    @Override
    public void carregarImagem(String nomeDoArquivo){ 
        SDL_CarregarSurface(nomeDoArquivo);
    }
    @Override
    public void desenharImagem(int posX, int posY, int largura, int altura){
        SDL_DesenharSurface(largura, altura, posX,posY);
    }
    
}
