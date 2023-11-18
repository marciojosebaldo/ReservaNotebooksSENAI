package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class S_Generico {
    public static String limparNumero(String numero) {
        return numero.replaceAll("[^0-9]", "");
    }

    public static boolean campoVazio(String texto) {
        return texto == null || texto.trim().equals("");
    }

    public static LocalDate dataAtualRegistro(){
        return LocalDate.now();
    }

    public static LocalDate StringParaDate(String data){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(data, formato);
        return dataFormatada;
    }

    public static LocalTime StringParaHora(String hora){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime horaFormatada = LocalTime.parse(hora, formato);
        return horaFormatada;
    }
}