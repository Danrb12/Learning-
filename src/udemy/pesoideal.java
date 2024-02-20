package udemy;


import javax.swing.JOptionPane;

public class pesoideal {
    public static void main(String[] args) {
        // Declaração de variáveis
        double al, pesoM, pesoF;
        char sexo;

        // Solicitando entrada do usuário para o sexo usando JOptionPane
        String sexoInput = JOptionPane.showInputDialog("Coloque M para masculino e F para feminino");
        if (sexoInput != null && !sexoInput.isEmpty()) { // Verifica se a entrada não é nula ou vazia
            sexo = sexoInput.charAt(0); // Obtendo o primeiro caractere da entrada

            // Solicitando entrada do usuário para a altura usando JOptionPane
            String alturaInput = JOptionPane.showInputDialog("Digite sua altura:");
            if (alturaInput != null && !alturaInput.isEmpty()) { // Verifica se a entrada não é nula ou vazia
                al = Double.parseDouble(alturaInput); // Convertendo a entrada para um double
                
                // Calculando o peso ideal com base no sexo
                if (sexo == 'M' || sexo == 'm') {
                    pesoM = (al * 72.7) - 58;
                    String pesoformatado = String.format("%.1f", pesoM);
                    JOptionPane.showMessageDialog(null, "Peso ideal homem = " + pesoformatado);
                } else if (sexo == 'F' || sexo == 'f') {
                    pesoF = (al * 62.1) - 44.7;
                    String pesoformatado = String.format("%.1f", pesoF);
                    JOptionPane.showMessageDialog(null, "Peso ideal mulher = " + pesoformatado);
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido. Por favor, insira M para masculino ou F para feminino.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Altura inválida. Por favor, insira um valor numérico válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sexo inválido. Por favor, insira M para masculino ou F para feminino.");
        }
    }


	

	private static String JOpitonPaneshowInputDialog(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
