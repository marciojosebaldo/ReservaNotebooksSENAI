package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Resposta;
import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import ReservaNotebooks.ReservaNotebooksSENAI.Repository.R_Usuario;
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

        String mensagem;

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

    public static M_Resposta salvarEditUsuario(String nome, String matricula, String email, String ocupacao, String senhaAtual,
                                         String novaSenha, String confSenha, String ativo, M_Usuario usuario) {

        boolean podeSalvar = true;
        String mensagem = "";
        matricula = S_Generico.limparNumero(matricula);

        if(senhaAtual.equals(usuario.getSenha())) {
            if(S_Generico.campoVazio(nome)) {
                podeSalvar = false;
                mensagem += "O nome precisa ser preenchido";
            }
            if(S_Generico.campoVazio(matricula)) {
                podeSalvar = false;
                mensagem += "Matrícula inválida";
            }
            if(S_Generico.campoVazio(email)){
                podeSalvar = false;
                mensagem += "e-mail precisa ser preenchido";
            }
            if(!novaSenha.equals(confSenha)) {
                podeSalvar = false;
                mensagem += "Nova senha e confirmação de nova senha precisam ser iguais";
            }
        } else {
            podeSalvar = false;
            mensagem += "Senha inválida";
        }

        if(podeSalvar){
            usuario.setNome(nome);
            usuario.setEmail(email);
            if(!S_Generico.campoVazio(novaSenha)) {
                usuario.setSenha(novaSenha);
            }
            if(usuario.getOcupacao() == 1){
                usuario.setOcupacao(Long.parseLong(ocupacao));
                usuario.setMatricula(Long.parseLong(matricula));
                usuario.setAtivo(Boolean.parseBoolean(ativo));
            }
            try{
                r_usuario.save(usuario); // O Spring Boot busca se há um id deste dado. Se tiver, o framework fará a atualização. Caso
                // não exista, será criado um novo registro.
                // Save pode ser usado tanto para updates quanto para inserts. Para atualizar, basta existir o id
                // Essa identificação é feita pela própria session
                mensagem += "Atualização concluída!";
            } catch (DataIntegrityViolationException e) {
                podeSalvar = false;
                mensagem += "Falha ao atualizar os dados";
            }
        }
        return new M_Resposta(podeSalvar, mensagem);
    }
}