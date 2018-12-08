package chatocultar;

import java.util.LinkedList;
import java.util.Queue;

public class EncriptacionBinaria {

   // static Queue<String> colamsg = new LinkedList<>();//---->ESTATICA PARA SU UTILIZACION EN TODA LA CLASE COLA PARA MANEJO DE ENCRIPTACION
    static String salidatxt = "", txt = "";
    static int a = 0;
    static String palabra = "";

    public static String encriptarBinario(String entradaMsg) {

        
        for (short i = 0; i < entradaMsg.length(); i++) {//<---recorre cada caracter del mensaje
            a = entradaMsg.charAt(i);//<--toma el valor ascii de cada caracter 
            salidatxt = Integer.toBinaryString(a);//<----convierte el valor ascii en binario y se almacena en String
            if (i == 0) {//<---para comenzar agregando unicamente el primer valor binario
                txt = salidatxt;
            } else {
                txt = txt + "-" + salidatxt;//<----acumula los datos que ya posee la variable y concatena el separador '-' y el nuevo valor binario
            }

        }

        return txt;
    }

    public static String mostrarBinario() {

        for (String s : txt.split("-")) { //los numeros estan separados por espacios
             palabra += String.valueOf((char) Integer.parseInt(s, 2));
        }

        return palabra;
    }
}
