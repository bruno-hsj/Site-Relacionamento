package siterelacionamento;

public class Amigo extends Contato {
    protected int grau;
    
    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;
    }

    public int getGrau() {
        return grau;
    }
    
    @Override
    public void imprimirContato() {
        String  resultado = imprimirBasico();
        
        if(getGrau() == 1){
            resultado += "Grau: Melhor amigo";
        }
        if (getGrau() == 2){
            resultado += "Grau: Amigo";
        }
        if (getGrau() == 3){
            resultado += "Grau: Conhecido";
        }
        
        System.out.println(resultado);
    }
    
    }

