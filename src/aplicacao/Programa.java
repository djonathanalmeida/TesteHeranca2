package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyyy");
		List<Produto> list = new ArrayList<>();
		
		System.out.println("Informe o número de produtos: ");
		int x = sc.nextInt();
		
		for(int i=1; i<= x; i++) {
			System.out.println("Produto #" + i + ": ");
			System.out.println("Comum, usado ou importado?");
			char y = sc.next().charAt(0);
			System.out.println("Descrição: ");
			String nome = sc.next();
			System.out.println("Preço: ");
			Double preco = sc.nextDouble();
			
			if(y == 'u') {
				System.out.println("Data de Fabricação: ");
				Date data = sd.parse(sc.next());
				list.add(new ProdutoUsado(nome, preco, data));
			}else if(y == 'i') {
				System.out.println("Taxa: ");
				Double taxa = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxa));
			}else {
				list.add(new Produto(nome, preco));
			}
		}
		
		for(Produto ls : list) {
			System.out.println(ls.precoEtiqueta());
		}
		
		
		sc.close();

	}

}
