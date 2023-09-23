package ReservaNotebooks.ReservaNotebooksSENAI.Repository;

import ReservaNotebooks.ReservaNotebooksSENAI.Model.M_Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// O repository entende que é um save, ou seja, é um padrão porque está de acordo com o Model.
// Todo o CRUD quando é tabela completa, dispensa o query

@Repository
public interface R_Notebook extends JpaRepository<M_Notebook, Long> {
}