package strategy;
/**
 *
 * @author Victor Hugo
 */
public class CalculoImpostoQuinzeOuDez implements CalculaImposto {

	@Override

	public double calculaSalarioComImposto(Funcionario umFuncionario) {

		if (umFuncionario.getSalarioBase() > 2000) {

			return umFuncionario.getSalarioBase() * 0.85;

		}

		return umFuncionario.getSalarioBase() * 0.9;

	}

    @Override
    public double calculaSalarioComImpsto(Funcionario umFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
