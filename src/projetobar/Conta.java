package projetobar;

public class Conta {

	private double totalPagar;
        
        public Conta(){
            this.totalPagar=0;
        }
	public double geTotal() {
		return this.totalPagar;
	}
        public void addCusto(double valor)
        {
            totalPagar+=valor;
        }
}
