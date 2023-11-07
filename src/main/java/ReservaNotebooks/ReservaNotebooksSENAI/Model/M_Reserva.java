package ReservaNotebooks.ReservaNotebooksSENAI.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reserva")
public class M_Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long id_usuario;
    private Long quantidade;
    private LocalDate data_ini;
    private String data_fin;
    private String hora_ini;
    private String hora_fin;
    private String hora_reg;

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

    public String getData_fin() {
        return data_fin;
    }

    public void setData_fin(String data_fin) {
        this.data_fin = data_fin;
    }

    public String getHora_ini() {
        return hora_ini;
    }

    public void setHora_ini(String hora_ini) {
        this.hora_ini = hora_ini;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getHora_reg() {
        return hora_reg;
    }

    public void setHora_reg(String hora_reg) {
        this.hora_reg = hora_reg;
    }
}