package ReservaNotebooks.ReservaNotebooksSENAI.Service;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Notebook;
import ReservaNotebooks.ReservaNotebooksSENAI.Repository.R_Notebook;
import org.springframework.stereotype.Service;

@Service
public class S_Notebook {

    private static R_Notebook r_notebook;

    public S_Notebook(R_Notebook r_notebook) {
        this.r_notebook = r_notebook;
    }

    public static M_Notebook cadastrarNotebook(String numero, String patrimonio) {
        boolean podeSalvar = true;
        String mensagem = "";

        if(numero == null || numero.trim().equals("")) {
            mensagem = "Campo número não pode ser vazio";
            podeSalvar = false;
        }

        if (patrimonio == null || patrimonio.trim().equals("")) {
            mensagem = "Campo patrimônio não pode ser vazio";
            podeSalvar = false;
        }

        if (podeSalvar) {
            int numeroInteiro = Integer.parseInt(numero);
            Long patrimonioInteiro = Long.parseLong(patrimonio);
            M_Notebook m_notebook = new M_Notebook();
            m_notebook.setNumero(numeroInteiro);
            m_notebook.setPatrimonio(patrimonioInteiro);
        }
        return M_Notebook m_notebook = M_Notebook();
    }
}