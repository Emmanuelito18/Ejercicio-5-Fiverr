package controlador;

import java.time.LocalDate;
import modeloDatos.Receta;

/**
 *
 * @author Emmanuelito18
 */
public class TestRecetas {
    /**
     * @param args the command line aguments
     */
    final byte numRecetas=10;
        /*cantidad máxima de recetas que se pueden almacenar
        final se utiliza para indicar que la variable maximoRecetas es una 
        constante por lo que no cambiará en la ejecución del programa
        */
    Receta recetas[]=new Receta[numRecetas];
    public static void main(String[] args){
        //Recuerda que si puedes imaginarlo puedes programarlo
       
    }
    public byte menu(){
        
    }
    public void agregarReceta(){
        
    }
    public void modificarReceta(){
        
    }
    public void eliminarReceta(){
        
    }
    
    public void inicializar(){
        recetas[0]=new Receta("1", "Cefaclor",'p', "1 cada 8 hrs.", 1698073, 0, "12345678A", "Antonio", "Lewandowski", 0, LocalDate.of(2023, 1, 1));
        recetas[1]=new Receta("2", "Clamoxin",'p', "1 cada 12 hrs.", 1698073, 0, "87654321B", "Paula", "García", 0, LocalDate.of(2023, 4, 22));
        recetas[2]=new Receta("3", "Ibuprofeno",'p', "1 cada 8 hrs.", 1698073, 0, "23456789C", "Sergio", "Estrada", 0, LocalDate.of(2023, 6, 3));
        recetas[3]=new Receta("4", "Metronidasol",'p', "1 cada 12 hrs.", 1698073, 0, "34567890D", "Miguel", "Ortiz", 0, LocalDate.of(2023, 7, 20));
        recetas[4]=new Receta("5", "Febrax",'p', "1 cada 8 hrs. por 5 días", 1698073, 0, "45678901E", "Lorena", "Laredo", 0, LocalDate.of(2023, 8, 15));
        recetas[5]=new Receta("6", "Clindamicina",'i', "300ml 1 24 hrs. por  días", 1698073, 0, "56789012F", "Alejandra", "López", 0, LocalDate.of(2023, 8, 31));
        recetas[6]=new Receta("7", "Pentrexil",'p', "500mg 1 cada 8 hrs.", 1698073, 0, "67890123G", "Marta", "Martinez", 0, LocalDate.of(2023, 9, 1));
        recetas[7]=new Receta("8", "Amoxicilina",'p', "500mg 1 cada 6 hrs. por 10 días", 1698073, 0, "78901234H", "Pablo", "Escobar", 0, LocalDate.of(2023, 9, 2));
        recetas[8]=new Receta("9", "Amicdobis",'s', "300mg 1 cada 12 hrs. por 3 días", 1698073, 0, "89012345J", "Juan", "Peréz", 0, LocalDate.of(2023, 9, 3));
        recetas[9]=new Receta("10", "Loratadina",'p', "10mg 1 cada 12 hrs.", 1698073, 0, "90123456K", "Emmanuel", "Mejía", 0, LocalDate.of(2023, 9, 3));
    }
}
