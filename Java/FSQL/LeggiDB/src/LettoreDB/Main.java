package LettoreDB;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static ArrayList<String> nodp = new ArrayList<>();
    static ArrayList<String> nopp = new ArrayList<>();
    static ArrayList<String> nocap = new ArrayList<>();


    public static void main(String[] args) {
        String nomeDb = "Italia";
        String sql = "";
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/" +
                            "?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC",
                    "root",
                    "");
            Statement stm = con.createStatement();
            //crea db
            System.out.println("creando db...");
            sql = "drop database if exists "+nomeDb+";";
            stm.executeUpdate(sql);
            sql = "create database if not exists " + nomeDb + ";";
            stm.executeUpdate(sql);
            sql = "use " + nomeDb + ";";
            stm.executeUpdate(sql);
            //crea tabella 1
            System.out.println("creando tab 1...");
            sql = "create table if not exists regioni("
                    + "nomer varchar(50) primary key"
                    + ")engine='InnoDB';";
            stm.executeUpdate(sql);
            //crea tabella 2
            System.out.println("creando tab 2...");
            sql = "create table if not exists province("
                    + "codregione varchar(50),"
                    + "foreign key(codregione) references regioni(nomer),"
                    + "sigla varchar(20) primary key"
                    + ")engine='InnoDB';";
            stm.executeUpdate(sql);
            //crea tabella 3
            System.out.println("creando tab 3...");
            sql = "create table if not exists comuni("
                    + "cap varchar(20) primary key,"
                    + "nomec varchar(50),"
                    + "provincia varchar(20),"
                    + "foreign key(provincia) references province(sigla)"
                    + ")engine='InnoDB';";
            stm.executeUpdate(sql);
            //Inserisci valori
            System.out.println("creando db");
            String[] csv=new String[5];
            Scanner sc = new Scanner(new File("C:\\Users\\franc\\IdeaProjects\\LeggiDB\\src\\LettoreDB\\comuni-localita-cap-italia.csv"));
            sc.nextLine();
            do {
                csv=sc.nextLine().split(",");
                if(doppione(csv[4], 0).equals(csv[4])) {
                    sql = "insert into regioni(nomer) values(\"" + csv[4] + "\")";
                    stm.executeUpdate(sql);
                }
                if(doppione(csv[1], 1).equals(csv[1])) {
                    sql = "insert into province(codregione, sigla) values(\"" + csv[4] + "\",\"" + csv[1] + "\")";
                    stm.executeUpdate(sql);
                }
                if(doppione(csv[2], 48).equals(csv[2])) {
                    sql = "insert into comuni(cap, nomec, provincia) values(\"" + csv[2] + "\",\""+ csv[0].replace("\"","") +"\",\""+ csv[1] +"\")";
                    stm.executeUpdate(sql);
                }
                System.out.println(Arrays.toString(csv));
            }while(sc.hasNext());

            //chiudi tutto
            System.out.println("chiudendo...");
            stm.close();
            con.close();
        } catch (SQLException | FileNotFoundException ex) {
            System.out.println(ex);
        }

    }

    private static String doppione(String nr, int eh) {
        if(eh==0) {
            nodp.add(nr);
            int len = nodp.size() - 1;
            for (int i = 0; i < len; i++) {
                if (nr.equals(nodp.get(i))) {
                    nodp.remove(len);
                    return "";
                }
            }
            return nr;
        }
        else if(eh==1){
            nopp.add(nr);
            int len = nopp.size() - 1;
            for (int i = 0; i < len; i++) {
                if (nr.equals(nopp.get(i))) {
                    nopp.remove(len);
                    return "";
                }
            }
            return nr;
        }
        else if(eh==48){
            nocap.add(nr);
            int len = nocap.size() - 1;
            for (int i = 0; i < len; i++) {
                if (nr.equals(nocap.get(i))) {
                    nocap.remove(len);
                    return "";
                }
            }
            return nr;
        }
        return "";
    }
}