package utilities;

import org.junit.Test;
import org.testng.Assert;

public class TestNG_Test {
  @Test
  public  void  test01(){

    //Derya Soylu database kayitli mi?
    DatabaseUtilty.createConnection();
    String sql ="select * from ogrenciler";
    Assert.assertTrue(DatabaseUtilty.getColumnData(sql, "ogrenci ismi").contains("Derya Soylu"), "DATABASE DE KAYIT BULUNAMADI");

@Test
public  void test02(){

  //111 numarali kayit var mi?

    DatabaseUtilty.createConnection();
    Assert.assertTrue(DatabaseUtilty.getColumnData("select * from ogrenciler"  "okul no").contains(1112) );
    }

    DatabaseUtilty.closeConnection();
  }

}
