package ReservaNotebooks.ReservaNotebooksSENAI.Repository;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// O código abaixo estava salvando os dados antes de incluir o método abaixo
@Repository
public interface R_Usuario extends JpaRepository<M_Usuario, Long> {
    /*@Query(value = "SELECT * FROM usuario WHERE matricula := matricula", nativeQuery = true)
    M_Usuario findByMatricula(@Param("matricula") Long matricula);*/
}