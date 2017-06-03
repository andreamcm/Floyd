// Autores: Andrea Cordón (16076) y Cristopher Recinos (16005)
// Fecha: 02/06/2017
// Descripción: Pruebas unitarias del camino más corto.
// JUnit.java

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnit(){
  @Test
  public void prueba1(){
    revisarRuta(Jutiapa, Totonicapan);
    assert.Equals("Jalapa", 820);
  }

  @Test
  public void prueba2(){
    revisarRuta(Escuintla, Izabal);
    assert.Equals("Guatemala", 650);
  }
}
