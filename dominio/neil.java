package dominio;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class neil {
    public static void main(String[] args) {
        LocalDateTime fechaHoraNeilArmstrong = LocalDateTime.of(1969, 7, 21, 3, 56);

        // zona de Madrid
        ZoneId zonaHorariaMadrid = ZoneId.of("Europe/Madrid");

        ZonedDateTime zonedDateTimeMadrid = ZonedDateTime.of(fechaHoraNeilArmstrong, zonaHorariaMadrid);
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String fechaHoraNeilArmstrongTexto = zonedDateTimeMadrid.format(formatoFechaHora);

        System.out.println("Neil Armstrong pisó la luna el " + fechaHoraNeilArmstrongTexto + " en horario de Madrid.");
    }
}



        
