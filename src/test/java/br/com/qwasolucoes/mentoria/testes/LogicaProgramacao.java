package br.com.qwasolucoes.mentoria.testes;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.qwasolucoes.mentoria.implementacoes.logica_programacao.LogicaProgramacaoProvider;
import br.com.qwasolucoes.mentoria.model.Funcionario;
import br.com.qwasolucoes.mentoria.testes.mock.FuncionarioMock;

public class LogicaProgramacao {
	
	private LogicaProgramacaoProvider logicaProgramacao = new LogicaProgramacaoProvider();
	
	@Test
	public void conversaoStringParaPessoaTest() {
		
		// Lógica implantada pela pessoa mentorada
		List<Funcionario> conversaoStringParaPessoa = this.logicaProgramacao.conversaoStringParaPessoa(FuncionarioMock.funcionariosMockString());
		
		// Método  de mock para comparar com o retorno do método implementado pela pessoa mentorada
		List<Funcionario> funcionarioCompare = FuncionarioMock.funcionarios();
		
		Assert.assertEquals(conversaoStringParaPessoa, funcionarioCompare);
	}
	
	@Test 
	public void conversaoPessoaParaString() {
		
		List<Funcionario> funcionarios = this.logicaProgramacao.conversaoStringParaPessoa(FuncionarioMock.funcionariosMockString());
		
		List<String> conversaoPessoaParaString = this.logicaProgramacao.conversaoPessoaParaString(funcionarios);
		
		Assert.assertEquals(funcionarios, conversaoPessoaParaString);
	}
}
