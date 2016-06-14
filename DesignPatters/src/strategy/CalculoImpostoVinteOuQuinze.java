package strategy;
/**
 *
 * @author Victor
 */
public class CalculoImpostoVinteOuQuinze implements CalculaImposto{
    @Override
    public double calculaSalarioComImposto(Funcionario umFuncionario){
        if(umFuncionario.getSalarioBase() > 3500){
            return umFuncionario.getSalarioBase() * 0.8;
        }
        return umFuncionario.getSalarioBase() * 0.85;
    }

    @Override
    public double calculaSalarioComImpsto(Funcionario umFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
