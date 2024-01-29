package com.company;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        User[] users = new User[101];
        String str = "";
        String[] studentsdata  ;
        int i = 0;

        BufferedReader reader = null;   BufferedWriter writer1=null;    BufferedWriter writer2=null;    BufferedWriter writer3=null;

        try {
            reader = new BufferedReader(new FileReader("student-master-list.csv"));
             writer1 = new BufferedWriter(new FileWriter("course1.csv"));
            writer2 = new BufferedWriter(new FileWriter("course2.csv"));
             writer3 = new BufferedWriter(new FileWriter("course3.csv"));
            while ((str = reader.readLine()) != null) {
                studentsdata = str.split(",");
                users[i++] = new User(studentsdata[0], studentsdata[1], studentsdata[2],  studentsdata[3]== null ? 0 :Integer.parseInt(studentsdata[3]));
            }

           Arrays.sort(users, (o1, o2) -> {
                if (o1 ==null|| o2==null){
                    return 0;
                }
                if (o1.getGrade() == o2.getGrade()){
                    return 0;
                }
                if (o1.getGrade() <o2.getGrade()){
                    return 1;
                }
                return -1;
            });
        for ( User user:users){
            if (user!=null){
                if (user.getCourse().contains("COMPSCI")) {
                    writer1.write((user.getId()+","+user.getName()+","+ user.getCourse() +","+ user.getGrade()));
                    writer1.newLine();}

                else if (user.getCourse().contains("APMTH")) {
                    writer2.write((user.getId()+","+user.getName()+","+ user.getCourse() +","+ user.getGrade()));
                    writer2.newLine();}

                else if (user.getCourse().contains("STAT")) {
                    writer3.write((user.getId()+","+user.getName()+","+ user.getCourse() +","+ user.getGrade()));
                    writer3.newLine();}
            }
        }

        } finally {
            reader.close(); writer1.close();    writer2.close();    writer3.close();

        }

    }
}
