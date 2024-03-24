import java.util.Vector;

import javax.swing.JOptionPane;

public class Main {
	private static Vector<Produtos> produtos;
	
	public static void main(String[] args) {
		produtos = new Vector<Produtos>();

		fazerAcao();
	}
	
	private static void fazerAcao() {
		while(true) {
			String acao = JOptionPane.showInputDialog(
				"açao cadastrar/mostrar"
			);

			if (acao.equals("cadastrar")) {
				Produtos produto = criarProduto();
				produto.inserirDados();
				produtos.add(produto);
			}
			if (acao.equals("mostrar")) {
				for(int i = 0; i < produtos.size(); i++) {
					produtos.get(i).mostrarDados();
				}

				System.exit(0);
			}
		}
	}

	private static Produtos criarProduto() {
		String tipo = JOptionPane.showInputDialog(
			"tipo do produto eletronico/naoperecivel/perecivel :"
		);
		
		if (tipo.equals("eletronico"))
			return new Eletronico();
		if (tipo.equals("perecivel"))
			return new Perecivel();
		if (tipo.equals("naoprecivel"))
			return new NaoPerecivel();

		return criarProduto();
	}
}
