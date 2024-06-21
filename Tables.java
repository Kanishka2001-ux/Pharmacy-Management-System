
package dao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class Tables {
    public static void main (String [] args) {
        try{
            Connection con= ConnectionProvider.getCon();
            Statement st=con.createStatement();
            //st.executeUpdate("create table user(user_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobile_Number varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
            //st.executeUpdate("insert into user(userRole,name,dob,mobile_Number,email,username,password,address)values('Pharmacist','S.K.Fernando','03-05-1992','0775432178','fernando@gmail.com','Pharmacist','Fernando123','Nugegoda')");
            //st.executeUpdate("insert into user(userRole,name,dob,mobile_Number,email,username,password,address)values('Admin','D.B.S.Silva','09-10-1994','0704238790','silva@gmail.com','Admin','Silva123','Kandy')");
            //st.executeUpdate("create table medicine(med_id varchar(200) primary key, med_name varchar(200), company_name varchar(200), med_quantity int, med_price float, med_exp_date varchar(50), med_man_date varchar(50))");
            st.executeUpdate("create table bill(bill_id varchar(200) primary key, bill_date varchar(50), total_paid float, generated_by varchar(50))");
            JOptionPane.showMessageDialog(null,"Table Created Successfully");
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        
        }
    }
    
}
