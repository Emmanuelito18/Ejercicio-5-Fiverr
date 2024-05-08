package recursos;

import modeloDatos.Paciente;
/**
 * Esta clase se utiliza para hacer funciones que se utilizan 
 * varias veces en todo el proyecto
 * @author Emmanuel
 */
public class Utilidades extends Paciente{
    //métodos
    /*public static int dameEntero(){//no entiendo para que se necesita este método
         
    }
    public static short dameShort(){//No entiendo para que se necesita este metodo
        
    }
    public static float dameFloat(){
        
    }*/
    public static void limpiaPantalla(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la consola: " + e.getMessage());
        }
    }
    public static boolean esValidoNif(String nif){
        // Verificar que la longitud del NIF sea correcta
        if (nif == null || nif.length() != 9)
            return false;

        // Extraer el número DNI del NIF (los primeros 8 caracteres)
        String dniPart = nif.substring(0, 8);

        // Extraer la letra del NIF (último carácter)
        char letra = nif.charAt(8);

        // Verificar que el número DNI sea un número válido
        try {
            Integer.parseInt(dniPart);
        } catch (NumberFormatException e) {
            return false;
        }

        // Calcular la letra correspondiente al número DNI
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni = Integer.parseInt(dniPart);
        char letraCalculada = letras.charAt(dni % 23);

        // Verificar que la letra calculada sea igual a la letra del NIF
        return letra == letraCalculada;
    }
    public static void mensaje(String texto){//no entiendo para que se necesita este método
        
    }
}
