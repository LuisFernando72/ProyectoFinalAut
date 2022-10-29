
package No_determinista;

import java.util.ArrayList;
public class Automata {

    Estado inicio;
    ArrayList<Estado> finales;
    ArrayList<Estado> estados;
    
    public Automata() {        
        finales = new ArrayList<Estado>();
        estados = new ArrayList<Estado>();
    }    

    void setEstadoInicio(Estado inicio){
        this.inicio = inicio;
    }
    
    void agregarEstado(Estado estado){
        this.estados.add(estado);
    }
    
    void agregarEstadoFinal(Estado estado){
        this.finales.add(estado);
    }
}
