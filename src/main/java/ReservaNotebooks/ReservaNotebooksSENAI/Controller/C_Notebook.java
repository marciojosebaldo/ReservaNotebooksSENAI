package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class C_Notebook {

    @GetMapping("/cadastro/notebook")
    public String getCadNotebook() {
        return "cadastros/notebook";
    }

    @PostMapping("/cadastro/notebook")
    public String postCadNotebook(@RequestParam("numero") String numero,
                                  @RequestParam("patrimonio") String patrimonio) {
        return null;
    }
}