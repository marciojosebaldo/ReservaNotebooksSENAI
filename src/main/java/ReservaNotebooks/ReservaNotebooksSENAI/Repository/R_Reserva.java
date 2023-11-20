package ReservaNotebooks.ReservaNotebooksSENAI.Repository;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface R_Reserva extends JpaRepository<M_Reserva, Long> {
    @Query(value = "SELECT * FROM reserva", nativeQuery = true)
    List<M_Reserva> buscaReserva();
}