import javax.swing.JOptionPane;

public class Exercicio4 {
	
/* Com while!!!
 * 
	public static void main(String[] args) {
		String quantidade = JOptionPane.showInputDialog("Digite quantos filhos: ");
		int filhos = Integer.parseInt(quantidade);
		int contador = 1;
		String relatorio = "";
		while (contador <= filhos) {
			String nomeDoFilho = JOptionPane.showInputDialog("Digite o nome do filho " + contador);
			String idadeDoFilho = JOptionPane.showInputDialog("Digite a idade do filho " + contador);
			relatorio += " nome= " + nomeDoFilho + " idade= " + idadeDoFilho + "\n";
			++contador;
		}
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
	}*/
	
	
	
	// Com for
	public static void main(String[] args) {
		String quantidade = JOptionPane.showInputDialog("Digite quantos filhos: ");
		int filhos = Integer.parseInt(quantidade);
		String relatorio = "";
		for (int i = 1; i <= filhos;i++) {
			String nomeDoFilho = JOptionPane.showInputDialog("Digite o nome do filho: " + i);
			String idadeDoFilho = JOptionPane.showInputDialog("Digite a idade do filho " + i);
			String item = " nome " + nomeDoFilho + " idade " + idadeDoFilho + "\n";
			relatorio += item;
		}
		JOptionPane.showMessageDialog(null, relatorio);
		System.exit(0);
		
	}
}
