package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import ReservaNotebooks.ReservaNotebooksSENAI.Repository.R_Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class S_Usuario {

    public static R_Usuario r_usuario;

    public S_Usuario(R_Usuario r_usuario) {
        this.r_usuario = r_usuario;
    }

    public static M_Usuario validaLogin(@RequestParam("matricula") String matricula,
                                        @RequestParam("senha") String senha){

        matricula = S_Generico.limparNumero(matricula);

        if(S_Generico.campoVazio(matricula)) {
            return null;
        } else if(S_Generico.campoVazio(senha)) {
            return null;
        }

        return r_usuario.buscarUsuarioPorMatriculaESenha(Long.parseLong(matricula), senha);

    }

    public static String cadastrarUsuario(String nome, String ocupacao, String matricula, String email) {
        boolean podeSalvar = true;
        String mensagem = "";
        matricula = S_Generico.limparNumero(matricula);
        ocupacao = S_Generico.limparNumero(ocupacao);

        if (S_Generico.campoVazio(nome)) {
            mensagem += "Informe o campo nome \n";
            podeSalvar = false;
        }

        if (S_Generico.campoVazio(ocupacao)) {
            mensagem += "A ocupação precisa ser selecionada \n";
            podeSalvar = false;
        }

        if (S_Generico.campoVazio(matricula)) {
            mensagem += "Informe o campo matrícula \n";
            podeSalvar = false;
        }

        if (S_Generico.campoVazio(email)) {
            mensagem += "Informe o campo e-mail \n";
            podeSalvar = false;
        }

        if(podeSalvar) {
            M_Usuario m_usuario = new M_Usuario();
            m_usuario.setNome(nome);
            m_usuario.setOcupacao(Long.parseLong(ocupacao));
            m_usuario.setMatricula(Long.parseLong(matricula));
            m_usuario.setEmail(email);
            m_usuario.setAtivo(true);
            m_usuario.setSenha(S_GeradorSenha.geradorSenha(5,3,2));

            try {
                r_usuario.save(m_usuario);
                mensagem += "Usuário salvo com sucesso";
            } catch (DataIntegrityViolationException e) {
                mensagem += "Falha ao inserir o usuário no banco de dados";
            }
        }
        return mensagem;
    }
}