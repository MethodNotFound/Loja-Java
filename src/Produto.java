import java.util.Random;

import javax.swing.JOptionPane;

class Produto implements Produtos {
	private int codigo;
	private double custo;
	private int estoque;
	private String nome;
	private String descricao;

	private int fabricanteNumero;
	private String fabricanteNome;

	public void inserirDados(){
		this.codigo = gerarCodigo();

		this.nome = JOptionPane.showInputDialog("nome: ");
		this.descricao = JOptionPane.showInputDialog("descricao: ");
		this.custo = Double.parseDouble(
			JOptionPane.showInputDialog("custo: ")
		);
		this.estoque = Integer.parseInt(
			JOptionPane.showInputDialog("estoque: ")
		);
	}
	
	public String dados() {
		String dados = ""; 
		dados += "codigo: " + this.codigo + "\n";
		dados += "custo: " + this.custo + "\n";
		dados += "estoque: " + this.estoque + "\n";
		dados += "nome: " + this.nome + "\n";
		dados += "descrição: " + this.descricao + "\n";
		dados += "fabricante nome: " + this.fabricanteNome + "\n";
		dados += "fabricante numero: " + this.fabricanteNumero + "\n";
		dados += "preço: " + valorDeVenda() + "\n";
		return dados;
	}

	public void mostrarDados(){
		JOptionPane.showMessageDialog(null, dados());
	}

	public double valorDeVenda(){
		return this.custo;
	}

	private int gerarCodigo() {
		Random rand = new Random();
		return rand.nextInt(2*32-1);
	}
}