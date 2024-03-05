package controlador;

import java.time.LocalDate;
import modeloDatos.Receta;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;//para establecer el formato de la fecha

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
        TestRecetas instancia=new TestRecetas();
        System.out.println("Sistema de recetas médicas");
       switch(instancia.menu()){
            case 1://Crear receta
                instancia.agregarReceta();
                break;
            case 2://Editar receta
                instancia.modificarReceta();
                break;
            case 3://Ver recetas
                instancia.mostrarReceta();
                break;
            case 4://Eliminar recetas
                instancia.eliminarReceta();
                break;
            case 5://Salir
                System.exit(0);//cierra el programa
                break;
            case 6://inicializar recetas
                System.out.println("Se mostrarán las recetas de prueba\n\n");
                
                instancia.inicializar();
                instancia.mostrarReceta();
                break;
            default:
                System.out.println("Error, opcion inválida");
        }
       
    }
    
    public byte menu(){
        Scanner teclado=new Scanner(System.in);
        byte opcion;
        
        System.out.println("¿Qué desea hacer?");
        System.out.println("---Menú---"); 
        System.out.println("1.Crear receta");
        System.out.println("2.Editar receta");
        System.out.println("3.Ver recetass");
        System.out.println("4.Eliminar recetas");
        System.out.println("5.Salir");
        
        System.out.println("\nIngrese su opción: ");
        opcion=teclado.nextByte();
        return opcion;//linea pendiente de revision
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
            
            System.out.println("¿Desea ingresar otra receta? (si/no)");
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
        Scanner teclado=new Scanner(System.in);
        int identificador;
        
        System.out.println("Ingrese el identificador de la receta a modificar: ");
        identificador=teclado.nextInt();
        
        buscarPosicion(recetas, identificador);
    }
    
    public void mostrarReceta(){
        System.out.println("Se muestran todas las recetas existentes");
        for(Receta receta:recetas){
            if(receta!=null){
                System.out.println(receta.toString());
                //muestra por consola la receta en forma de string 
            }
        }
    }
    
    public void eliminarReceta(){
        Scanner teclado=new Scanner(System.in);
        int identificador;
        
        System.out.println("Ingrese el identificador de la receta a eliminar: ");
        identificador=teclado.nextInt();
        
        eliminarPosicion(recetas, identificador);
        
        // Verifica que el objeto haya sido eliminado
        for (Receta receta : recetas){
            //for each que recorre un rango de principio a fin
            if (receta != null) {
                System.out.println("Nombre de la receta: " + receta.getNombre()); 
            } else {
                System.out.println("La posición está vacía.");
            }
        }
    }
    
    public void inicializar(){
        //Los números de los parametros de los objetos son el número de colegiado, el total de recetas y el núméro de telefono del paciente
        recetas[0]=new Receta("1", "Cefaclor",'p', "1 cada 8 hrs.", 1698073, 10, "12345678A", "Antonio", "Lewandowski", 62495083, LocalDate.of(2023, 1, 1));
        recetas[1]=new Receta("2", "Clamoxin",'p', "1 cada 12 hrs.", 1698073, 10, "87654321B", "Paula", "García", 73982150, LocalDate.of(2023, 4, 22));
        recetas[2]=new Receta("3", "Ibuprofeno",'p', "1 cada 8 hrs.", 1698073, 10, "23456789C", "Sergio", "Estrada", 58621430, LocalDate.of(2023, 6, 3));
        recetas[3]=new Receta("4", "Metronidasol",'p', "1 cada 12 hrs.", 1698073, 10, "34567890D", "Miguel", "Ortiz", 48091763, LocalDate.of(2023, 7, 20));
        recetas[4]=new Receta("5", "Febrax",'p', "1 cada 8 hrs. por 5 días", 1698073, 10, "45678901E", "Lorena", "Laredo", 36502481, LocalDate.of(2023, 8, 15));
        recetas[5]=new Receta("6", "Clindamicina",'i', "300ml 1 24 hrs. por  días", 1698073, 10, "56789012F", "Alejandra", "López", 71985634, LocalDate.of(2023, 8, 31));
        recetas[6]=new Receta("7", "Pentrexil",'p', "500mg 1 cada 8 hrs.", 1698073, 10, "67890123G", "Marta", "Martinez", 20984756, LocalDate.of(2023, 9, 1));
        recetas[7]=new Receta("8", "Amoxicilina",'p', "500mg 1 cada 6 hrs. por 10 días", 1698073, 10, "78901234H", "Pablo", "Escobar", 57218394, LocalDate.of(2023, 9, 2));
        recetas[8]=new Receta("9", "Amicdobis",'s', "300mg 1 cada 12 hrs. por 3 días", 1698073, 10, "89012345J", "Juan", "Peréz", 84329651, LocalDate.of(2023, 9, 3));
        recetas[9]=new Receta("10", "Loratadina",'p', "10mg 1 cada 12 hrs.", 1698073, 10, "90123456K", "Emmanuel", "Mejía", 55881079, LocalDate.of(2023, 9, 3));
    }
    //métodos personalizados
    public static void buscarPosicion(Receta[] recetas, int indice) {//función o método utilizado por modificarReceta
        Scanner teclado=new Scanner(System.in);
        int opcion;
        String formato=null;
        char formatoLetra;
        String psologia=null;
        String fechaIngresada=null;

        // Verifica si la posición está dentro del rango del arreglo
        if (indice >= 0 && indice < recetas.length) {
            // Verifica si la posición no está vacía
            if (recetas[indice] != null) {
                System.out.println("¿Cuál campo de la receta "+indice+" quieres modificar?, elige una opción del menú");
                System.out.println("---Menú---");
                System.out.println("1.Formato");
                System.out.println("2.Psología");
                System.out.println("3.Fecha de la receta");

                opcion=teclado.nextInt();

                switch(opcion){
                    case 1://Formato
                        System.out.println("Ingrese el nuevo formato del medicamento(pastilla|inyectable|supocitorio): ");
                        formato=teclado.nextLine();
                        
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
                        recetas[indice].setFormato(formatoLetra);
                        /*llamo al método setFormado para la receta que ocupa el espacio 
                        especificado en el arreglo de objetos recetas de la clase Receta
                        */
                        break;
                    case 2://Psologia
                        System.out.println("Ingrese la nueva psología (indicaciones): ");
                        psologia=teclado.nextLine();
                        recetas[indice].setPsologia(psologia);
                        break;
                    case 3://Fecha de la receta
                        System.out.println("Ingrese la nueva fecha de la receta en el formato (yyyy-MM-dd)");
                        System.out.println("Nota: es necesario que incluya los guiones");
                        System.out.println("Ingrese la nueva fecha: ");
                        fechaIngresada=teclado.nextLine();
                        
                        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        LocalDate fecha = LocalDate.parse(fechaIngresada, formateador);
                        //cambia el formato de la fecha de LocalDate
                        
                        recetas[indice].setFechaReceta(fecha);
                        break;
                    default:
                        System.out.println("Error, opción inválida");
                }
            } else {
                System.out.println("La receta "+indice+" está vácia");
            }
        } else {
            System.out.println("La receta "+indice+" está fuera del rango máximo de recetas(10 recetas)");
        }
    }
    
    public static void eliminarPosicion(Receta[] recetas,int indice){
        Scanner teclado=new Scanner(System.in);
        String confirmacion=null;

        // Verifica si la posición está dentro del rango del arreglo
        if (indice >= 0 && indice < recetas.length) {
            // Verifica si la posición no está vacía
            if (recetas[indice] != null) {
                //System.out.println("La posición " + posicion + " existe y no está vacía.");
                System.out.println("¿Desea eliminar la receta "+indice+"? (si/no)");
                confirmacion=teclado.nextLine();
                if(confirmacion.equalsIgnoreCase("si")){
                    // Mueve los elementos restantes hacia adelante para llenar el espacio eliminado
                    for (int i = indice; i < recetas.length - 1; i++) {
                        recetas[i] = recetas[i + 1];
                    }
                    recetas[recetas.length - 1] = null; // Establece el último elemento como null (opcional)
                    System.out.println("La receta se ha eliminado exitosamente");
                }else{
                    System.out.println("La receta no se ha eliminado");
                }
            } else {
                System.out.println("La receta "+indice+" está vácia");
            }
        } else {
            System.out.println("La receta "+indice+" está fuera del rango máximo de recetas(10 recetas)");
        } 
    }
}
