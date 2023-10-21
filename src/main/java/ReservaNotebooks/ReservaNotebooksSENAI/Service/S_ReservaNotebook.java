package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Repository.R_ReservaNotebook;
import org.springframework.stereotype.Service;

@Service
public class S_ReservaNotebook {

    private static R_ReservaNotebook r_reservaNotebook;

    public S_ReservaNotebook(R_ReservaNotebook r_reservaNotebook){
        this.r_reservaNotebook = r_reservaNotebook;
    }

    public static String cadastrarReservaNotebook(String data, String quantidade){
        boolean podeSalvar = true;
        String mensagem = "";

        r_reservaNotebook(data, quantidade);
    }
}