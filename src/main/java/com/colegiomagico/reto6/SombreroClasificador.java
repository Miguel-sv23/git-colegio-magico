package com.colegiomagico.reto6;

/**
 * Usa Switch. Gryffindor -> Valentia, Ravenclaw -> Inteligencia, otro -> Desconocido.
 */
public class SombreroClasificador {

    public static String clasificar(String nombre) {
        switch(nombre){
            case "Gryffindor":
                return "valentia";

            case"Ravenclaw":
                return "Inteligencia";
            
            default:
                return "Desconocido";

        }
    }

    public static void main(String[] args) {
        System.out.println("Gryffindor: " + clasificar("Gryffindor"));
    }
}
