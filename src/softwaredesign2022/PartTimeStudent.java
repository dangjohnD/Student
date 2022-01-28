/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredesign2022;

/**
 *
 * @author okami
 */
public class PartTimeStudent extends Student{
    private int numCourses;
    
    public PartTimeStudent(String studentID, String studentName, int numCourses){
        super(studentID, studentName);
        this.numCourses = numCourses;
    }
    
    public int getNumCourses(){
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
