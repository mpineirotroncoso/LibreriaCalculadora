import com.marcos.libreria.Calcular;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcularTest {
    @Test
    public void sumaTest(){
        assertEquals(5, Calcular.calcular(2,3,Calcular.SUMA));
    }
    @Test
    public void sumaTest2(){
        assertEquals(-1, Calcular.calcular(2,-3,Calcular.SUMA));
    }
    @Test
    public void restaTest(){
        assertEquals(-1, Calcular.calcular(2,3,Calcular.RESTA));
    }
    @Test
    public void restaTest2(){
        assertEquals(5, Calcular.calcular(2,-3,Calcular.RESTA));
    }
    @Test
    public void multiplicaTest(){
        assertEquals(6, Calcular.calcular(2,3,Calcular.MULTIPLICACION));
    }
    @Test
    public void multiplicaTest2(){
        assertEquals(20, Calcular.calcular(2,10,Calcular.MULTIPLICACION));
    }
    @Test
    public void divideTest(){
        assertEquals(0.6666667f, Calcular.calcular(2,3,Calcular.DIVISION));
    }
    @Test
    public void divideTest2(){
        assertEquals(6.6666665f, Calcular.calcular(20,3,Calcular.DIVISION));
    }
}
