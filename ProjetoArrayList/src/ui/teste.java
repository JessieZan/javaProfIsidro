package ui;

import java.util.ArrayList;
import java.util.ListIterator;

import core.Produto;

public class teste {

	public static void main(String[] args) {
		
		ArrayList<Produto> lista;
		lista = new ArrayList<Produto>();

		lista.add(new Produto(1, "Produto 01", 100, 2));
		lista.add(new Produto(2, "Produto 02", 200, 4));
		lista.add(new Produto(3, "Produto 03", 300, 5));
		lista.add(new Produto(4, "Produto 04", 400, 7));
		
		//resolucao com listItarator
		
		ListIterator<Produto>
		
        iterator = lista.listIterator();
		
		Produto p = new Produto(lista.get(0));
		
		while (iterator.hasNext()) {
			
			if(iterator.next().getPreco() > p.getPreco()) {
				p = iterator.next();
			} 
            
        }
		
		System.out.println(p);
		
		Produto p2 = lista.get(0);
		
		while (iterator.hasNext()) {
			
			if(iterator.next().getPreco() < p2.getPreco()) {
				p = iterator.next();
			} 
            
        }
		
		System.out.println(p2);
		
		double valorTotal = lista.get(0).getPreco() * lista.get(0).getQtddEmEstoque();
		
		while (iterator.hasNext()) {
			
			
			valorTotal += iterator.next().getPreco() * iterator.next().getQtddEmEstoque();
            
        }
		
		System.out.println(valorTotal);
		
		
		//resolucao com for do profe
		Produto maisBarato = lista.get(0), maisCaro = lista.get(0);
		double totalEmEstoque = 0;
		
		
		for (Produto produto : lista) {
			  if(produto.getPreco() > maisCaro.getPreco()) {
				  maisCaro = produto;
			  }
			  
			  if(produto.getPreco() < maisBarato.getPreco()) {
				  maisBarato = produto;
			  }
			  
			  totalEmEstoque += produto.getPreco()  * produto.getQtddEmEstoque();
			}
		
		
		System.out.println("Mais Caro: "+ maisCaro);
		System.out.println("Mais Barato: "+ maisBarato);
		System.out.println("Total de valor em estoque: "+ totalEmEstoque);
		
		
	}

}
