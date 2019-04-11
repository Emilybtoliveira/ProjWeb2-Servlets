import java.util.Calendar;

public class Contato {
    
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;

        public Contato (String nome, String email, String endereco, Calendar dataNascimento){
            this.nome = nome;
            this.email = email;
            this.endereco = endereco;
            this.dataNascimento = dataNascimento;
        }
        
	public String getNome() {
		return nome;
	}
        
	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}        

}
