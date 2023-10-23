package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Repository.R_Reserva;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Service;

@Service
public class S_Reserva {

    private static R_Reserva r_reserva;

    public S_Reserva(R_Reserva r_reservaNotebook){
        this.r_reserva = r_reserva;
    }

    public static String cadastrarReservaNotebook(Long idUsuario, String quantidade, String data_ini,
                                                  String data_fin){
        boolean podeSalvar = true;
        String mensagem = "";

        // Model e repository prontos. Falta o Service e o Controller para concluir o salvamento
        // O modal na view também precisa ser editada
        // Precisará também editar o modalReservas.js

//        r_reserva.save(quantidade, data_ini, data_fin);

        return "";
    }
}