import java.sql.*;

public class Query01 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1)Driver tanimla
        Class.forName("org.postgresql.Driver");


         //2)DATABASE E BAGLAN
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "bu1sifre.");

        //3)STATEMENT
        Statement st = con.createStatement();

      //  System.out.println ("Connection Success");

//4 RESULTSET
        ResultSet veri=st.executeQuery("select * from ogrenciler");//yapacagimiz sorgulari karsi tarafailetiyorz..
//5 DTALARI AL
        while (veri.next()){
            System.out.println(veri.getInt(1)
            +veri.getString(2)
            +veri.getString(3)
            +veri.getString(4));
        }
//6 BAGLANTILARI KAPAT
       // con.close();
       // st.close();
       // veri.close();


    }

}
