package br.com.qwasolucoes.mentoria.testes.mock;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.qwasolucoes.mentoria.model.Funcionario;

public class UtilitarioParaGerarMock {
	
	private final static Integer  DEZOITO_ANOS = 18;
	private final static Integer  VINTE_QUATRO_ANOS = 24;
	private final static Integer  TRINTA_32_ANOS = 32;
	private final static Integer  CINQUENTA_ANOS = 50;
	
	private final static BigDecimal FAIXA_ETARIA_18 = new BigDecimal("0.2"); // Exemplo de taxa A com valor 0.1 (10%)
	private final static BigDecimal FAIXA_ETARIA_19_AOS_23 = new BigDecimal("0.15");   // Exemplo de taxa B com valor 0.2 (20%)
	private final static BigDecimal FAIXA_ETARIA_24_AOS_31 = new BigDecimal("0.1");
	private final static BigDecimal FAIXA_ETARIA_32_AOS_49 = new BigDecimal("0.05");
	private final static BigDecimal FAIXA_ETARIA_50 = new BigDecimal("0.01");
	

	public static Funcionario conversaoStringToFuncionario(String func) throws ParseException {
		SimpleDateFormat formatterDate = new SimpleDateFormat("dd/MM/yy");
		Date datanascimento = formatterDate.parse(func.substring(39, 47));
		Integer idade = new Date().getYear() - datanascimento.getYear();
		
		Boolean maiorIdade = idade >= 18 ? true : false;
		BigDecimal salario = new BigDecimal(func.substring(142, 152).split("\\s")[0]);
		
		
		BigDecimal taxaSalario = taxa(salario, idade); 
		salario = salario.subtract(taxaSalario);
		
		
		return new Funcionario(
				func.substring(0, 19),
				func.substring(19, 39),
				datanascimento,
				idade,
				func.substring(47, 48),
				func.substring(48, 88),
				func.substring(88, 102),
				func.substring(102, 142),
				salario,
				maiorIdade,
				taxaSalario
				);
	} 
	
	private static BigDecimal taxa(BigDecimal salario, Integer idade ) {
		if(idade <= DEZOITO_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_18);
		}
		
		if(idade > DEZOITO_ANOS && idade < VINTE_QUATRO_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_19_AOS_23);
		}
		
		if(idade >= VINTE_QUATRO_ANOS && idade < TRINTA_32_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_24_AOS_31);
		}
		
		if(idade >= TRINTA_32_ANOS && idade <= CINQUENTA_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_32_AOS_49);
		} 
		
		if(idade > CINQUENTA_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_50);
		} 
		
		return null;
	}

}
