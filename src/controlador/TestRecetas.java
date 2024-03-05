package controlador;

import java.time.LocalDate;
import modeloDatos.Receta;
import java.util.Scanner;

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
        int i=0;//contador utilizdo para saber el número de iteración del bucle y de receta
        String continuar=null;//se utiliza para saber si el usuario quiere seguir creado recetas
        //Estas variables se utilzan para almacenar temporalmente los datos del paciente
        String identificador=null;
        String medicamento=null;
        String formato=null;//se utiliza como auxiliar para el formato del medicamento
        char formatoLetra;//para guardar el formato del medicamento en letra
        String psologia=null;
        String nif=null;
        String nombre=null;
        String apellido=null;
        int telefono;
        LocalDate fechaActual;
        
        do{
            Scanner teclado=new Scanner(System.in);//para ingresar datos por teclado
            
            System.out.println("Ingrese el nombre del paciente: ");
            nombre=teclado.nextLine();
            
            System.out.println("Ingrese el apellido del paciente: ");
            apellido=teclado.nextLine();
            
            System.out.println("Ingrese el nif del paciente: ");
            nif=teclado.nextLine();
            
            System.out.println("Ingrese el número de teléfono del paciente: ");
            telefono=teclado.nextInt();
            
            System.out.println("Ingrese el ó los medicamentos recetados: ");
            medicamento=teclado.nextLine();
            
            System.out.println("Ingrese el formato del medicamento (pastilla|inyectable|supocitorio): ");
            formato=teclado.nextLine();
            
            System.out.println("Ingrese la psología(indicaciones) para el paciente:");
            psologia=teclado.nextLine();
            
            fechaActual=LocalDate.now();//obtengo la fecha actual de la creacion de la receta
            
            System.out.println("¿Desea ingresar otra receta?");
            continuar=teclado.nextLine();
            
            if(formato.equalsIgnoreCase("pastilla")||formato.equalsIgnoreCase("pastillas")){
                //Compara sí el formato es pastilla
                formatoLetra='p';
            }else if(formato.equalsIgnoreCase("inyectable")){
                //sí el formato es inyectable
                formatoLetra='i';
            }else{
                //sí el formato es supositorio
                formatoLetra='s';
            }
            /*el método equalsIgnrecase() sirve para comparar si una cadena 
            de caracteres es igual a otra, sin importar si tiene mayusculas o no*/
            
            i++;
            identificador=String.valueOf(i);//convierte el calor de i de entero a string
            recetas[i]=new Receta(identificador,medicamento,formatoLetra, psologia, 1698073, i, nif, nombre, apellido, telefono, LocalDate.of(2023, 1, 1));
            
            /*
            debido a que la declaración del objeto teclado de tipo Scanner
            se hace dentro del bucle, no es necesario poner el método teclado.close();
            para que se cierre el flujo de entrada asociado al objeto, ya que al dejar se 
            ser referenciado, el recolector de basura de java en cuanto el objeto deje de ser
            referenciado
            */
        }while(i<=10&&continuar.equals("si")||continuar.equalsIgnoreCase("si"));
    }
    public void modificarReceta(){
        
    }
    public void eliminarReceta(){
        
    }
    
    public void inicializar(){
        //Los números de los parametros de los objetos son el número de colegiado, el total de recetas y el núméro de telefono del paciente
        recetas[0]=new Receta("1", "Cefaclor",'p', "1 cada 8 hrs.", 1698073, 1, "12345678A", "Antonio", "Lewandowski", 62495083, LocalDate.of(2023, 1, 1));
        recetas[1]=new Receta("2", "Clamoxin",'p', "1 cada 12 hrs.", 1698073, 2, "87654321B", "Paula", "García", 73982150, LocalDate.of(2023, 4, 22));
        recetas[2]=new Receta("3", "Ibuprofeno",'p', "1 cada 8 hrs.", 1698073, 3, "23456789C", "Sergio", "Estrada", 58621430, LocalDate.of(2023, 6, 3));
        recetas[3]=new Receta("4", "Metronidasol",'p', "1 cada 12 hrs.", 1698073, 4, "34567890D", "Miguel", "Ortiz", 48091763, LocalDate.of(2023, 7, 20));
        recetas[4]=new Receta("5", "Febrax",'p', "1 cada 8 hrs. por 5 días", 1698073, 5, "45678901E", "Lorena", "Laredo", 36502481, LocalDate.of(2023, 8, 15));
        recetas[5]=new Receta("6", "Clindamicina",'i', "300ml 1 24 hrs. por  días", 1698073, 6, "56789012F", "Alejandra", "López", 71985634, LocalDate.of(2023, 8, 31));
        recetas[6]=new Receta("7", "Pentrexil",'p', "500mg 1 cada 8 hrs.", 1698073, 7, "67890123G", "Marta", "Martinez", 20984756, LocalDate.of(2023, 9, 1));
        recetas[7]=new Receta("8", "Amoxicilina",'p', "500mg 1 cada 6 hrs. por 10 días", 1698073, 8, "78901234H", "Pablo", "Escobar", 57218394, LocalDate.of(2023, 9, 2));
        recetas[8]=new Receta("9", "Amicdobis",'s', "300mg 1 cada 12 hrs. por 3 días", 1698073, 9, "89012345J", "Juan", "Peréz", 84329651, LocalDate.of(2023, 9, 3));
        recetas[9]=new Receta("10", "Loratadina",'p', "10mg 1 cada 12 hrs.", 1698073, 10, "90123456K", "Emmanuel", "Mejía", 55881079, LocalDate.of(2023, 9, 3));
    }
}
