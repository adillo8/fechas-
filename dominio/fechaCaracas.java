package dominio;
import java.util.Date;
import java.text.SimpleDateFormat;
public class fechaCaracas {
    public static void main (String [] args){
        //la fecha de caracas es la misma que la de españa lo que cambia es la hora 
        Date fechaCaracasDate = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
 
         
        String fechaCaracasTexto = formatoFecha.format(fechaCaracasDate);
        System.out.println("La fecha actual es: " + fechaCaracasTexto);
    }
    
}
