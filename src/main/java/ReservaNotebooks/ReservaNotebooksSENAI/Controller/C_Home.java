package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Home {
    @GetMapping("/home")
    public String getHome(HttpSession session) {
        if (session.getAttribute("matricula") != null) {
            return "Home/home";
        } else {
            return "redirect:/";
        }
    }
}
