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
public class UsuarioDTO {

    private Long idUsuario;

    private String nombreUsuario;

    private String apellidoPaterno;


    private String apellidoMaterno;

 
    private String correo;


    private String celular;

    private String direccion;
}
