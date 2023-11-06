package dominio;
import java.time.LocalTime;
import java.time.ZoneId;

public class horahoy {
    public static void main(String[] args) {
        ZoneId zonaMadrid = ZoneId.of("España/Madrid");
        LocalTime horaActualMadrid = LocalTime.now(zonaMadrid);
        System.out.println("La hora actual en Caracas es: " + horaActualMadrid);
    }
}
