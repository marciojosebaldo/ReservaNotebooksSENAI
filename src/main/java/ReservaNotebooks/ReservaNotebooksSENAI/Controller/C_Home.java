package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Home {
    @GetMapping("/home")
    public String getHome(HttpSession session,
                          Model model) {
        Object objUsuario = session.getAttribute("usuario");
        if (objUsuario != null) {
            objUsuario = (M_Usuario) objUsuario;
            model.addAttribute("nome", ((M_Usuario) objUsuario).getNome());
            return "Home/home";
        } else {
            return "redirect:/"; // Isso faz retornar para o login
        }
    }
}
