package ReservaNotebooks.ReservaNotebooksSENAI.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "reserva_note")
public class M_Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long id_usuario;
    private Long quantidade;
    private String data_ini;
    private String data_fim;
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

    public String getData_ini() {
        return data_ini;
    }

    public void setData_ini(String data_ini) {
        this.data_ini = data_ini;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
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