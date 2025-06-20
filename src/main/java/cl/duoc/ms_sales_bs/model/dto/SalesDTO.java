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

    @JsonProperty(value = "id_Sales")
    private Long idSales;

    @JsonProperty(value = "sales_date")
    private Long salesDate;

    @JsonProperty(value = "id_Usuario")
    private Long idUsuario;

    @JsonProperty(value = "id_Product")
    private Long idProduct;

    @JsonProperty(value = "estadoventa")
    private String estadoVenta;

    @JsonProperty(value = "metododeretiro")
    private String metodoDeRetiro;

    @JsonProperty(value = "valortotal")
    private Long valorTotal;

    @JsonProperty("sales_detail")
    private List<SalesDetailDTO> salesDetailDtoList;
}
