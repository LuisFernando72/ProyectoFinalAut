package a_derivacion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* @author Luis Fernando Paxel
 */
public class arb_derivacion {

    private ArrayList<String> reglas_produccion = new ArrayList<>();
    private HashMap<Integer, String> H_noterminal = new HashMap<>();
    private HashMap<Integer, String> H_terminal = new HashMap<>();
    private ArrayList<String> array_hojas = new ArrayList<>();
    private HashMap<Integer, String> hojas_hash = new HashMap<>();
    private ArrayList<String> arb_derivacion = new ArrayList<>();
    private ArrayList<String> Hojas = new ArrayList<>();
    private ArrayList<String> pruebaPa = new ArrayList<>();

    public int altura;
    private int llevaA = 0;

    OperacionesIz funciones;

    public arb_derivacion() {
    }

    public void Mostrar_datos() {
        Derivacion_derecha(H_terminal.get(0));
    }

    public void vaciar(){
        H_terminal.clear();
        H_noterminal.clear();
        reglas_produccion.clear();
        array_hojas.clear();
        hojas_hash.clear();
        arb_derivacion.clear();
        Hojas.clear();
        pruebaPa.clear();
        funciones.vaciar();
        altura =0;
        llevaA =0;
    }
    public void Derivacion_derecha(String inicio) {
        funciones = new OperacionesIz();
        Ordenando();
        encontrandoHojas();
        funciones.BuscarMayus(inicio);
        System.out.println("Inicios" + funciones.getA_noterminal());
        //  System.out.println(reglas_produccion.get(0))
        Contprodu();
        System.out.println(H_noterminal.get(0) + "=>" + H_terminal.get(0));
        Buscar_produccion2();
        System.out.println("Altura: " + altura);
        System.out.println("Lleva: " + llevaA);

    }

    public void Ordenando() {
        for (int i = 1; i < H_terminal.size(); i++) {
            // System.out.println("ter: " + H_terminal.get(i));;
            funciones.OrdenarMayus(H_terminal.get(i));
        }
    }

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

    public static <K, V> K getKey(Map<K, V> map, V value) {
        return map.entrySet().stream()
                .filter(entry -> value.equals(entry.getValue()))
                .findFirst().map(Map.Entry::getKey)
                .orElse(null);
    }

    public void Buscar_produccion2() {

        int cuento = Duplicados();
        OrdenarMayor();

        for (int i = 0; i < funciones.getA_noterminal().size(); i++) {
            String mayuscula = funciones.getA_noterminal().get(i);

            for (int c = 0; c < array_hojas.size(); c++) {
                Object dos = getKey(H_terminal, array_hojas.get(c));
                String no_terminal = H_noterminal.get(dos);
                String terminal_1 = H_terminal.get(dos);

                if (mayuscula.equals(no_terminal)) {
                    if (terminal_1.equals(terminal_1.toLowerCase())) {
                        llevaA++;
                        System.out.println(no_terminal + "=>" + terminal_1);
                        arb_derivacion.add(no_terminal + "=>" + terminal_1);
                        Hojas.add(terminal_1);

                    } else {
                        llevaA++;
                        if (cuento > 1) {
                            System.out.println(no_terminal + "=>" + terminal_1);
                            arb_derivacion.add(no_terminal + "=>" + terminal_1);
                            Hojas.add(terminal_1);

                            Terminal(terminal_1);

                            funciones.getA_hojas().clear();
                        } else {
                            System.out.println(no_terminal + "=>" + terminal_1);
                            arb_derivacion.add(no_terminal + "=>" + terminal_1);
                            Terminal(terminal_1);
                            Hojas.add(terminal_1);
                            funciones.getA_hojas().clear();

                        }

                        break;

                    }

                }
            }

        }

    }

    //BUSCAR SI EL PRIMERO TIENE MAS DE DOS TERMINALES SI ES HACI QUE LO ORDENE DE MAYOR A MENOR
    //DE LO CONTRARIO REESCRIVBIR EL RESULTADO
    public String Terminal(String noterminal) {
        String resultado = "";

        funciones.BuscarMayus2(noterminal);

        for (int a = 0; a < funciones.getA_hojas().size(); a++) {
            for (HashMap.Entry<Integer, String> entry : H_noterminal.entrySet()) {
                String no_ter = entry.getValue();
                if (funciones.getA_hojas().get(a).equals(no_ter)) {
                    String terminal = H_terminal.get(entry.getKey());

                    if (H_terminal.get(entry.getKey()).equals(H_terminal.get(entry.getKey()).toLowerCase())) {
                        System.out.println(no_ter + "=>" + terminal);
                        arb_derivacion.add(no_ter + "=>" + terminal);
                        Hojas.add(terminal);

                        llevaA++;
                        break;
                    } else {
                        if (llevaA > altura) {
//                            System.out.println(entry.getValue() + "=>.." + terminal);
//                            Hojas55(noterminal);
//                            funciones.gethMayus_hojas().clear();
//                            break;
                        } else {
                            System.out.println(entry.getValue() + "=>" + terminal);
                            arb_derivacion.add(no_ter + "=>" + terminal);
                            Hojas.add(terminal);
                            Hojas3(terminal);

                            funciones.gethMayus_hojas().clear();

                        }

                    }
                }
            }
        }

        return resultado;
    }

    public String Hojas3(String noterminal2) {
        String resultado = "";

        funciones.BuscarHMayus(noterminal2);
        // System.out.println("arrr " + funciones.gethMayus_hojas());

        for (int a = 0; a < funciones.gethMayus_hojas().size(); a++) {
            for (HashMap.Entry<Integer, String> entry : H_noterminal.entrySet()) {
                String no_ter = entry.getValue();
                String terminal = H_terminal.get(entry.getKey());
                if (funciones.gethMayus_hojas().get(a).equals(no_ter)) {
                    if (H_terminal.get(entry.getKey()).equals(H_terminal.get(entry.getKey()).toLowerCase())) {
                        System.out.println(no_ter + "=>" + terminal);
                        arb_derivacion.add(no_ter + "=>" + terminal);
                        Hojas.add(terminal);

                    } else {
                        resultado = H_terminal.get(entry.getKey());
                        System.out.println(no_ter + "=>" + terminal);
                        arb_derivacion.add(no_ter + "=>" + terminal);
                        Hojas.add(terminal);
                        //      Terminal(H_terminal.get(entry.getKey()));

                    }
                }
            }
        }
        return resultado;
    }

    public String Hojas55(String noterminal2) {
        String resultado = "";
        int cuento = Duplicados();

        funciones.BuscarHMayus(noterminal2);
        System.out.println("arrr " + funciones.gethMayus_hojas());

        for (int a = 0; a < funciones.gethMayus_hojas().size(); a++) {
            String valor = funciones.gethMayus_hojas().get(a);
            hojas_hash.entrySet().forEach(entry -> {
                int hoja = entry.getKey();
                String hojas2 = entry.getValue();
                String noterminal = H_noterminal.get(hoja);
                Object dos = getKey(H_noterminal, valor);
//                System.out.println("valor " + valor + " noter: " + noterminal + " jas: " + entry.getValue());
                if (valor.equals(noterminal)) {
                    if (hojas2.equals(hojas2.toLowerCase())) {
                        System.out.println("No: " + noterminal + " =>" + entry.getValue());
                    } else {
                        System.out.println("No terminal: " + H_noterminal.get(dos) + " terminal:" + H_terminal.get(dos));

                    }
                }
            });
        }

        return resultado;

    }

    public void encontrandoHojas() {
        int contador = 0;
        for (HashMap.Entry<Integer, String> entry : H_terminal.entrySet()) {
            String hoja = entry.getValue();
            if (hoja.equals(hoja.toLowerCase())) {
                contador++;
                //  System.out.println("Hoja encontrada: " + hoja);
                hojas_hash.put(entry.getKey(), hoja);
            }

        }

    }

    public String Hojas(String noterminal2) {
        String resultado = "";

        funciones.BuscarHMayus(noterminal2);
        System.out.println("arrr " + funciones.gethMayus_hojas());

        for (int a = 0; a < funciones.gethMayus_hojas().size(); a++) {
            for (HashMap.Entry<Integer, String> entry : H_noterminal.entrySet()) {
                String no_ter = entry.getValue();
                if (funciones.gethMayus_hojas().get(a).equals(no_ter)) {
                    if (H_terminal.get(entry.getKey()).equals(H_terminal.get(entry.getKey()).toLowerCase())) {
                        System.out.println("h: " + entry.getValue() + "=>" + H_terminal.get(entry.getKey()));

                    } else {
                        resultado = H_terminal.get(entry.getKey());
                        System.out.println("h: " + entry.getValue() + "=>" + H_terminal.get(entry.getKey()));
                        //      Terminal(H_terminal.get(entry.getKey()));

                    }
                }
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

    public void OrdenarMayor() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(funciones.getH_hojas().entrySet()); // Coloca el conjunto de entrada del mapa en la colección de la lista

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue(); // Reescribe las reglas de clasificación, menor que 0 significa orden ascendente, mayor que 0 significa orden descendente
            }
        });
        // Usa el iterador para recorrer los elementos en la lista
        Iterator<Map.Entry<String, Integer>> iter = list.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> item = iter.next();
            String key = item.getKey();
            //  System.out.println(item.getValue() + " key: " + key);
            array_hojas.add(key);

        }
    }

    public ArrayList<String> getReglas_produccion() {
        return reglas_produccion;
    }

    public void setReglas_produccion(ArrayList<String> reglas_produccion) {
        this.reglas_produccion = reglas_produccion;
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

    public HashMap<Integer, String> getHojas_hash() {
        return hojas_hash;
    }

    public void setHojas_hash(HashMap<Integer, String> hojas_hash) {
        this.hojas_hash = hojas_hash;
    }

    public ArrayList<String> getArb_derivacion() {
        return arb_derivacion;
    }

    public void setArb_derivacion(ArrayList<String> arb_derivacion) {
        this.arb_derivacion = arb_derivacion;
    }

    public ArrayList<String> getHojas() {
        return Hojas;
    }

    public void setHojas(ArrayList<String> Hojas) {
        this.Hojas = Hojas;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public ArrayList<String> getPruebaPa() {
        return pruebaPa;
    }

    public void setPruebaPa(ArrayList<String> pruebaPa) {
        this.pruebaPa = pruebaPa;
    }

}
