package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import ReservaNotebooks.ReservaNotebooksSENAI.Service.S_Usuario;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @ResponseBody // Não retorna o padrão, irá retornar o que for passado como JSON

    public String postCadUsuario(@RequestParam("nome") String nome,
                                 @RequestParam("ocupacao") String ocupacao,
                                 @RequestParam("matricula") String matricula,
                                 @RequestParam("email") String email) {

        return S_Usuario.cadastrarUsuario(nome, ocupacao, matricula, email);
    }

    @GetMapping("/edit/usuario")
    public String getEditUsuario(HttpServletRequest request,
                                    HttpSession session,
                                    Model model) {
        if (request.getHeader("Referer") != null) {
            M_Usuario usuario = (M_Usuario) session.getAttribute("usuario");
            model.addAttribute("usuario", usuario);
            if (usuario.getOcupacao() == 1) {
                return "/Cadastros/pv/edit_cad_usuario_gestor";
            } else {
                return "/Cadastros/pv/edit_cad_usuario/default";
            }
        } else {
            return null;
        }
    }
}