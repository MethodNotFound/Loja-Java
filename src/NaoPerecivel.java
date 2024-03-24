import javax.swing.JOptionPane;

public class NaoPerecivel extends Produto {
	private int garantiaLojaAnos;

	public void inserirDados(){
		super.inserirDados();
		this.garantiaLojaAnos = Integer.parseInt(
			JOptionPane.showInputDialog("anos de garantia da loja: ")
		);
	}

	public String dados() {
		String dados = super.dados();
		dados += "garantia da loja em anos: " + this.garantiaLojaAnos + "\n";

		return dados;
	}
}
