package siterelacionamento;

public class Familia extends Contato {
    protected String parentesco;

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }
    
    
    @Override
    public void imprimirContato() {
        String resultado = imprimirBasico();
        resultado += "Parentesco: " +getParentesco();
     
        System.out.println(resultado);
    }
    
}
