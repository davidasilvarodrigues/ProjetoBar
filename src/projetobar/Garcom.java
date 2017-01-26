package projetobar;

public class Garcom extends Pessoa {
        private Conta contas[];
        public Garcom(String nome,int cpf,String endereco){
            this.nome=nome;
            this.cpf=cpf;
            this.endereco=endereco;
            contas= new Conta[0];
        }

	public void cobraConta() {
            
	}

	public void abrirConta(int numMesa) {
            contas[numMesa]= new Conta();
	}

}
