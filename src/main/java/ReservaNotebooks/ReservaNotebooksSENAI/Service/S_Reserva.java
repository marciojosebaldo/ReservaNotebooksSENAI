package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Reserva;
import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import ReservaNotebooks.ReservaNotebooksSENAI.Repository.R_Reserva;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class S_Reserva {

    private static R_Reserva r_reserva;

    public S_Reserva(R_Reserva r_reservaNotebook){
        this.r_reserva = r_reserva;
    }

    public static String cadastrarReservaNotebook(Long idUsuario, String quantidade, String data_ini,
                                                  String data_fin, String hora_ini, String hora_fin){
        boolean podeSalvar = true;
        String mensagem = "";

        // Falta criar o horário do registro

        M_Reserva m_reserva = new M_Reserva();
        m_reserva.setId_usuario(idUsuario);
        m_reserva.setQuantidade(Long.parseLong(quantidade));
        m_reserva.setData_ini(data_ini);
        m_reserva.setData_fim(data_fin);
        m_reserva.setHora_ini(hora_ini);
        m_reserva.setHora_fin(hora_fin);
        m_reserva.setHora_reg(S_Generico.data_hora_reg());

        try {
            r_reserva.save(m_reserva);
            mensagem += "Dados salvos com sucesso";
        } catch (DataIntegrityViolationException e) {
            mensagem += "Falha ao salvar os dados";
        }

        return mensagem;
    }
}