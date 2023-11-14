package siterelacionamento;

import java.util.ArrayList;
import java.util.Scanner;

public class UsaContatos {

    public static void main(String[] args) {
        int op, subTipo, indice;
        boolean trava = true;
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        
        
        while(trava){
            op = input.nextInt();
            
            switch (op){
                case 1: //Inserir Contatos
                    subTipo = input.nextInt();
                    
                    //Seleciona o tipo de contato a ser adicionado
                    if (subTipo == 1){
                        Amigo amigos = new Amigo(input.next(), input.next(), input.next(), input.next(), input.nextInt());
                        contatos.add(amigos);
                    } else if (subTipo == 2){
                        Familia familiares = new Familia(input.next(), input.next(), input.next(), input.next(), input.next());
                        contatos.add(familiares);
                    } else if (subTipo == 3){
                        ColegasDeTrabalho colegas = new ColegasDeTrabalho(input.next(), input.next(), input.next(), input.next(), input.next());
                        contatos.add(colegas);
                    }
                    
                    break;
                    
                case 2: //Exibe todos os contatos (Objetos do arraylist conntatos)
                    
                    for (Contato c: contatos){
                        c.imprimirContato();
                    }
                    
                    break;
                    
                case 3: //Exibe apenas os contatos que são instancia de Familia
                    
                    for (Contato c: contatos){
                        if (c instanceof Familia){
                            c.imprimirContato();
                        }
                    }
                    
                    break;
                    
                case 4: //Exibe apenas os contatos que são instancia de Amigos
                    
                    for (Contato c: contatos){
                        if (c instanceof Amigo){
                            c.imprimirContato();
                        }
                    }
                    
                    break;
                    
                case 5: //Exibe apenas os contatos que são instancia de Colegas de Trabalho
                    
                    for (Contato c: contatos){
                        if (c instanceof ColegasDeTrabalho){
                            c.imprimirContato();
                        }
                    }
                    
                    break;
                    
                case 6:
                    
                    for (Contato c: contatos){
                        if (c instanceof Amigo){
                            if (((Amigo) c).getGrau() == 1){
                                c.imprimirContato();
                            }
                        }
                        
                        if (c instanceof Familia familia){
                            if (familia.getParentesco().equals("irmão")){
                                c.imprimirContato();
                            }
                        }
                        
                        if (c instanceof ColegasDeTrabalho){
                            if (((ColegasDeTrabalho) c).getTipo().equals("colega")){
                                c.imprimirContato();
                            }
                        }
                    }
                    
                    break;
                    
                case 7:
                    indice = input.nextInt();
                    
                    Contato c = contatos.get(indice - 1);
                    c.imprimirContato();
                    break;
                    
                case 8:
                    trava = false;
                    break;
                
            }
            
        }
        
                
        
    }
    
}
