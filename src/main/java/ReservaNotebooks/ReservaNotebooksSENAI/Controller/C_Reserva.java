package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Reserva;
import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import ReservaNotebooks.ReservaNotebooksSENAI.Service.S_Reserva;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Reserva {

    @PostMapping("/reserva")
    @ResponseBody
    public String postReservaNotebook(@RequestParam("quantidade") String quantidade,
                                      @RequestParam("data_ini") String data_ini,
                                      @RequestParam("data_fin") String data_fin,
                                      HttpSession session) {

        M_Usuario usuario = (M_Usuario) session.getAttribute("usuario");
        Long idUsuario = usuario.getId();

        return S_Reserva.cadastrarReservaNotebook(idUsuario, quantidade, data_ini, data_fin);
    }
}