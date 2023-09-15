package br.com.qwasolucoes.mentoria.testes.mock;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.qwasolucoes.mentoria.model.Funcionario;

public class FuncionarioMock {
	
	public static List<String> funcionariosMockString() {
		return Arrays.asList(
				"RWAN               Souza               15/04/94MANALISTA DESENVOLVEDOR JUNIOR           51979313805   SUPERIOR CURSANDO                       1566560000\"", 
				"LUCAS              Ferreira            29/01/75ANALISTA DESENVOLVEDOR SENIOR            71979313805   SUPERIOR COMPLETO                       8800000000",
				"JOAN               Silveira            15/04/94ANALISTA DESENVOLVEDOR PLENO             67979313805   SUPERIOR COMPLETO                       7800000000"
				);
	}
	
	
	
	public static List<Funcionario> funcionarios()  {
		
		List<Funcionario> funcionarios = new ArrayList<>();
		for(String funcionario : funcionariosMockString()) {
			try {
				funcionarios.add(UtilitarioParaGerarMock.conversaoStringToFuncionario(funcionario));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return funcionarios;
	}
}
