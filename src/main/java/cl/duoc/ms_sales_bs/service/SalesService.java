package cl.duoc.ms_sales_bs.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import cl.duoc.ms_sales_bs.clients.ProductBsFeignClient;
import cl.duoc.ms_sales_bs.clients.SalesDbFeignClient;
import cl.duoc.ms_sales_bs.clients.UsuarioBsFeignClient;
import cl.duoc.ms_sales_bs.model.dto.ProductDTO;
import cl.duoc.ms_sales_bs.model.dto.SalesDTO;
import cl.duoc.ms_sales_bs.model.dto.SalesDetailDTO;
import cl.duoc.ms_sales_bs.model.dto.UsuarioDTO;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class SalesService {

    @Autowired
    SalesDbFeignClient salesDbFeignClient;

    @Autowired
    ProductBsFeignClient productBsFeignClient;

    @Autowired
    UsuarioBsFeignClient usuarioBsFeignClient;

public SalesDTO findSalesById(Long id) {
        // 1. Obtener venta desde ms-sales-db
        SalesDTO salesDTO = salesDbFeignClient.findSalesById(id).getBody();

        if (salesDTO == null) {
            throw new RuntimeException("Venta no encontrada");
        }

        // 2. Recorremos los detalles y le inyectamos los productos
        if (salesDTO.getSalesDetailDtoList() != null) {
            for (SalesDetailDTO detail : salesDTO.getSalesDetailDtoList()) {
                Long productId = detail.getProductId().getIdProduct();

                ProductDTO product = productBsFeignClient.findProductById(productId).getBody();
                detail.setProductId(product);
            }
        }

        if (salesDTO.getIdUsuario() != null) {
        ResponseEntity<UsuarioDTO> response = usuarioBsFeignClient.findUsuarioById(salesDTO.getIdUsuario());
        UsuarioDTO usuario = response.getBody();

        if (usuario != null) {
        String nombreCompleto = usuario.getNombreUsuario() + " " + usuario.getApellidoPaterno();
        salesDTO.setNombreusuario(nombreCompleto);
    }
}

        return salesDTO;
    }

        public SalesDTO insertSale(SalesDTO saleDTO){

        SalesDTO dto = salesDbFeignClient.insertSale(saleDTO).getBody();
        
        for(SalesDetailDTO salesDetailDTO: dto.getSalesDetailDtoList()){
            Long idProducto = salesDetailDTO.getId();
            ProductDTO product = productBsFeignClient.findProductById(idProducto).getBody();
            salesDetailDTO.setProductId(product);
        }

        return dto;    
     }
}
