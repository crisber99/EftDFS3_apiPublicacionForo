#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.Respuesta;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestasRepository extends JpaRepository<Respuestas, Long> {

}
