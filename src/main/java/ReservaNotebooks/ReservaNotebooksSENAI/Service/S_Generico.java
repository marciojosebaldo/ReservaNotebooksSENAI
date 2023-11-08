package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


@Service
public class S_Generico {
    public static String limparNumero(String numero) {
        return numero.replaceAll("[^0-9]", "");
    }

    public static boolean campoVazio(String texto) {
        return texto == null || texto.trim().equals("");
    }

    public static String dataAtualRegistro(){
        LocalDateTime dataAtualRegistro = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAtual = dataAtualRegistro.format(formatter);
        return dataAtual;
    }

    // Teste para conferência da data em String
    @Test
    public void TesteDataAtualRegistro(){
        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAtualEsperada = dataAtual.format(formatter);
        String dataAtualRegistro = S_Generico.dataAtualRegistro();

        assertEquals(dataAtualEsperada, dataAtualRegistro);
    }

    public static LocalDate StringParaDate(String data){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFormatada = LocalDate.parse(data, formato);
        return dataFormatada;
    }

    public static LocalDate StringParaHora(String hora){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        Date horaFormatada = new SimpleDateFormat("hh:mm").parse(hora);
        return horaFormatada;
    }

}