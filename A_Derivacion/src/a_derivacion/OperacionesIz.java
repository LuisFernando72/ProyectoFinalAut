package a_derivacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Luis Fernando Paxel
 */
public class OperacionesIz {

    private ArrayList<String> A_noterminal = new ArrayList<>();
    private ArrayList<String> A_hojas = new ArrayList<>();
    private ArrayList<String> hMayus_hojas = new ArrayList<>();
    private Map<String, Integer> h_hojas = new HashMap<>();

    public OperacionesIz() {
    }

    public void vaciar() {
        A_noterminal.clear();
        A_hojas.clear();
        hMayus_hojas.clear();
        h_hojas.clear();
    }

    public int ContMayus(String cadena) {

        String frase2 = cadena.replaceAll("\\s+", "");
        char[] myChars = frase2.toCharArray();

        int contador = 0;
        for (int i = 0; i < myChars.length; i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {

                contador++;
            }
        }
        return contador;
    }

    //BUSCANDO MAYUSCULAS 
    public String BuscarMayus(String texto) {
        String frase2 = texto.replaceAll("\\s+", "");
        char[] myChars = frase2.toCharArray();
        String resultado = "";
        int contador = 0;
        for (int i = 0; i < myChars.length; i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                resultado = String.valueOf(texto.charAt(i));
                //System.out.println("Buscando Mayus: " + resultado);
                A_noterminal.add(resultado);
                contador++;
            }
        }
        return resultado;
    }

    public String BuscarMayus2(String texto) {
        String frase2 = texto.replaceAll("\\s+", "");
        char[] myChars = frase2.toCharArray();
        String resultado = "";
        int contador = 0;
        for (int i = 0; i < myChars.length; i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                resultado = String.valueOf(texto.charAt(i));
                //System.out.println("Buscando Mayus: " + resultado);
                A_hojas.add(resultado);
                contador++;
            }
        }
        return resultado;
    }

    public String BuscarHMayus(String texto) {
        String frase2 = texto.replaceAll("\\s+", "");
        char[] myChars = frase2.toCharArray();
        String resultado = "";
        int contador = 0;
        for (int i = 0; i < myChars.length; i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                resultado = String.valueOf(texto.charAt(i));
                //  System.out.println("Buscando Mayus: " + resultado);
                hMayus_hojas.add(resultado);
                contador++;
            }
        }
        return resultado;
    }

    //VERIFICAR COMO SE ORDENA LOS DATOS DE ENTRADA YA DESPUES ITERAR POR BUCLE
    public String OrdenarMayus(String texto) {
        String frase2 = texto.replaceAll("\\s+", "");
        char[] myChars = frase2.toCharArray();
        String resultado = "";
        int contador = 0;
        for (int i = 0; i < myChars.length; i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                resultado = String.valueOf(texto.charAt(i));
                //System.out.println("res: " + texto);
                contador = texto.length();
            }

        }

        h_hojas.put(frase2, contador);

        return resultado;
    }

    public ArrayList<String> getA_noterminal() {
        return A_noterminal;
    }

    public void setA_noterminal(ArrayList<String> A_noterminal) {
        this.A_noterminal = A_noterminal;
    }

    public Map<String, Integer> getH_hojas() {
        return h_hojas;
    }

    public void setH_hojas(Map<String, Integer> h_hojas) {
        this.h_hojas = h_hojas;
    }

    public ArrayList<String> getA_hojas() {
        return A_hojas;
    }

    public void setA_hojas(ArrayList<String> A_hojas) {
        this.A_hojas = A_hojas;
    }

    public ArrayList<String> gethMayus_hojas() {
        return hMayus_hojas;
    }

    public void sethMayus_hojas(ArrayList<String> hMayus_hojas) {
        this.hMayus_hojas = hMayus_hojas;
    }

}
