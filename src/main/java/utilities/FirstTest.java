package utilities;

import org.testng.annotations.Test;

public class FirstTest {


    
        @Test
        public void test01(){

            Object Assert = null;
            Assert.assertTrue(7<9);
        }

        @Test
        public void test02(){
            Object Assert;
            Assert.assertTrue("Test Fail", 7<9);
            //Test kaldığında mesaj alırız.

        }

        @Test
        public void test03(){
            Object Assert = null;
            Assert.assertEquals("SAYILAR ESIT DEGIL", "3","3");
DatabaseUtilty.createConnection();

        }
    }

