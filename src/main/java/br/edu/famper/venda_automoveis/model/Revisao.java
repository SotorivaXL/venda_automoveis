package br.edu.famper.venda_automoveis.model;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "revisao")
@Data
public class Revisao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "revisao_id")
    private Long id;

    @Column(name = "data_revisao")
    private Date data;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "carro_id", nullable = false)
    private Carro carro;
}
