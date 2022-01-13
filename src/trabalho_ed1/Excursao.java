package trabalho_ed1;

public class Excursao {
	private String destino;
	private int col_poltrona;
	private  int lin_poltrona;
	private int passagem;
	private int count = 0;
	
	public int getLin_poltrona() {
		return lin_poltrona;
	}
	public void setLin_poltrona(int lin_poltrona) {
		this.lin_poltrona = lin_poltrona;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getCol_poltrona() {
		return col_poltrona;
	}
	public void setCol_poltrona(int col_poltrona) {
		this.col_poltrona = col_poltrona;
	}
	public int getPassagem() {
		return passagem;
	}
	public void setPassagem(int passagem) {
		this.passagem = passagem;
	}
	
	public void contadorAdiciona() {
		this.count++;
	}
	public void contadorDiminui() {
		this.count--;
	}
	
	public int getCount() {
		return count;
	}
	
	public void somaValor() {
		int valor_final = this.passagem * this.count;
		System.out.println("Sua excursão teve " + this.count 
							+ " passageiros, com cada passagem custando R$" 
							+ this.passagem + ", totalizando R$"
							+ valor_final + ".");
	}
	
}
