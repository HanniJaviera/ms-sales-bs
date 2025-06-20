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
    private Long idProduct;

 
    private String nombreProduct;

  
    private String descripcion;


    private Long cantidad;


    private Long precio;
}
