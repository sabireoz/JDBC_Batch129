import java.sql.*;

public class Query04 {


        public static void main(String[] args) throws ClassNotFoundException, SQLException, SQLException {

            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jdbc",
                    "postgres",
                    "bu1sifre.");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from ogrenciler");

            ResultSetMetaData rmsd = rs.getMetaData();//sutun bilgilerini almak icin kullnabiliriz.
            System.out.println("1. sutunun ismi: " + rmsd.getColumnName(1));
            System.out.println("2. sutunun ismi: " + rmsd.getColumnName(2));
            System.out.println("3. sutunun ismi: " + rmsd.getColumnName(3));
            System.out.println("4. sutunun ismi: " + rmsd.getColumnName(4));

            System.out.println("Tablo ismi: " + rmsd.getTableName(3));

            System.out.println(rmsd.getColumnTypeName(1));
            System.out.println(rmsd.getColumnTypeName(2));
            System.out.println(rmsd.getColumnTypeName(3));


        }
    }


