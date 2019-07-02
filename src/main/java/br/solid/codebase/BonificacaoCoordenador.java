package br.solid.codebase;

/**
 * @author s2it_csilva
 * @version : $<br/>
 * : $
 * @since 7/2/19 9:08 AM
 */
public class BonificacaoCoordenador extends Bonificacao {

    @Override
    public double calculoBonus (Double valorSalario, TipoCargo tipoCargo) {
        throw new RuntimeException("Coordenador nao tem bonificacao");
    }
}
