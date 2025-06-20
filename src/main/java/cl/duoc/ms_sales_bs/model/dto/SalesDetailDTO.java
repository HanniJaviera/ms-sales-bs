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
public class SalesDetailDTO {

    private Long id;

    @JsonProperty("productId")
    private ProductDTO productId;
    
    private Long quantity;
    
    private Long salesId; 
}
