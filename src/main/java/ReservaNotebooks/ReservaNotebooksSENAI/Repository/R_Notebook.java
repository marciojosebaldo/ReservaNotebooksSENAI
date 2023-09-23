package ReservaNotebooks.ReservaNotebooksSENAI.Repository;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Notebook extends JpaRepository<M_Notebook, Long> {
    @Query(value = "INSERT INTO notebook (numero, patrimonio) VALUES (numero = :numero, patrimonio = :patrimonio)",
    nativeQuery = true)
    M_Notebook inserirNotebook(@Param("numero") int numero, @Param("patrimonio") Long patrimonio);

}