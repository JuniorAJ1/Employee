package ie.gmit.SAT;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class EmployeeTest {

    private Employee E1;

    @Test
    void TestConstuctorname(){
        E1 = new Employee("name","12345");
        assertEquals("name",E1.getName());
    }


}
