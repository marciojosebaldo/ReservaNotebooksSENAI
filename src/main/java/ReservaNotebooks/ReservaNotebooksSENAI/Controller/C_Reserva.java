package ReservaNotebooks.ReservaNotebooksSENAI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Reserva {

    @PostMapping("/reserva")
    @ResponseBody

    public String postReservaNotebook(@RequestParam("data") String data,
                                      @RequestParam("quantidade") String quantidade) {

        return "endereço do Service";
    }
}