package dominio;
import java.util.Date;
import java.text.SimpleDateFormat;
public class fechahoy{
    public static void main (String [] args){
        
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
 
         
        String fechaActualTexto = formatoFecha.format(fechaActual);
        System.out.println("La fecha actual es: " + fechaActualTexto);
    }
        

        
    }


