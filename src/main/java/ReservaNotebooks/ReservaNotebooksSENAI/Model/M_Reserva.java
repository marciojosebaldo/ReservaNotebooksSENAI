package ReservaNotebooks.ReservaNotebooksSENAI.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "reserva_note")
public class M_Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_note;
    private Long id_reserva;




}