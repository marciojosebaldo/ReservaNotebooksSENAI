package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import ReservaNotebooks.ReservaNotebooksSENAI.Service.S_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_CadUsuario {

    @GetMapping("/cadastro/usuario")
    public String getCadastro(HttpServletRequest request) {
        if(request.getHeader("Referer") != null) {
            return "Cadastros/usuario";
        } else {
            return "redirect:/";
        }
    }

    @PostMapping("/cadastro/usuario")
    @ResponseBody

    public String postCadUsuario(@RequestParam("nome") String nome,
                                 @RequestParam("ocupacao") String ocupacao,
                                 @RequestParam("matricula") String matricula,
                                 @RequestParam("email") String email) {

        return S_Usuario.cadastrarUsuario(nome, ocupacao, matricula, email);
    }

    @GetMapping("/edit/usuario")
    @ResponseBody // Não retorna o padrão, irá retornar o que for passado como JSON

    public M_Usuario getEditUsuario(HttpServletRequest request,
                                    HttpSession session) {
        if (request.getHeader("Referer") != null) {
            M_Usuario dadosRetorno = (M_Usuario) session.getAttribute("usuario");
            dadosRetorno.setSenha(null);
            return dadosRetorno;
        } else {
            return null;
        }
    }
}