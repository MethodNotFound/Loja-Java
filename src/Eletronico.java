import javax.swing.JOptionPane;

public class Eletronico extends NaoPerecivel{
	private int garantiaFabricanteAnos;

	public void inserirDados(){
		super.inserirDados();
		this.garantiaFabricanteAnos = Integer.parseInt(
			JOptionPane.showInputDialog("anos de garantia do fabricante: ")
		);
	}

	public String dados() {
		String dados = super.dados();
		dados += "garantia do fabricante em anos: " + this.garantiaFabricanteAnos + "\n";

		return dados;
	}
}
