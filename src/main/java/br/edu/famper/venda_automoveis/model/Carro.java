package br.edu.famper.venda_automoveis.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "carros")
@Data
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "carro_id")
    private Long id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "ano")
    private int ano;

    @OneToMany(mappedBy = "carro", targetEntity = Venda.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Venda> vendas;

    @OneToMany(mappedBy = "carro", targetEntity = Revisao.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Revisao> revisoes;
}
