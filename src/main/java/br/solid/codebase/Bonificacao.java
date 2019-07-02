package br.solid.codebase;

/**
 * @author s2it_csilva
 * @version : $<br/>
 * : $
 * @since 7/2/19 8:48 AM
 */
public abstract class  Bonificacao {

    public double calculoBonus (Double valorSalario,  TipoCargo tipoCargo){
        if(tipoCargo.equals(TipoCargo.ACADEMICO)){
            return valorSalario * 0.2;
        }else if(tipoCargo.equals(TipoCargo.ADMINISTRATIVO)){
            return valorSalario * 0.4;
        } else {
            return valorSalario * 0.5;
        }
    }
}
