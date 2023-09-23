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

    public String cadastrarNotebook(String numero, String patrimonio) {
        boolean podeSalvar = true;
        String mensagem = "";
        numero = S_Generico.limparNumero(numero);
        patrimonio = S_Generico.limparNumero(patrimonio);

        if(S_Generico.campoVazio(numero)) {
            mensagem += "Informe o campo número";
            podeSalvar = false;
        }
        if (S_Generico.campoVazio(patrimonio)) {
            mensagem += "Informe o campo patrimônio";
            podeSalvar = false;
        }
        if (podeSalvar) {
            M_Notebook m_notebook = new M_Notebook();
            m_notebook.setNumero(Integer.parseInt(numero));
            m_notebook.setPatrimonio(Long.parseLong(patrimonio));
            mensagem = "Dados salvos com sucesso";
        }
        return mensagem;
    }
}