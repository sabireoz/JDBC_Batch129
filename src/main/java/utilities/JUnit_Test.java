package utilities;

import org.testng.annotations.Test;

import static utilities.DatabaseUtilty.closeConnection;
import static utilities.DatabaseUtilty.createConnection;

public class JUnit_Test {





        @Test
        public void test01(){
            //Nil Naz ve Ali Can isimli öğrencilerin DataBase'de kayıtlı olduğunu doğrula
            createConnection();





            closeConnection();
        }
    }

