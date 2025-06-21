package cl.duoc.ms_sales_bs.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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

    @JsonProperty("idsales")
    private Long idSales;

    @JsonProperty("usuario")
    private Long idUsuario;

    private String nombreusuario;

    @JsonProperty("estadoventa")
    private String estadoVenta;

    @JsonProperty("metodoretiro")
    private String metodoDeRetiro;

    @JsonProperty("valortotal")
    private Long valorTotal;

    @JsonProperty("detalles")
    private List<SalesDetailDTO> salesDetailDtoList;
}
