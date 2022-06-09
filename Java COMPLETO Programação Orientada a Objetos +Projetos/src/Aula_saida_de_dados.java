import java.util.Locale;

public class Aula_saida_de_dados {

	public static void main(String[] args) {
		
//So o print ele n�o faz quebra de linha, para isso deve usar o println.
		System.out.print("Ol� Mundo!");
		System.out.println("Bom Dia!");
		
//Para por a variavel n�o usar as " " , s�o apenas napa texto. 
		int y = 32; 
		System.out.println(y);
		
//Para escrever na tela conte�do com ponto flutuante e controlar o numero de casas decimais deve usar o printf("%.2f%n", variavel) onde o %.2f serve para escrever 2 casas decimais e o %n para quebrar a linha.
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
//O separador de casa decimal no Brasil � a V�RGULA, e o java coloca automaticamente por conta da localiza��o. E para trocar para o PONTO devemos usar esse comando Locale. E automaticamente o Eclipse j� importou a classe. 		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
//Para juntar v�rios elementos em um so comando de escrita no print/println basta usar o operador +
		System.out.println("RESULTADO = " + x + " METROS");
		
//Para juntar v�rios elementos em um so comando de escrita no printf basta colocar o texto completo e os marcadores para simbolizar as variaveis, e no final as vari�veis correspondentes.
		System.out.printf("RESULTADO = %.2f metros %n", x);
		
//Para juntar v�rios elementos em um mesmo comando de escrita com printf devemos usar a mesma regra acima e utilizar os marcadores: (%f = ponto flutuante) (%d = inteiro) (%s = texto) (%n = quebra de linha)
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
		
//Exerc�cio de Fixa��o
		System.out.println();
		System.out.println("Exerc�cio de fixa��o");
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F'; 
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		
		
		
	}

}
