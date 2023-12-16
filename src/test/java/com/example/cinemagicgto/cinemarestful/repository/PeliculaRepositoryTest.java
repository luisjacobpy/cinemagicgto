package com.example.cinemagicgto.cinemarestful.repository;

import com.example.cinemagicgto.cinemarestful.data.Pelicula;
import com.example.cinemagicgto.cinemarestful.service.PeliculaService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static javax.management.Query.eq;
import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;

@DataJpaTest // Clase de pruebas como persistencia JPA
class PeliculaRepositoryTest {
    @InjectMocks
    private PeliculaService peliculaService;

    @Mock
    private PeliculaRepository peliculaRepository;

    @Test
    public void testGuardarPelicula() {
        // Crear una instancia de Pelicula para la prueba
        PeliculaDTO peliculaDTO = new PeliculaDTO();
        peliculaDTO.setPeliculaID(1L);
        peliculaDTO.setTitulo("Pelicula de prueba");
        // Puedes establecer otros campos según tus requisitos

        // Configurar el comportamiento simulado del repositorio


        // Llamar al método de servicio que utiliza el repositorio
        Pelicula result = peliculaService.guardarPelicula(peliculaDTO);

        // Verificar que el método save del repositorio fue llamado con la película correcta
        verify(peliculaRepository, times(1)).save(eq(pelicula));

        // Verificar que el resultado es el mismo objeto que la película simulada
        assertEquals(pelicula, result);
    }
}