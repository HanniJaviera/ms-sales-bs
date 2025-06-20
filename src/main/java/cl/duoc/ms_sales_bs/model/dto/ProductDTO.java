package cl.duoc.ms_sales_bs.model.dto;
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

    //@JsonProperty(value = "producto_id")
    private Long id;

    //@JsonProperty(value = "producto_nombre")
    private String nombreProduct;

    //@JsonProperty(value = "producto_descripcion")
    private String descripcion;

    //@JsonProperty(value = "producto_cantidad")
    private Long cantidad;

    //@JsonProperty(value = "producto_precio")
    private Long precio;
}
