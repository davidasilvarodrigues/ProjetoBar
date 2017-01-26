package projetobar;

public class Gerente extends Pessoa {
        private boolean caixaAberto;
        private Caixa caixa1;
        public Gerente(String nome,int cpf,String endereco){
            this.caixaAberto=false;
            this.caixa1=null;
            this.nome=nome;
            this.cpf=cpf;
            this.endereco=endereco;
        }
	public void cancelaConta(int numMesa,Conta contas[]) {
            contas[numMesa]=null;
	}

	public void abrirCaixa() {
            if(!caixaAberto){
                caixaAberto=true;
                caixa1= new Caixa();
            }
                
	}

	public void fecharCaixa() {
            try{
                caixa1.fecharCaixa();
            }catch(Exception e){
                System.out.println("Caixa não aberto");
            }
	}

}
