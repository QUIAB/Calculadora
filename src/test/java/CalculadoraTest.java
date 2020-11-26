//Librerias que se utilizan para el test
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    Calculadora calc;

    //Se ejecutara antes del cada Test
    @Before
    public void iniciador(){
        //Creacion del objeto
        calc = new Calculadora();
    }

    @Test
    public void suma1(){
        int resultado = calc.suma(10,20);
        int exp = 30;
        assertEquals(exp,resultado);
    }

    @Test
    public void suma2(){
        int resultado = calc.suma(50,125);
        int exp = 175;
        assertEquals(exp,resultado);
    }
    @Test
    public void resta1(){
        int resultado = calc.resta(10,20);
        int exp = -10;
        assertEquals(exp,resultado);
    }
    @Test
    public void resta2(){
        int resultado = calc.resta(125,20);
        int exp = 105;
        assertEquals(exp,resultado);
    }
    @Test
    public void multiplicacion1(){
        int resultado = calc.multiplicación(10,20);
        int exp = 200;
        assertEquals(exp,resultado);
    }
    @Test
    public void multiplicacion2(){
    int resultado = calc.multiplicación(5,20);
    int exp = 100;
    assertEquals(exp,resultado);

    }
    @Test
    public void division1(){
        int resultado = calc.division(10,2);
        int exp = 5;
        assertEquals(exp,resultado);
    }
    @Test
    public void division2(){
        int resultado = calc.division(100,20);
        int exp = 5;
        assertEquals(exp,resultado);
    }
    @Test
    public void potencia1(){
        int resultado = calc.potencia(10,2);
        int exp = 100;
        assertEquals(exp,resultado);
    }
    @Test
    public void potencia2(){
        int resultado = calc.potencia(2,3);
        int exp = 8;
        assertEquals(exp,resultado);
    }

}
