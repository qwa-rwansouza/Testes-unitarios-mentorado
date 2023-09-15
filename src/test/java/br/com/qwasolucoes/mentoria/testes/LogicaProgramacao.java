package br.com.qwasolucoes.mentoria.testes;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.qwasolucoes.mentoria.implementacoes.logica_programacao.LogicaProgramacaoProvider;
import br.com.qwasolucoes.mentoria.model.Funcionario;
import br.com.qwasolucoes.mentoria.testes.logica_programacao.LogicaProgramacaoTest;
import br.com.qwasolucoes.mentoria.testes.mock.FuncionarioMock;

public class LogicaProgramacao implements LogicaProgramacaoTest {

	@Test
	public void conversaoStringParaPessoaTest() {
		
		LogicaProgramacaoProvider logicaProgramacao = new LogicaProgramacaoProvider();
		
		
		// Lógica implantada pela pessoa mentorada
		List<Funcionario> conversaoStringParaPessoa = logicaProgramacao.conversaoStringParaPessoa(FuncionarioMock.funcionariosMockString());
		
		List<Funcionario> funcionarioCompare = FuncionarioMock.funcionarios();
		
		Assert.assertEquals(conversaoStringParaPessoa, funcionarioCompare);
		
	}
}
