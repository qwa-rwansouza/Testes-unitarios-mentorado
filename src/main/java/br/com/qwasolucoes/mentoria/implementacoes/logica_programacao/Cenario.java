package br.com.qwasolucoes.mentoria.implementacoes.logica_programacao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Cenario {
public static void main(String[] args) {
LogicaProgramacaoProvider lpp = new LogicaProgramacaoProvider();

Locale.setDefault(Locale.US);

//EXERCÍCIO ANTECESSOR E SUCESSOR - STRING
String[] resposta = {"teste 1", "teste 2" ,"outro teste", "mais um teste"};

String[] teste = lpp.antecessorSucessorPor(resposta, "outro teste");

System.out.println(Arrays.toString(teste));
		
/*
//EXERCÍCIO ANTECESSOR E SUCESSOR - INT
String [] resposta = {"teste", "outra coisa", "texto", "não sei"};

String[] teste = lpp.antecessorSucessorPor(resposta, 1);

System.out.println(Arrays.toString(teste));
*/

/*
//EXERCÍCIO LISTA DE PRIMOS
List<Integer> teste = lpp.numerosPrimos(30);
System.out.println(teste);
*/

/*
//EXERCÍCIO LISTA DE ÍMPARES
List<Integer> limite = lpp.numerosImpares(22);
System.out.println(limite);
*/

/*
//EXERCÍCIO LIST DE PARES
List<Integer> limite = lpp.numerosPares(22);
System.out.println(limite);
*/

/*
//EXERCÍCIO QUANTIDADE DE PARES, ÍMPARES E PRIMOS DE UMA LISTA
List<Integer> valores = new ArrayList<>();
valores.add(1);
valores.add(2);
valores.add(3);
valores.add(4);
valores.add(5);
valores.add(6);
valores.add(7);
valores.add(8);
valores.add(23);
valores.add(11);

int[] teste = lpp.quantidadeParesImparesPrimos(valores);

System.out.println(Arrays.toString(teste));
*/


/*
//EXERCÍCIO TEXTO QUE SE REPETE MAIS
List<String> textos = new ArrayList<>();
textos.add("Um texto qualquer");
textos.add("Mais um texto");
textos.add("Outro texto");
textos.add("Um texto qualquer");
textos.add("Nada de nada");
textos.add("Outro texto");
textos.add("Um texto qualquer");

String teste = lpp.valorTextoMaiorQtdDuplicados(textos);


System.out.println("Lista inteira: " + textos);
System.out.println("Texto mais duplicado: " + teste);
*/

/*
//EXERCÍCIO VALOR INTEIRO QUE SE REPETE MAIS
List<Integer> numeros = new ArrayList<>();
numeros.add(2);
numeros.add(2);
numeros.add(1);
numeros.add(1);
numeros.add(2);
numeros.add(5);
numeros.add(5);
numeros.add(5);
numeros.add(5);

Integer teste = lpp.valorInteiroMaiorQtdDuplicados(numeros);


System.out.println("Lista completa: " + numeros);
System.out.println("O número mais repetido é o " + teste  );


*/
/*
//EXERCÍCIO REMOVER VALORES DUPLICADOS - BIGDECIMAL

List<BigDecimal> numeros = new ArrayList<>();
numeros.add(new BigDecimal(4.48));
numeros.add(new BigDecimal(4.48));
numeros.add(new BigDecimal(8.78));
numeros.add(new BigDecimal(4.00));
numeros.add(new BigDecimal(8.78));
numeros.add(new BigDecimal(2.60));

for (int i = 0; i < numeros.size(); i++) {
    
	BigDecimal numeroArredondado = numeros.get(i).setScale(2, RoundingMode.HALF_UP);
    
    numeros.set(i, numeroArredondado);
}

List<BigDecimal> teste = lpp.removerValoresDuplicados(numeros);

System.out.println("Lista inteira: " + numeros);
System.out.println("Lista sem duplicados: " + teste);
*/


/*
//EXERCÍCIO REMOVER TEXTOS DUPLICADOS
List<String> textos = new ArrayList<>();
textos.add("Um texto qualquer");
textos.add("Mais um texto");
textos.add("Outro texto");
textos.add("Um texto qualquer");
textos.add("Nada de nada");
textos.add("Outro texto");
textos.add("Um texto qualquer");

List<String> teste = lpp.removerTextosDuplicados(textos);

System.out.println("Lista inteira: " + textos);
System.out.println("Lista sem duplicados: " + teste);
*/



/*
//EXERCÍCIO REMOVER INTEIROS DUPLICADOS
List<Integer> numeros = new ArrayList<>();
numeros.add(2);
numeros.add(4);
numeros.add(8);
numeros.add(2);
numeros.add(8);
numeros.add(2);
numeros.add(9);

List<Integer> teste = lpp.removerInteirosDuplicados(numeros);
System.out.println("Lista inteira: " + numeros);
System.out.println("Lista sem duplicados: " + teste);
*/


/*
//EXERCÍCIO TEXTO DUPLICADO
List<String> textos = new ArrayList<>();
textos.add("Frase 1");
textos.add("Frase sem nexo");
textos.add("Frase 1");
textos.add("Frase ABC");
textos.add("Frase qualquer");
textos.add("Frase ABC");

List<String> teste = lpp.listaTextoDuplicados(textos);


System.out.println("Textos: "+ textos);
System.out.println("Textos duplicados: " + teste);
*/

/*
//EXERCÍCIO DECIMAL DUPLICADO NA LISTA
List<BigDecimal> numeros = new ArrayList<>();
numeros.add(new BigDecimal(1.48));
numeros.add(new BigDecimal(1.2));
numeros.add(new BigDecimal(1.48));

for (int i = 0; i < numeros.size(); i++) {
    
	BigDecimal numeroArredondado = numeros.get(i).setScale(2, RoundingMode.HALF_UP);
    
    numeros.set(i, numeroArredondado);
}

List<BigDecimal> teste = lpp.listaDecimalDuplicados(numeros);

System.out.println("Lista: " +  numeros);
System.out.println("Lista dos números repetidos: " + teste);


/*
//EXERCÍCIO NÚMEROS DUPLICADOS NA LISTA

List<Integer> numeros = new ArrayList<>();        
numeros.add(1);
numeros.add(1);
numeros.add(2);
numeros.add(3);

List<Integer> teste = lpp.listaInteirosDuplicados(numeros);


System.out.println("Lista: " + numeros);
System.out.println("Lista dos números repetidos: " + teste);
*/

/*
//EXERCÍCIO TABUADA
int[][] teste = lpp.tabuada(8);
int index = 0;
for(int i = 0; i<teste.length; i++) {
System.out.println(Arrays.toString(teste[index])  );
index++;
}
*/

/*
//EXERCÍCIO DOBROS ATÉ MIL
int[] teste = lpp.obterDobrosAteMil(1500);
System.out.println(Arrays.toString(teste));
*/

/*
//EXERCÍCIO DOBROS ATÉ 10
int[] teste = lpp.obterDobrosAteDez(3);
System.out.println(Arrays.toString(teste));
*/

/*
//EXERCÍCIO DOBROS ATÉ VALOR INFORMADO
int[] teste = lpp.obterDobrosAteDobroInformado(5);
System.out.println(Arrays.toString(teste));
*/


/*
//EXERCÍCIO SOMAR VALORES PRIMOS
Integer teste = lpp.somarValoresPrimos(11);
System.out.println(teste);
*/


/*
//EXERCÍCIO SOMAR VALORES POSIÇÕES
int[] numeros = { 1, 2, 3, 4, 5};
Integer teste = lpp.somarValoresPosicoes(numeros);
System.out.println(teste);
*/


/*
//EXERCÍCIO SOMAR VALORES PARES POSIÇÕES
int[] numeros = {0, 5, 8, 9, 2, 4};
Integer teste = lpp.somarValoresParesPosicoes(numeros);
System.out.println(teste);
*/


/*
//EXERCÍCIO SOMAR VALORES ÍMPARES POSIÇÕES
int[] numeros = {1,2,3,4,2};
Integer teste = lpp.somarValoresImparesPosicoes(numeros);
System.out.println(teste);
*/


//EXERCÍCIO SOMAR VALORES PRIMOS POSIÇÕES
/*
int[] numeros = {1, 2, 3, 40, 7};
Integer teste = lpp.somarValoresPrimosPosicoes(numeros);
System.out.println(teste);
*/

/*
//EXERCÍCIO SOMAR VALORES DOS NÚMEROS PARES DO MÚLTIPLO ESCOLHIDO
Integer teste = lpp.somarValoresPosicoesParesMultiplosDe(10,2 );
System.out.println(teste);
*/


/*
//EXERCÍCIO MULTIPLOS DE SETE
boolean teste = lpp.multiploDeSete(70);
System.out.println(teste);
teste = lpp.multiploDeSete(9);
System.out.println(teste);
*/

/*
//EXERCÍCIO SOMAR VALORES
Integer teste = lpp.somarValores(10);
System.out.println(teste);
*/

/*
//EXERCÍCIO SOMAR VALORES PARES
Integer teste = lpp.somarValoresPares(11);
System.out.println(teste);
*/

/*
//EXERCÍCIO SOMAR VALORES ÍMPARES
Integer teste = lpp.somarValoresImpares(7);
System.out.println(teste);
*/

/*
//EXERCÍCIO PAR, ÍMPAR OU ZERO
String teste = lpp.parOuImparOuZero(0);
System.out.println(teste);
teste = lpp.parOuImparOuZero(10);
System.out.println(teste);
*/

/*
//EXERCÍCIO PAR OU ÍMPAR
String teste = lpp.parOuImpar(24);
System.out.println(teste);
*/


}

}