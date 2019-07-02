package br.solid.codebase;

/**
 * @author s2it_csilva
 * @version : $<br/>
 * : $
 * @since 7/1/19 5:02 PM
 */
public class Professor {

    private String nome;

    private int horasTrabalhada;

    private Double salarioHora;

    private int numeroDependentes;

    private TipoCargo tipoCargo;

    public String getNome () {
        return nome;
    }

    public void setNome (final String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhada () {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada (final int horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }

    public Double getSalarioHora () {
        return salarioHora;
    }

    public void setSalarioHora (final Double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getNumeroDependentes () {
        return numeroDependentes;
    }

    public void setNumeroDependentes (final int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public TipoCargo getTipoCargo () {
        return tipoCargo;
    }

    public void setTipoCargo (final TipoCargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
}
