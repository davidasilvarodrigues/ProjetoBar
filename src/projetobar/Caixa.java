package projetobar;

    public class Caixa {
    
	private double totalCaixa;

	private boolean aberto;
        
        public Caixa(){
            totalCaixa=0;
            aberto=true;
        }
        public void fecharCaixa(){
            System.out.println("O caixa tem R$"+totalCaixa);
            aberto=false;
        }

}
