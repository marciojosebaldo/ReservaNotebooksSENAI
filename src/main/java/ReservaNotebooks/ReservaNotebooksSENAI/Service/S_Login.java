package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import ReservaNotebooks.ReservaNotebooksSENAI.Repository.R_Usuario;
import org.springframework.stereotype.Service;

@Service
public class S_Login {
    private static R_Usuario r_usuario;

    public S_Login(R_Usuario r_usuario) {
        this.r_usuario = r_usuario;
    }


    public static M_Usuario validaLogin(String matricula, String senha) {
        Long validaMatricula;
        if(S_Generico.limparNumero(matricula).equals("")) {
            validaMatricula = null;
        } else {
            validaMatricula = Long.valueOf(S_Generico.limparNumero(matricula));
        }
        return r_usuario.findByMatricula(validaMatricula, senha);
    }

}