package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Home {
    @GetMapping("/home")
    public String getHome(HttpSession session,
                          Model model) {
        if (session.getAttribute("usuario") != null) {
            model.addAttribute("usuario", session.getAttribute("usuario"));
            return "Home/home";
        } else {
            return "redirect:/"; // Isso faz retornar para o login
        }
    }

    @GetMapping("/Home")
    public String getPartialHome(HttpServletRequest request){
        if(request.getHeader("Referer") != null) { //Se digitar diretamente na URL, retorna nulo a URL. Se clicar no botão, retorna o caminho da URL
            return "home/partial_home";
        } else {
            return "redirect:/";
        }
    }
}