package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Service.S_GeradorSenha;
import ReservaNotebooks.ReservaNotebooksSENAI.Service.S_Notebook;
import ReservaNotebooks.ReservaNotebooksSENAI.Service.S_Usuario;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_CadUsuario {

    @GetMapping("/cadastro/usuario")
    public String getCadastro() {
        return "cadastros/usuario";
    }

    @PostMapping("/Cadastros/usuario")
    @ResponseBody

    public String postCadUsuario(@RequestParam("nome") String nome,
                                 @RequestParam("ocupacao") String ocupacao,
                                 @RequestParam("matricula") String matricula,
                                 @RequestParam("email") String email) {

        String senha = S_GeradorSenha.geradorSenha(5,3,2);

        return S_Usuario.cadastrarUsuario(nome, ocupacao, matricula, email, senha);
    }
}