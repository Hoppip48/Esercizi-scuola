package BaseData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        String nomeDb ="Italia";
        String nomeTabella="";
        String sql="";
        try {
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/"+
                            "?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC",
                    "root",
                    "");
            Statement stm = con.createStatement();
            //crea db
            sql = "create database if not exists " + nomeDb + ";";
            stm.executeUpdate(sql);
            sql= "use " + nomeDb + ";";
            stm.executeUpdate(sql);
            //crea tabella 1
            sql="create table if not exists regioni("
                        + "nomer varchar(20) primary key"
                        + ")engine='InnoDB';";
            stm.executeUpdate(sql);
            //crea tabella 2
            sql="create table if not exists province("
                        + "codregione varchar(20) primary key,"
                        + "foreign key codregione references regioni(nomer),"
                        + "sigla varchar(20)"
                        + ")engine='InnoDB';";
            stm.executeUpdate(sql);
            //crea tabella 3
            sql="create table if not exists comuni("
                        + "cap varchar(20) primary key,"
                        + "nomec varchar(20)"
                        + "comuni varchar(20)"
                        + ")engine='InnoDB';";
            stm.executeUpdate(sql);
            //Inserisci valori
            modtabella("mammt","mammt 2 il sequel"); //ancora da fare
            //chiudi tutto
            stm.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex + " crea db");
        }

    }
    private static void modtabella(String ntab, String ndb){
        String sql="";
        try{
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/"+ndb+
                            "?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC",
                    "root",
                    "");
            Statement stm = con.createStatement();
            sql="insert into "+ntab+";";
            stm.executeUpdate(sql);
            stm.close();
            con.close();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}