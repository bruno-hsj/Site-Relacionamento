package siterelacionamento;

public abstract class Contato {
    protected String nome;
    protected String apelido;
    protected String email;
    protected String aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getEmail() {
        return email;
    }

    public String getAniversario() {
        return aniversario;
    }
    
    
    
    public String imprimirBasico(){
        return "Nome: " + getNome() +
               "\nApelido: " + getApelido() +
               "\nEmail: " + getEmail()+
               "\nAniversário: " +getAniversario() + "\n"
                ;
    };
    
    public abstract void imprimirContato();
    
}
