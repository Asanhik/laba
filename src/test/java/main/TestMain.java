package main; 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
public class TestMain {
    @Test
    public void testResult() {
	Main main = new Main();  
	double result_number = main.getResult(12, 4);
	double number = 2; 
	assertEquals(number, result_number); 
    }    
}
