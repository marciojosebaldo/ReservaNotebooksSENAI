package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Service.S_Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class C_Login {
    @GetMapping("/")
    public String getLogin() {
        return "Login/login";
    }

    @PostMapping("/login")
    @ResponseBody

    public boolean validarLogin(@RequestParam("matricula") String matricula,
                                @RequestParam("senha") String senha,
                                HttpSession session) {

        session.setAttribute("usuario", S_Usuario.validaLogin(matricula, senha));

        if (session.getAttribute("usuario") != null) {
            return true;
        }
        return false;
    }
}