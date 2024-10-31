package br.edu.famper.venda_automoveis.dto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarroDto {

    private String marca;
    private String modelo;
    private Double valor;
}
