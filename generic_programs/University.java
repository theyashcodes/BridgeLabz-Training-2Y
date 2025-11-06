import java.util.*;

abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    T type;
    Course(T t){ type = t; }
}

public class University {
    public static void printCourses(List<? extends CourseType> list){
        list.forEach(System.out::println);
    }
}
