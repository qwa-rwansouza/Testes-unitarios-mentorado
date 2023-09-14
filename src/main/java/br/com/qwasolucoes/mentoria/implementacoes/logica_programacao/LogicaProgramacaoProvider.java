package br.com.qwasolucoes.mentoria.implementacoes.logica_programacao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import br.com.qwasolucoes.mentoria.interfaces.logica_programacao.LogicaProgramacao;
import br.com.qwasolucoes.mentoria.model.Funcionario;

public class LogicaProgramacaoProvider implements LogicaProgramacao{
	
	Scanner sc = new Scanner(System.in);
	

	@Override
	public List<Funcionario> conversaoStringParaPessoa(List<String> lista) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> conversaoPessoaParaString(List<Funcionario> pessoas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Funcionario conversaoArrayParaPessoa(String[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> conversaoArrayMultidimensionalParaPessoa(String[][] arrayMultidimensional) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] arrayMultidimensionalParesImparesPrimosResto(int[] array, int numeroDivisaoResto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] arrayMultidimensionalPorPosicoes(String[][] arrayMultidimensional, int coluna, int linha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] arrayMultidimensionalPorValor(String[][] arrayMultidimensional, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] antecessorSucessorPor(String[] array, int posicao) {
		String[] lista = new String[2];
			
		try {
			lista[0]= array[posicao-1];	
		}
		catch (Exception IndexOutOfBounds ){
			System.out.println("Valor está fora do índice do array: " + IndexOutOfBounds.getMessage());
		}
		
		try {			
			lista[1]= array[posicao+1];
		}
		catch (Exception IndexOutOfBounds ){
			System.out.println("Valor está fora do índice do array: " + IndexOutOfBounds.getMessage());
		}
				
		return lista;
	}


	@Override
	public String[] antecessorSucessorPor(String[] array, String valor) {
		
	String[] lista = new String[2];

	int posicao = Arrays.asList(array).indexOf(valor);
	
	int antecessor = posicao - 1;
	int sucessor = posicao + 1;
	
	try {
		lista[0] = array[antecessor] ;
	}
	catch (Exception IndexOutOfBounds ){
		System.out.println("Valor está fora do índice do array: " + IndexOutOfBounds.getMessage());
		
	}
	try {
		lista[1] = array[sucessor] ;
	}
	catch (Exception IndexOutOfBounds ){
		System.out.println("Valor está fora do índice do array: " + IndexOutOfBounds.getMessage());
		
	}
		
		return lista;
	}

	private int indexOf(String valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int indexOf(String[] array) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> numerosPares(Integer limite) {
		
	List<Integer> listaPares = new ArrayList<>(limite);	
	
	for(int i = 0; i <= limite; i++) {
		if(i % 2 == 0) {
			listaPares.add(i);
		}
	}
			
		return listaPares;
	}

	@Override
	public List<Integer> numerosImpares(Integer limite) {

	List<Integer> listaImpares = new ArrayList<>(limite);
	
	for(int i = 0; i < limite; i++) {
		if(i % 2 != 0) {
			listaImpares.add(i);
		}
	}
		return listaImpares;
	}

	@Override
	public List<Integer> numerosPrimos(Integer limite) {
		
		List<Integer> listaPrimos = new ArrayList<>(limite);
		
		for(int i = 2; i < limite; i++) {
			
			boolean primo = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					primo = false;
				}
			}
			
			if(primo) {
				listaPrimos.add(i);
			}
		}					
		
		return listaPrimos;
	}

	@Override
	public int[] numerosParesArray(Integer limite) {
		
		int tamanhoArray = limite / 2 + 1;
		int index = 0;
			
		int[] Pares = new int[tamanhoArray];
		
		for(int i = 0; i <= limite; i++) {
			if(i % 2 == 0) {
				Pares[index] = i;
				index++;
			}
		}
		
		return Pares;
	}

	@Override
	public int[] numerosImparesArray(Integer limite) {
		int tamanhoArray = (limite+1) / 2;
		int index = 0;
		
		int[] Impar = new int[tamanhoArray];
		
		for(int i = 0; i <= limite; i++) {
			if(i % 2 != 0) {
				Impar[index] = i;
				index++;
			}
		}
		return Impar;
	}

	@Override
	public int[] numerosPrimosArray(Integer limite) {
		
		boolean primo = true;
		int tamanhoArray = 0;
		int index = 0;
		
		for(int i = 2; i <= limite; i++) {
			primo = true;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				tamanhoArray++;				
			}			
		} 
		
		int[] Primos = new int[tamanhoArray];
		
		for(int i = 1; i <= limite; i++) {
			primo = true;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					primo = false;
					break;
				}
			}
			if(primo) {
				Primos[index] = i;
				index++;			
			}
		}			
		return Primos;
	}

	@Override
	public int[] primeiraUltimaPosicaoArray(Integer limite) {
		
		int index = 0;
		int tamanhoArrayResposta = 2;
		
		int[]Array = new int[limite + 1];
		for(int i = 0; i <limite; i++) {
			Array[index] = i;
			index++;
		}
				
		int[]arrayResposta = new int[tamanhoArrayResposta];
				
			arrayResposta[0] = Array[0];
			arrayResposta[1] = Array[limite-1];
				
		return arrayResposta;
	}

	@Override
	public int[] quantidadeParesImparesPrimos(List<Integer> valores) {
		
		int tamanhoArrayResposta = 3;
		int pares = 0;
		int impares = 0;
		int primos = 0;
		int index = 0;
		
		List<Integer> lista = new ArrayList<>(valores);
		
		for(int i = 0; i<lista.size(); i++) {
			
			int numero = lista.get(index);
			
			if(numero % 2 ==0) {
				pares ++;
			} 
			else if(numero % 2 !=0) {
				impares ++;
			}
			
			for(int j = 2; j<=i; j++) {
				boolean primo = true;
				
				for(int x = 2; x < numero; x++) {
					if( numero % x ==0) {
						primo = false;
						
					}
				}
				if(primo) {
					primos ++;
					break;
				}
				
			} index++;
		}
		
		int[]Resposta = new int[tamanhoArrayResposta];
		
		for(int y = 0; y<tamanhoArrayResposta; y++) {
			Resposta[0] = pares;
			Resposta[1] = impares;
			Resposta[2] = primos;
			
		}
		return Resposta;
	}

	@Override
	public int[] primeiraUltimaMediaPosicaoArray(Integer limite) {

		int index = 0;
		int tamanhoArrayResposta = 3;
		int soma = 0;
		
		int[]Array = new int[limite];		
		
		for(int i = 0; i < limite; i++) {
			Array[index] = i;
			index ++;
			soma += i;
		}
		
		int media = soma / limite;
		
		int[]Resposta = new int[tamanhoArrayResposta];
		
		for(int j= 0; j < tamanhoArrayResposta; j++) {
			Resposta[0] = Array[0];
			Resposta[1] = Array[limite - 1];
			Resposta[2] = media;
		}				

		return Resposta;
	}

	@Override
	public List<Integer> removerInteirosDuplicados(List<Integer> numeros) {
		List<Integer> lista = new ArrayList<>(numeros);  

		Set<Integer> duplicados = new HashSet<>();
		Set<Integer> numeroVisto = new HashSet<>();

		       for (int n : lista) {
		           if (numeroVisto.contains(n)) {
		               
		               duplicados.add(n);
		           }
		           else {
		            numeroVisto.add(n);
		           }
		       }
		     
		   List<Integer> numerosSemDuplicados = new ArrayList<>(numeroVisto);        
		   
		return numerosSemDuplicados;
	}

	@Override
	public List<BigDecimal> removerValoresDuplicados(List<BigDecimal> numeros) {
		List<BigDecimal> lista = new ArrayList<>(numeros);
		
		Set<BigDecimal> duplicados = new HashSet<>();
		Set<BigDecimal> numerosVistos = new HashSet<>();
		
		for(BigDecimal n : lista) {
			BigDecimal numeroArredondado = n.setScale(2, RoundingMode.HALF_UP);
			
			if(numerosVistos.contains(numeroArredondado)) {
				duplicados.add(numeroArredondado);
			}else {
				numerosVistos.add(numeroArredondado);
			}
		}			
		
		List<BigDecimal> listaSemDuplicados = new ArrayList<>(numerosVistos);
		
		return listaSemDuplicados;
	}

	@Override
	public List<String> removerTextosDuplicados(List<String> textos) {
		List<String> lista = new ArrayList<>(textos);
		
		Set<String> duplicados = new HashSet<>();
		Set<String> textoVisto = new HashSet<>();
		
		for(String frase : lista) {
			if(textoVisto.contains(frase)) {
				duplicados.add(frase);
			}else {
				textoVisto.add(frase);
			}
		}
		
		List<String> listaSemDuplicados = new ArrayList<>(textoVisto);
		
		return listaSemDuplicados;
	}

	@Override
	public Integer valorInteiroMaiorQtdDuplicados(List<Integer> numeros) {
		
		List<Integer> lista = new ArrayList<>(numeros);
		
		Set<Integer> duplicados = new HashSet<>();
		Set<Integer> numeroVisto = new HashSet<>();
		
		int quantidadeRepeticao = 0;
		int numeroMaisRepetido = 0;
		int contaRepeticoes = 0;
		int numeroRepetido = 0;		
		
		for(int n : lista) {
			
			if(numeroVisto.contains(n)) {
				
				duplicados.add(n);
				
				contaRepeticoes = Collections.frequency(lista, n);
				numeroRepetido = contaRepeticoes;
				
				if(numeroRepetido > quantidadeRepeticao) {
					numeroMaisRepetido = n;
					quantidadeRepeticao = numeroRepetido;
				}
			}
			else {
				numeroVisto.add(n);
			}
		} 
		return numeroMaisRepetido; 
	}

	@Override
	public String valorTextoMaiorQtdDuplicados(List<String> textos) {
		
		List<String> lista = new ArrayList<>(textos);
		
		Set<String> textoDuplicado = new HashSet<>();
		Set<String> textoVisto = new HashSet<>();
		
		int quantidadeRepeticao = 0;
		String textoMaisRepetido = "";
		int contaRepeticoes = 0;
		int repetidos = 0;	
		
		
		for(String frase : lista) {
			
			if(textoVisto.contains(frase)) {
				textoDuplicado.add(frase);
				
				contaRepeticoes = Collections.frequency(lista, frase);
				quantidadeRepeticao = contaRepeticoes;
				
				if(quantidadeRepeticao > repetidos ) {
					textoMaisRepetido = frase;
					repetidos = quantidadeRepeticao;
					
				}
				
			}else {
				textoVisto.add(frase);
			}
		}
		
		return textoMaisRepetido;
	}

	@Override
	public List<Integer> listaInteirosDuplicados(List<Integer> numeros) { 
		List<Integer> lista = new ArrayList<>(numeros);  

		Set<Integer> duplicados = new HashSet<>();
		Set<Integer> numeroVisto = new HashSet<>();

		       for (int n : lista) {
		           if (numeroVisto.contains(n)) {
		               
		               duplicados.add(n);
		           }
		           else {
		            numeroVisto.add(n);
		           }
		       }
		     
		   List<Integer> numerosDuplicados = new ArrayList<>(duplicados);        
		   
		return numerosDuplicados;
	}

	@Override
	public List<BigDecimal> listaDecimalDuplicados(List<BigDecimal> textos) {
		List<BigDecimal> lista = new ArrayList<>(textos);

		Set<BigDecimal> duplicados = new HashSet<>();
		Set<BigDecimal> numeroVisto = new HashSet<>();

		for(BigDecimal n: lista) {
			
			BigDecimal numeroArredondado = n.setScale(2, RoundingMode.HALF_UP);
			
			if(numeroVisto.contains(numeroArredondado)) {
				duplicados.add(numeroArredondado);
			}
			else {
				numeroVisto.add(numeroArredondado);
			}
		}
		
		List<BigDecimal> decimalDuplicados = new ArrayList<>(duplicados);
		
		return decimalDuplicados;
	}

	@Override
	public List<String> listaTextoDuplicados(List<String> textos) {
		List<String> lista = new ArrayList<>(textos);
		
		Set<String> duplicados = new HashSet<>();
		Set<String> textoVisto = new HashSet<>();
		
		for(String frase: lista) {
			
			if(textoVisto.contains(frase)) {
				duplicados.add(frase);
			}
			else {
				textoVisto.add(frase);
			}
		}
		
		List<String> textoDuplicado = new ArrayList<>(duplicados);
		
		return textoDuplicado;
	}

	@Override
	public Integer somarValores(Integer limite) { 
		int soma = 0;
		
		for(int i = 0; i<= limite; i++) {
			soma += i;
		}
		
		return soma;
	}

	@Override
	public Integer somarValoresPares(Integer limite) { 
		int soma = 0;
	
		for(int i = 0; i <= limite; i++) {
			if(i % 2 == 0) {
				soma += i ;
			}
		}
		return soma;
	}

	@Override
	public Integer somarValoresImpares(Integer limite) { 
		int soma = 0;
		
		for(int i = 0; i <= limite; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		return soma;
	}

	@Override
	public Integer somarValoresPrimos(Integer limite) { 
		int soma = 0;
				
		for(int i = 2; i <= limite; i++) {
			boolean primo = true;
			
			for(int j = 2; j< i; j++) {
				if(i % j == 0) {
					primo = false;
				}
			} 
			
			if(primo) {
				soma += i;
		     }
		}
		return soma;
	}

	@Override
	public Integer somarValoresPosicoes(int[] valores) {
		int soma = 0;
		
		for(int i = 0; i <valores.length; i++) {
			soma += valores[i]; 
		}		
		return soma;
	}

	@Override
	public Integer somarValoresParesPosicoes(int[] valores) { 
		
		int soma = 0; 
		
		for(int i = 0; i <valores.length; i++) {
			if(valores[i] % 2 == 0) {
			soma += valores[i]; 
			}
		}
		return soma;
	}

	@Override
	public Integer somarValoresImparesPosicoes(int[] valores) { 
		int soma = 0; 
		int index = 0;
		
		for(int i = 0; i< valores.length; i++) {			
			if(valores[index] % 2 != 0) {
				soma += valores[index];
				
			}index++;
		}
		return soma;
	}

	@Override
	public Integer somarValoresPrimosPosicoes(int[] valores) { 
		int soma = 0; 
				
		for(int i = 2; i<valores.length; i++) {
			boolean primo = true;
			
			for(int j = 2; j < valores[i]; j++) {
				if(valores[i] % j == 0) {
				primo = false;
				break;
				}
			}
			
			if(primo) {
				soma += valores[i];
			}
		}
		
		return soma;
	}

	@Override
	public Integer somarValoresPosicoesParesMultiplosDe(Integer limite, Integer multiplo) {
		int soma = 0;
		for(int i = 0 ; i<= limite; i++) { 
			if(i % 2 == 0) {
				if(i % multiplo == 0) {
					soma += i;
				}
			} 
		}		
		return soma;
	}

	@Override
	public boolean multiploDeSete(int valor) { 
		
		if(valor == 0) {
			return false;
		}
		else if(valor % 7 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String parOuImpar(int valor) { 
				
		if (valor % 2 == 0) {
			return "PAR";
		}
		else{ 
			return "IMPAR";
		}
	}

	@Override
	public String parOuImparOuZero(int valor) { 
		if(valor == 0) {
			return "ZERO";
		} else if(valor % 2 == 0) {
			return "PAR";
		}
		else {
			return "ÍMPAR";
		}
	}

	@Override
	public int[] obterDobrosAteDobroInformado(int valor) { 
		int limite = valor * 2;
		int [] resposta = new int[valor +1];
		
		int index = 0;				
		
		while (valor <= limite ) {
		
			resposta[index] = valor * 2;
			index++;									
			valor++;
			}
	
			return resposta;
	}
	
	

	@Override
	public int[] obterDobrosAteDez(int valor) { 
						
		int tamanho = 10 - valor;
		
		if(valor>10) {
			tamanho = -1;
		}
		
		int[] resposta = new int[tamanho+1];
		int index = 0;
		
		while(valor<=10) {
			resposta[index] = valor*2;
			index++;
			valor++;
		}				
		return resposta;
	}

	

	@Override
	public int[] obterDobrosAteMil(int valor) { 
		
		int index = 0;
		int tamanho= 0;
		int calcTamanho = valor;
						
		while(calcTamanho <= 1000) {
			calcTamanho = calcTamanho * 2;
			tamanho++;
		}		
		
		int dobro = valor*2;				
		int[]resposta = new int[tamanho];
		
		if(valor<=1000) {
			do {
				resposta[index] = dobro;
				
				dobro += dobro;
				index++;
			
				
			} while(dobro <=1000);
		}
		else {
			tamanho = 1;
			resposta = new int[1];
			resposta[0] = dobro;
		}
		
		resposta[index] = dobro;
		
		return resposta;
	}
	
	

	@Override
	public int[][] tabuada(int valor) { 
		 int coluna = 3;
		 int totalMultiplicacoes = valor * 10;
		 int index = 0;
		  
		 int[][] tabuada = new int[totalMultiplicacoes][coluna];


		    for (int numero = 1; numero <= valor; numero++) {
		        for (int coeficiente = 1; coeficiente <= 10; coeficiente++) {
		            tabuada[index][0] = numero;
		            tabuada[index][1] = coeficiente;
		            tabuada[index][2] = numero * coeficiente;
		            index++;
		        }
		    }
		    return tabuada;
	}
}
