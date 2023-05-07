import java.sql.*;

public class Query02 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");


        //2)DATABASE E BAGLAN
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "bu1sifre.");

        //3)STATEMENT
        Statement st = con.createStatement();

        //Region id si country _name degerlerini cagirin

       String sql01= "select country_name from countries where region_id=1";

       //4resultset

        ResultSet veri=st.executeQuery(sql01);
        while (veri.next()){
            System.out.println(veri.getString(1));
        }

        //soru2;region_id nin 2 den buyuk oldugu contry_id ve country_name  degrelerini cagirin..

        String sql02="select country_id, country_name from countries where region_id>2 ";
        ResultSet veri02= st.executeQuery(sql02);
        while (veri02.next()){
            System.out.println(veri02.getString("countyr_name")+veri02.getString("country_id"));
        }
        //kapatma
        con.close();
        st.close();
        veri.close();
        veri02.close();

    }



}
