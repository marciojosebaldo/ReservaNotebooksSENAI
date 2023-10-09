package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import ReservaNotebooks.ReservaNotebooksSENAI.Service.S_Notebook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class C_Notebook {

    @GetMapping("/cadastro/notebook")
    public String getCadNotebook() {
        return "/Cadastros/notebook";
    }

    @PostMapping("/cadastros/notebook")
    @ResponseBody

    public String postCadNotebook(@RequestParam("numero") String numero,
                                  @RequestParam("patrimonio") String patrimonio) {

        return S_Notebook.cadastrarNotebook(numero, patrimonio);
    }
}