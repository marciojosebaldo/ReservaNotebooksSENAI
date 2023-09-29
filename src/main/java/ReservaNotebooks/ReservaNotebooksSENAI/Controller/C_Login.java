package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Service.S_Login;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class C_Login {
    @GetMapping("/login")
    public String getLogin() {
        return "Login/login";
    }

    @PostMapping("/Login/login")
    @ResponseBody

    public String postLogin(@RequestParam("matricula") String matricula,
                            @RequestParam("senha") String senha,
                            HttpSession session){

        session.setAttribute("matricula", S_Login.validaLogin(matricula, senha));

        if(session.getAttribute("matricula") != null) {
            return "Home/home";
        } else {
            return "redirect/";
        }
    }
}