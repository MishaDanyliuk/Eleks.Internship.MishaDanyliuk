package com.example.shedule.domain;

import com.sun.xml.internal.ws.server.ServerRtException;
import java.util.Objects;

public class Shedule {
    private String GroupName;
    private String SubjectName;
    private String TeacherName;
    private String LessonTime;



    public Shedule() {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shedule entity = (Shedule) o;
        return Objects.equals(GroupName, entity.GroupName) &&
                Objects.equals(SubjectName, entity.SubjectName) &&
        Objects.equals(TeacherName, entity.TeacherName) &&
                Objects.equals(LessonTime, entity.LessonTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GroupName,SubjectName,TeacherName,LessonTime);
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public String getLessonTime() {
        return LessonTime;
    }

    public void setLessonTime(String lessonTime) {
        LessonTime = lessonTime;
    }
}



