package br.solid.codebase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author s2it_csilva
 * @version : $<br/>
 * : $
 * @since 7/1/19 5:05 PM
 */
public class Funcionarios {

    public ArrayList<Coordenador> listaCoorenadores = new ArrayList<Coordenador>();
    public ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
    public FolhaPagamentoCoordenador calculoFolhaPagamentoCoordenador;
    public FolhaPagamentoProfessor folhaPagamentoProfessor;
    public BonificacaoProfessor bonificacaoProfessor;
    public BonificacaoCoordenador bonificacaoCoordenador;

    public Funcionarios () {
        bonificacaoProfessor = new BonificacaoProfessor();
        bonificacaoCoordenador = new BonificacaoCoordenador();
    }

    public void addCoordenador(Coordenador coordenador){
        listaCoorenadores.add(coordenador);
    }

    public void addProfessor(Professor professor){
        listaProfessor.add(professor);
    }

    public double totalFolhaDePagamento(){
        double total = 0.0;

        for(Coordenador coordenador : listaCoorenadores){
            calculoFolhaPagamentoCoordenador = new FolhaPagamentoCoordenador(coordenador.getHorasTrabalhada(), coordenador.getSalarioHora(), coordenador.getNumeroDependentes());
            total += calculoFolhaPagamentoCoordenador.calculoSalarioLiquido();
        }

        for(Professor professor : listaProfessor){
            folhaPagamentoProfessor = new FolhaPagamentoProfessor(professor.getHorasTrabalhada(), professor.getSalarioHora(), professor.getNumeroDependentes());
            total += folhaPagamentoProfessor.calculoSalarioLiquido();
        }

        return total;
    }

    public List<BonificacaoVO> listaBonificacao(){

        List<BonificacaoVO> valores = new ArrayList<BonificacaoVO>();

        for(Professor professor : listaProfessor){
            folhaPagamentoProfessor = new FolhaPagamentoProfessor(professor.getHorasTrabalhada(), professor.getSalarioHora(), professor.getNumeroDependentes());
            Double bonificacao = bonificacaoProfessor.calculoBonus(calculoFolhaPagamentoCoordenador.calculoSalarioLiquido(), professor.getTipoCargo());
            valores.add(new BonificacaoVO(professor.getNome(), bonificacao));
        }

        for(Coordenador coordenador : listaCoorenadores){
            calculoFolhaPagamentoCoordenador = new FolhaPagamentoCoordenador(coordenador.getHorasTrabalhada(), coordenador.getSalarioHora(), coordenador.getNumeroDependentes());
            Double bonificacao = bonificacaoCoordenador.calculoBonus(calculoFolhaPagamentoCoordenador.calculoSalarioLiquido(), coordenador.getTipoCargo());
            valores.add(new BonificacaoVO(coordenador.getNome(), bonificacao));
        }

        return valores;
    }

}
