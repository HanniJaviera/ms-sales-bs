package cl.duoc.ms_sales_bs.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cl.duoc.ms_sales_bs.model.dto.UsuarioDTO;

@FeignClient(name = "ms-usuario.bs", url = "http://localhost:8082")
public interface UsuarioBsFeignClient {
    
    @GetMapping("/api/usuarios/{id}")
    ResponseEntity<UsuarioDTO> findUsuarioById(@PathVariable("id") Long id);
}
