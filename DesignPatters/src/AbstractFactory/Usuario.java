/*
Considere uma aplicação onde eu possa ter 
múltiplas interfaces gráficas, a principio 
apenas duas,  mas que eu possa adicionar 
quantas eu quiser. Devemos pensar em fazer 
isso da forma mais escalável possível, é aí 
que entra um padrão de Projeto: Abstract Factory.
 */
package AbstractFactory;
/**
 *
 * @author Victor
 */
public abstract class Usuario {
    protected String nome;
    protected Papel papel;
    
    protected Usuario(String nome, Papel papel){
        this.nome = nome;
        this.papel = papel;
    }
    public abstract void informacao();
}
