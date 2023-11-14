package siterelacionamento;


public class ColegasDeTrabalho extends Contato {
    protected String tipo;
    
    
    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    @Override
    public void imprimirContato() {
        String resultado = imprimirBasico();
        resultado += "Relacionamento de trabalho: " +getTipo();
    
        System.out.println(resultado);
    }

    
}
