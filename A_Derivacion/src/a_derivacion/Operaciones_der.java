package a_derivacion;

import static a_derivacion.arb_derivacion.getKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author Luis Fernando Paxel
 */
public class Operaciones_der {

    private HashMap<Integer, String> H_noterminal = new HashMap<>();
    private HashMap<Integer, String> H_terminal = new HashMap<>();
    private ArrayList<String> array_hojas = new ArrayList<>();

    private ArrayList<String> arb_derivacion_dere = new ArrayList<>();
    private ArrayList<String> Hojas = new ArrayList<>();
    private HashMap<Integer, String> inversa = new HashMap<>();

    ///TERMINALES
    private ArrayList<String> A_noterminal = new ArrayList<>();
    private ArrayList<String> A_hojas = new ArrayList<>();
    private ArrayList<String> hMayus_hojas = new ArrayList<>();
    private Map<String, Integer> h_hojas = new HashMap<>();

    public int altura;
    private int llevaA = 0;

    public Operaciones_der() {
    }

    arb_derivacion arb2 = new arb_derivacion();

    public void mostrarDerecha() {
        Derivacion_derecha2();
    }

    public void vaciar() {
        H_noterminal.clear();
        H_terminal.clear();
        array_hojas.clear();
        arb_derivacion_dere.clear();
        Hojas.clear();
        inversa.clear();
        A_noterminal.clear();
        A_hojas.clear();
        hMayus_hojas.clear();
        h_hojas.clear();
        altura = 0;
        llevaA = 0;
    }

    public void Derivacion_derecha2() {
//        System.out.println("No terminal: " + H_noterminal);
//        System.out.println("Terminal: " + H_terminal);
        Ordenando();
        Inversa();

        BuscarMayus(inversa.get(0));
        Contprodu();
        System.out.println(H_noterminal.get(0) + "=>" + H_terminal.get(0));
        Buscar_produccionDer();
    }

    public void Buscar_produccionDer() {
        int cuento = Duplicados();
        OrdenarMayor();
        for (int i = 0; i < A_noterminal.size(); i++) {
            String mayuscula = A_noterminal.get(i);
            System.out.println(mayuscula);

            for (int f = 0; f < array_hojas.size(); f++) {
                Object dos = getKey(H_terminal, array_hojas.get(f));
                String no_terminal = H_noterminal.get(dos);
                String terminal_1 = H_terminal.get(dos);
                if (mayuscula.equals(no_terminal)) {
                    String derecha = inversa.get(dos);

                    if (terminal_1.equals(terminal_1.toLowerCase())) {
                        llevaA++;
                        System.out.println(no_terminal + "=>" + terminal_1);

                        arb_derivacion_dere.add(no_terminal + "=>" + terminal_1);
                        Hojas.add(derecha);

                    } else {
                        llevaA++;
                        if (cuento > 1) {
                            System.out.println(no_terminal + "=>" + terminal_1);
                            arb_derivacion_dere.add(no_terminal + "=>" + terminal_1);
                            Terminal(derecha);
                            Hojas.add(derecha);

                            A_hojas.clear();
                        } else {
                            System.out.println(no_terminal + "=>" + terminal_1);
                            arb_derivacion_dere.add(no_terminal + "=>" + terminal_1);
                            Hojas.add(derecha);
                            Terminal(derecha);
                            A_hojas.clear();
                        }
                        break;
                    }

                }

            }
        }
    }

    public String Terminal(String noterminal) {
        String resultado = "";

        BuscarMayus2(noterminal);
        //   System.out.println("ARRAY HOJAS : " + A_hojas);
        for (int a = 0; a < A_hojas.size(); a++) {
            String Hojas2 = A_hojas.get(a);

            //  System.out.println("h: " + Hojas2);
            for (HashMap.Entry<Integer, String> entry : H_noterminal.entrySet()) {
                String no_ter = entry.getValue();
                if (A_hojas.get(a).equals(no_ter)) {
                    String terminal = H_terminal.get(entry.getKey());
                    String derecha = inversa.get(entry.getKey());

                    if (H_terminal.get(entry.getKey()).equals(H_terminal.get(entry.getKey()).toLowerCase())) {
                        System.out.println(no_ter + "=>" + terminal);
                        arb_derivacion_dere.add(no_ter + "=>" + terminal);
                        Hojas.add(derecha);
                        llevaA++;
                        break;
                    } else {
                        if (llevaA > altura) {

                        } else {
                            System.out.println(entry.getValue() + "=>" + terminal);
                            arb_derivacion_dere.add(no_ter + "=>" + terminal);

                            Hojas3(terminal);
                            Hojas.add(derecha);
                            hMayus_hojas.clear();

                        }

                    }
                }
            }
        }

        return resultado;
    }

    public String Hojas3(String noterminal2) {
        String resultado = "";

        BuscarHMayus(noterminal2);
        // System.out.println("arrr " + funciones.gethMayus_hojas());

        for (int a = 0; a < hMayus_hojas.size(); a++) {
            for (HashMap.Entry<Integer, String> entry : H_noterminal.entrySet()) {
                String no_ter = entry.getValue();
                String terminal = H_terminal.get(entry.getKey());
                if (hMayus_hojas.get(a).equals(no_ter)) {
                    String derecha = inversa.get(entry.getKey());

                    if (H_terminal.get(entry.getKey()).equals(H_terminal.get(entry.getKey()).toLowerCase())) {
                        System.out.println(no_ter + "=>" + terminal);
                        arb_derivacion_dere.add(no_ter + "=>" + terminal);
                        Hojas.add(derecha);

                    } else {
                        resultado = H_terminal.get(entry.getKey());
                        System.out.println(no_ter + "=>" + terminal);
                        arb_derivacion_dere.add(no_ter + "=>" + terminal);
                        Hojas.add(derecha);
                        //      Terminal(H_terminal.get(entry.getKey()));

                    }
                }
            }
        }
        return resultado;
    }

    public void Ordenando() {
        for (int i = 1; i < H_terminal.size(); i++) {
            OrdenarMayus(H_terminal.get(i));
        }
    }

    //ORDENANDO DE MAYOR VALOR A MENOR
    public void OrdenarMayor() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(h_hojas.entrySet()); // Coloca el conjunto de entrada del mapa en la colección de la lista

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue(); // Reescribe las reglas de clasificación, menor que 0 significa orden ascendente, mayor que 0 significa orden descendente
            }
        });

        Iterator<Map.Entry<String, Integer>> iter = list.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> item = iter.next();
            String key = item.getKey();
            //  System.out.println(item.getValue() + " key: " + key);
            array_hojas.add(key);

        }
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

    public String BuscarHMayus(String texto) {
        String frase2 = texto.replaceAll("\\s+", "");
        char[] myChars = frase2.toCharArray();
        String resultado = "";
        int contador = 0;
        for (int i = 0; i < myChars.length; i++) {
            if (Character.isUpperCase(texto.charAt(i))) {
                resultado = String.valueOf(texto.charAt(i));
                hMayus_hojas.add(resultado);
                contador++;
            }
        }
        return resultado;
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

    //ENCONTRANDO LA ALTURA DEL ARBOL
    public int Contprodu() {
        altura = 0;
        for (int i = 0; i < H_terminal.size(); i++) {
            String frase = H_terminal.get(i);
            char[] myChars = frase.toCharArray();

            for (int g = 0; g < myChars.length; g++) {
                if (Character.isUpperCase(frase.charAt(g))) {
                    altura++;
                }
            }
        }

        return altura;
    }

    public void Inversa() {

        for (HashMap.Entry<Integer, String> entry : H_terminal.entrySet()) {
            int key = entry.getKey();
            String valor = entry.getValue();
            StringBuilder stringBuilder = new StringBuilder(valor);
            String invertida = stringBuilder.reverse().toString();
            inversa.put(key, invertida);
        }

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

    public int Duplicados() {
        Collection<String> list = H_noterminal.values();
        int contador = 0;
        for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
            if (Collections.frequency(list, itr.next()) > 1) {
                contador++;
            }
        }
        return contador;
    }

    public HashMap<Integer, String> getH_noterminal() {
        return H_noterminal;
    }

    public void setH_noterminal(HashMap<Integer, String> H_noterminal) {
        this.H_noterminal = H_noterminal;
    }

    public HashMap<Integer, String> getH_terminal() {
        return H_terminal;
    }

    public void setH_terminal(HashMap<Integer, String> H_terminal) {
        this.H_terminal = H_terminal;
    }

    public ArrayList<String> getArray_hojas() {
        return array_hojas;
    }

    public void setArray_hojas(ArrayList<String> array_hojas) {
        this.array_hojas = array_hojas;
    }

    public ArrayList<String> getHojas() {
        return Hojas;
    }

    public void setHojas(ArrayList<String> Hojas) {
        this.Hojas = Hojas;
    }

    public ArrayList<String> getA_noterminal() {
        return A_noterminal;
    }

    public void setA_noterminal(ArrayList<String> A_noterminal) {
        this.A_noterminal = A_noterminal;
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

    public ArrayList<String> getArb_derivacion_dere() {
        return arb_derivacion_dere;
    }

    public void setArb_derivacion_dere(ArrayList<String> arb_derivacion_dere) {
        this.arb_derivacion_dere = arb_derivacion_dere;
    }

    public Map<String, Integer> getH_hojas() {
        return h_hojas;
    }

    public void setH_hojas(Map<String, Integer> h_hojas) {
        this.h_hojas = h_hojas;
    }

}
