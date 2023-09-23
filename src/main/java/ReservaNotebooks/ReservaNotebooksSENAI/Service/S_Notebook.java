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

    public static void cadastrarNotebook(String numero, String patrimonio) {
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
            M_Notebook m_notebook = new M_Notebook();
            int numeroInteiro = Integer.parseInt(numero);
            Long patrimonioLongo = Long.parseLong(patrimonio);
            m_notebook.setNumero(numeroInteiro);
            m_notebook.setPatrimonio(patrimonioLongo);
            mensagem = "Dados salvos com sucesso";
        }
    }
}