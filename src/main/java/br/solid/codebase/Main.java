package br.solid.codebase;

/**
 * @author s2it_csilva
 * @version : $<br/>
 * : $
 * @since 7/1/19 5:34 PM
 */
public class Main {

    public static void main(String[] args){
        Coordenador coordenador = new Coordenador();
        coordenador.setTipoCargo(TipoCargo.ADMINISTRATIVO);
        coordenador.setNome("Joao da Silva");
        coordenador.setNumeroDependentes(3);
        coordenador.setHorasTrabalhada(40);
        coordenador.setSalarioHora(80.00);

        Professor professor = new Professor();
        professor.setTipoCargo(TipoCargo.ACADEMICO);
        professor.setNome("Joao da Silva");
        professor.setNumeroDependentes(3);
        professor.setHorasTrabalhada(40);
        professor.setSalarioHora(120.00);

        Funcionarios funcionarios = new Funcionarios();
        funcionarios.addCoordenador(coordenador);
        funcionarios.addProfessor(professor);

        System.out.println("TOTAL DE FOLHAS DE PAGAMENTO: " + funcionarios.totalFolhaDePagamento());

        for(BonificacaoVO bonificacaoVO : funcionarios.listaBonificacao()){
            System.out.println("FUNCIONARIO: " + bonificacaoVO.getNome());
            System.out.println("VALOR BONUS: " + bonificacaoVO.getValorBonus());
        }
    }
}
