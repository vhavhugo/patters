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
public interface ImagemTarget {
    void carregarImagem(String nomeDoArquivo);
    void desenharImagem(int posX, int posY, int largura, int altura);
}
