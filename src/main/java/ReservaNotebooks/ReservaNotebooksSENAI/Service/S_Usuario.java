package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import ReservaNotebooks.ReservaNotebooksSENAI.Repository.R_Usuario;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class S_Usuario {

    public static R_Usuario r_usuario;

    public S_Usuario(R_Usuario r_usuario) {
        this.r_usuario = r_usuario;
    }

    public static String cadastrarUsuario(String nome, String ocupacao, String matricula, String email) {
        boolean podeSalvar = true;
        String mensagem = "";
        matricula = S_Generico.limparNumero(matricula);

        if (S_Generico.campoVazio(nome)) {
            mensagem = "Informe o campo nome";
            podeSalvar = false;
        }

        if (S_Generico.campoVazio(ocupacao)) {
            mensagem = "Informe o campo ocupação";
            podeSalvar = false;
        }

        if (S_Generico.campoVazio(matricula)) {
            mensagem = "Informe o campo matrícula";
            podeSalvar = false;
        }

        if (S_Generico.campoVazio(email)) {
            mensagem = "Informe o campo e-mail";
            podeSalvar = false;
        }

        if(podeSalvar) {
            M_Usuario m_usuario = new M_Usuario();
            m_usuario.setNome(nome);
            m_usuario.setOcupacao(ocupacao);
            m_usuario.setMatricula(Long.parseLong(matricula));
            m_usuario.setEmail(email);

            try {
                r_usuario.save(m_usuario);
                mensagem = "Usuário salvo com sucesso";
            } catch (DataIntegrityViolationException e) {
                mensagem = "Falha ao inserir o usuário no banco de dados";
            }
        }
        return mensagem;
    }

}