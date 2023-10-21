package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Repository.R_Reserva;
import org.springframework.stereotype.Service;

@Service
public class S_Reserva {

    private static R_Reserva r_reservaNotebook;

    public S_Reserva(R_Reserva r_reservaNotebook){
        this.r_reservaNotebook = r_reservaNotebook;
    }

    public static String cadastrarReservaNotebook(String dataReserva, String quantidade){
        boolean podeSalvar = true;
        String mensagem = "";

//        r_reservaNotebook(dataReserva, quantidade);

        return "";
    }
}