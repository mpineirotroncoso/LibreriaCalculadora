import com.marcos.libreria.Calcular;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcularTest {
    @Test
    public void sumaTest(){
        Assertions.assertEquals(5, Calcular.calcular(2,3,Calcular.SUMA));
    }
    @Test
    public void sumaTest2(){
        Assertions.assertEquals(-1, Calcular.calcular(2,-3,Calcular.SUMA));
    }
    @Test
    public void restaTest(){
        Assertions.assertEquals(-1, Calcular.calcular(2,3,Calcular.RESTA));
    }
    @Test
    public void restaTest2(){
        Assertions.assertEquals(5, Calcular.calcular(2,-3,Calcular.RESTA));
    }
    @Test
    public void multiplicaTest(){
        Assertions.assertEquals(6, Calcular.calcular(2,3,Calcular.MULTIPLICACION));
    }
    @Test
    public void multiplicaTest2(){
        Assertions.assertEquals(20, Calcular.calcular(2,10,Calcular.MULTIPLICACION));
    }
    @Test
    public void divideTest(){
        Assertions.assertEquals(0.6666667f, Calcular.calcular(2,3,Calcular.DIVISION));
    }
    @Test
    public void divideTest2(){
        Assertions.assertEquals(6.6666665f, Calcular.calcular(20,3,Calcular.DIVISION));
    }
}
