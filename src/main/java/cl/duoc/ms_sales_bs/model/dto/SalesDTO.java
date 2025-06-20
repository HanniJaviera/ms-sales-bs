package cl.duoc.ms_sales_bs.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SalesDTO {

    private Long idSales;

    private LocalDate salesDate;

    private UsuarioDTO usuario;

    private String estadoVenta;

    private String metodoDeRetiro;

    private BigDecimal valorTotal;

    private List<SalesDetailDTO> detalles;
}
