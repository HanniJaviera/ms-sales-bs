package cl.duoc.ms_sales_bs.model.dto;
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
public class ProductDTO {
    @JsonProperty("id")
    private Long idProduct;

    @JsonProperty("nombreProduct")
    private String nombreProduct;

  
    private String descripcion;


    private Long cantidad;


    private Long precio;
}
