import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String numero1 = JOptionPane.showInputDialog("Digite o primeiro n�mero:");
		String numero2 = JOptionPane.showInputDialog("Digite o segundo n�mero:");
		
		int var1 = Integer.parseInt(numero1);
		int var2 = Integer.parseInt(numero2);
		String maiorNumero = "";
		if (var1 > var2) {
			maiorNumero += "O maior n�mero � " + numero1;
		} else {
			if (var1 < var2) {
				maiorNumero += "O maior n�mero � " + numero2;
			} else {
				maiorNumero ="N�meros iguais " + var1;
			}
		}
		JOptionPane.showMessageDialog(null, maiorNumero);
		System.exit(0);
	}

}
