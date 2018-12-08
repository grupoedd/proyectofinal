package chatocultar;

import java.util.LinkedList;
import java.util.Queue;

public class EncriptacionAscii {

    static char[] ocultarMsj;
    static char[] mostrarMsj;
    static String o;
    static String m;

    static Queue<String> colamsg = new LinkedList<>();//---->ESTATICA PARA SU UTILIZACION EN TODA LA CLASE COLA PARA MANEJO DE ENCRIPTACION

    public static String ocultar(String mensaje) {
        ocultarMsj = mensaje.toCharArray();//<----CONVIERTE LA CADENA STRING A UNA ARREGLO DE CARACTERES (CHAR)
        for (short i = 0; i < ocultarMsj.length; i++) {
            ocultarMsj[i] = (char) (ocultarMsj[i] + 68);//<---CADA ELEMENTO (CARACTER) LO MUEVE 118 POSICIONES EN LA TABLA DE CARACTERES ASCII
        }
        System.out.println("Encriptacion Ascii:");
        System.out.println(ocultarMsj);
        o = String.valueOf(ocultarMsj);//<---ALMACENA EN STRING EL VALOR DEL CHAR_ARRAY
        colamsg.add(o);//<---ALMACENA EN UNA COLA EL MENSAJE
        return o;
    }

    public static String mostrar() {
        mostrarMsj = colamsg.poll().toCharArray();//<----variable String toma el primer elemento de la cola (el 1° mensaje) y lo convierte en un CharArray
        for (short j = 0; j < mostrarMsj.length; j++) {//<---recorre cada caracter del mensaje
            mostrarMsj[j] = (char) (mostrarMsj[j] - 68);//<----retrocede 118 posiciones del caracter segun la tabla de caracteres ascii 
        }
        m = String.valueOf(mostrarMsj);//<---almacena en String el CharArray

        return m;
    }

}
