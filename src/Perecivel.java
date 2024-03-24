import javax.swing.JOptionPane;

public class Perecivel extends Produto{
	private int fabricacaoAno;
	private int fabricacaoMes;
	private int validadeMeses;

	public void inserirDados(){
		super.inserirDados();

		this.fabricacaoAno = Integer.parseInt(
			JOptionPane.showInputDialog("ano da fabricação: ")
		);

		this.fabricacaoMes = Integer.parseInt(
			JOptionPane.showInputDialog("mes da fabricação: ")
		);

		this.validadeMeses = Integer.parseInt(
			JOptionPane.showInputDialog("total de meses de validade: ")
		);
	}

	public String dados() {
		String dados = super.dados();
		dados += "ano de fabricação : " + this.fabricacaoAno + "\n";
		dados += "mês de fabricação: " + this.fabricacaoMes + "\n";
		dados += "meses de validade: " + this.validadeMeses + "\n";

		return dados;
	}
}
