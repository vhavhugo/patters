package strategy2;
/**
 *
 * @author Victor
 */
public class Usuario {
    private Acesso acesso;
    
    public void setAcesso(Acesso acesso){
        this.acesso = acesso;
    }
    
    public void chamaPainel(){
        acesso.painel();
    }
}
