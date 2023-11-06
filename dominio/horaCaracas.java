package dominio;
import java.time.LocalTime;
import java.time.ZoneId;

public class horaCaracas {
    public static void main(String[] args) {
        
        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        LocalTime horaActualCaracas = LocalTime.now(zonaCaracas);
        System.out.println("La hora actual en Caracas es: " + horaActualCaracas);
    }
}