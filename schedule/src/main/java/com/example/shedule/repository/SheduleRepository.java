package com.example.shedule.repository;

import com.example.shedule.domain.Shedule;
import org.springframework.stereotype.Repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SheduleRepository {
    public List<Shedule> getShedule() {

   try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        System.out.println("Class not found " + e);
    }
        System.out.println("JDBC Class found");

    List<Shedule> rozklad = new ArrayList<>();
        try {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/rozklad?useSSL=false", "root", "12345");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT g.GroupName, sub.SubjectName, t.TeacherName, c.LessonTime FROM schedule ch INNER JOIN groups g ON ch.GroupID = g.gr_ID INNER JOIN subjects sub ON ch.SubjectID = sub.subj_ID INNER JOIN teachers t ON ch.TeacherID = t.teach_ID INNER JOIN calendar c ON ch.WeekDay = c.WeekDay WHERE g.GroupName = 'ПІ' ORDER BY ch.LessonID;");
        while (rs.next()) {
            String gname =rs.getString(1);
            String sname = rs.getString(2);
            String tname = rs.getString(3);
            String ltime = rs.getString(4);
            Shedule at = new Shedule();
            at.setGroupName(gname);
            at.setSubjectName(sname);
            at.setTeacherName(tname);
            at.setLessonTime(ltime);
            rozklad.add(at);

            System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3) +"  " + rs.getString(4));
        }

    } catch (SQLException e) {
        System.out.println("SQL exception occured " + e);
    }
        return rozklad ;
}
    }


