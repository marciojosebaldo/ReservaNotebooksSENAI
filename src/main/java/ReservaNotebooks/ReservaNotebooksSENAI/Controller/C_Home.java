package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Reserva;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class C_Home {
    @GetMapping("/home")
    public String getHome(HttpSession session,
                          Model model) {
        if (session.getAttribute("usuario") != null) {
            // Duas últimas linhas estão abaixo do tbody da view do home.html. Servem para invocar os dados salvos
            // Precisa salvar os dados
            List<M_Reserva> listaDeReservas = ;
            model.addAttribute("listaDeReservas", listaDeReservas);

            model.addAttribute("usuario", session.getAttribute("usuario"));
            return "Home/home";
        } else {
            return "redirect:/"; // Isso faz retornar para o login
        }
    }

    @GetMapping("/Home")
    public String getPartialHome(HttpServletRequest request){
        if(request.getHeader("Referer") != null) {
            return "home/partial_home";
        } else {
            return "redirect:/";
        }
    }
}