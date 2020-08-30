package com.bruno.cursojava.aula17;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.NumberFormat;
public class Exercicio32 {

public static void main(String[] args) {
/*
* O cardápio de uma lanchonete é o seguinte:
Especificação Código Preço
Cachorro Quente 100 R$1,20
Bauru Simples 101 R$1,30
Bauru com ovo 102 R$1,50
Hambúrger 103 R$1,20
Cheeseburger 104 R$1,30
Refrigerante 105 R$1,00

Faça um programa que leia o código dos itens pedidos
e as quantidades desejadas. Calcule e mostre o valor a ser pago
por item (preço * quantidade) e o total geral do pedido.
Considere que o cliente deve informar quando o pedido deve ser encerrado.
*/

double preco1=0,preco2=0,preco3=0,preco4=0,preco5=0,preco6=0,
total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,totalgeral=0;
String resp="",prod1="",prod2="",prod3="",prod4="",prod5="",prod6="";
int cod=0,qtd=0;

Scanner scan = new Scanner (System.in);

do {


try {
System.out.println("Digite o código do item:");
cod = scan.nextInt();

if (cod <100 || cod >105) {
System.out.println("Código inválido!");
main(args);
}
}catch (InputMismatchException e) {
System.out.println("Valor inválido!");
main (args);
}

try {
System.out.println("Digite a quantidade do item");
qtd = scan.nextInt();

}catch (InputMismatchException e) {
System.out.println("Valor inválido!");
main (args);
}

	switch (cod) {
		case 100:
		prod1 ="Cachorro Quente";
		preco1 = 1.20;
		total1 = (qtd * preco1)+total1;
	break;

	case 101:
		prod2 ="Bauru Simples";
		preco2 = 1.30;
		total2 = (qtd * preco2)+total2;
	break;
	case 102:
		prod3 ="Bauru com ovo";
		preco3 = 1.50;
		total3 = (qtd * preco3)+total3;
	break;
	case 103:
		prod4 ="Hambúrger";
		preco4 = 1.20;
		total4 = (qtd * preco4)+total4;
	break;
	case 104:
		prod5 ="Cheeseburger";
		preco5 = 1.30;
		total5 = (qtd * preco5)+total5;
	break;
	case 105:
		prod6 ="Refrigerante";
		preco6 = 1.00;
		total6 = (qtd * preco6)+total6;
	break;
}

System.out.println("Deseja digitar outro prduto?");
resp = scan.next();


}while (resp.equalsIgnoreCase("S")||resp.equalsIgnoreCase("Sim"));

if (total1 >0) {
System.out.println("Total de cachorro quente:"+NumberFormat.getCurrencyInstance().format(total1));
}

if (total2 >0) {
System.out.println("Total de bauru simples:"+NumberFormat.getCurrencyInstance().format(total2));
}

if (total3>0) {
System.out.println("Total de bauru com ovo:"+NumberFormat.getCurrencyInstance().format(total3));
}

if (total4>0) {
System.out.println("Total de hambúrger:"+NumberFormat.getCurrencyInstance().format(total4));
}

if(total5>0) {
System.out.println("Total de cheeseburger:"+NumberFormat.getCurrencyInstance().format(total5));
}

if (total6 >0) {
System.out.println("Total de refrigerante:"+NumberFormat.getCurrencyInstance().format(total6));
}

totalgeral = total1 + total2 +total3 +total4 + total5+total6;

System.out.println("Total geral:" +NumberFormat.getCurrencyInstance().format(totalgeral));

}

}
