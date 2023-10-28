package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class S_Generico {
    public static String limparNumero(String numero) {
        return numero.replaceAll("[^0-9]", "");
    }

    public static boolean campoVazio(String texto) {
        return texto == null || texto.trim().equals("");
    }

    public static String data_hora_reg(){
        Date dataHoraAtual = new Date();
        String dataAtual = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);

        return dataAtual;
    }

}