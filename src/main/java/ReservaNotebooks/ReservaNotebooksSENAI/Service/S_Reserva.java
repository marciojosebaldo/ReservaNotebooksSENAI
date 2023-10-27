package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Reserva;
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

        M_Reserva m_reserva = new M_Reserva();

        m_reserva.setId_usuario(idUsuario);
        m_reserva.setQuantidade(Long.parseLong(quantidade));
        m_reserva.setData_ini(data_ini);
        m_reserva.setData_fim(data_fin);



        return "";
    }
}