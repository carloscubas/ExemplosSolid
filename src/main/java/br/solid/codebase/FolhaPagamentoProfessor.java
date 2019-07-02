package br.solid.codebase;

/**
 * @author s2it_csilva
 * @version : $<br/>
 * : $
 * @since 7/1/19 5:18 PM
 */
public class FolhaPagamentoProfessor {

    private int horasTrabalhadas;
    private double salarioHora;
    private int dependentes;

    public FolhaPagamentoProfessor (int horasTrabalhadas, double salarioHora, int dependentes) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
        this.dependentes = dependentes;
    }

    public double calculoSalarioBruto() {
        return horasTrabalhadas * salarioHora + (50 * dependentes);
    }

    public double calculoDescontoInss() {
        if(this.calculoSalarioBruto() > 500 ) {
            return this.calculoSalarioBruto() * 9/100;
        }
        else {
            return this.calculoSalarioBruto() * 8.5/100;
        }
    }

    public double calculoImpostoRenda() {
        if(this.calculoSalarioBruto() <= 300 ) {
            return 0;
        }
        else if(this.calculoSalarioBruto() > 500) {
            return this.calculoSalarioBruto() * 7/100;
        }

        else {
            return this.calculoSalarioBruto() * 5/100;
        }
    }

    public double calculoSalarioLiquido() {
        return this.calculoSalarioBruto() - this.calculoDescontoInss() - this.calculoImpostoRenda();
    }

}
