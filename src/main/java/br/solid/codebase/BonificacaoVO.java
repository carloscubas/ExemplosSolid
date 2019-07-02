package br.solid.codebase;

/**
 * @author s2it_csilva
 * @version : $<br/>
 * : $
 * @since 7/2/19 9:15 AM
 */
public class BonificacaoVO {

    private String nome;

    private Double valorBonus;

    public BonificacaoVO () {

    }

    public BonificacaoVO (final String nome, final Double valorBonus) {
        this.nome = nome;
        this.valorBonus = valorBonus;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (final String nome) {
        this.nome = nome;
    }

    public Double getValorBonus () {
        return valorBonus;
    }

    public void setValorBonus (final Double valorBonus) {
        this.valorBonus = valorBonus;
    }
}
