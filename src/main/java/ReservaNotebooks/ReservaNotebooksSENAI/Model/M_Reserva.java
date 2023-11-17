package ReservaNotebooks.ReservaNotebooksSENAI.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "reserva")
public class M_Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long id_usuario;
    private Long quantidade;
    private LocalDate data_ini;
    private LocalDate data_fin;
    private LocalTime hora_ini;
    private LocalTime hora_fin;
    private LocalDate hora_reg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getData_ini() {
        return data_ini;
    }

    public void setData_ini(LocalDate data_ini) {
        this.data_ini = data_ini;
    }

    public LocalDate getData_fin() {
        return data_fin;
    }

    public void setData_fin(LocalDate data_fin) {
        this.data_fin = data_fin;
    }

    public LocalTime getHora_ini() {
        return hora_ini;
    }

    public void setHora_ini(LocalTime hora_ini) {
        this.hora_ini = hora_ini;
    }

    public LocalTime getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(LocalTime hora_fin) {
        this.hora_fin = hora_fin;
    }

    public LocalDate getHora_reg() {
        return hora_reg;
    }

    public void setHora_reg(LocalDate hora_reg) {
        this.hora_reg = hora_reg;
    }
}