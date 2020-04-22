import javax.swing.JOptionPane;

public class Exercicio {

	public static void main(String[] args) {
		String idade = JOptionPane.showInputDialog("Dgite sua idade: ");
		int valor = Integer.parseInt(idade);
		String mensagem = " ";
		if (valor >=18) {
			mensagem = "Você pode tirar carteira de motorista";
		}else {
			mensagem = "Você não pode tirar carteira de motorista";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		System.exit(0);
		
	}

}
