import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int contador = 1;
		double total = 0;
		while ( contador <= 12) {
			String salario = JOptionPane.showInputDialog("Digite o " + contador + " sal�rio");
			double valor = Double.parseDouble(salario);
			total += valor;
			++contador;
		}
		double media = total / 12;
		JOptionPane.showMessageDialog(null, "A m�dia do sal�rio do " + nome + " � de " + media);
		System.exit(0);
	}

}
