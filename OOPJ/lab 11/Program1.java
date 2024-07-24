import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
 
class LabStudent {
    int rollNo;
    String name;
    String email;
    int semester;
    
    public LabStudent(int rollNo , String name , String email , int semester){
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.semester = semester;
    }
}
public class Program1 {

    public static void main(String[] args) {
        try{
        BufferedReader br = new BufferedReader((new FileReader("Data.csv")));
        BufferedWriter bw = new BufferedWriter((new FileWriter("Data2.csv")));
        ArrayList<LabStudent> student = new ArrayList<LabStudent>();
            while(br.ready()){
                String temp = br.readLine();
                String[] data = temp.split(",");
                LabStudent tempStu = new LabStudent(Integer.parseInt(data[0]), data[1] , data[2], Integer.parseInt(data[3]));
                student.add(tempStu);
            }

            Iterator<LabStudent> itr = student.iterator();
            while (itr.hasNext()) {
                LabStudent temp = itr.next();
                if(temp.rollNo>100){
                    temp.semester++;
                }

                String studentData = temp.rollNo+","+temp.name+","+temp.email+","+temp.semester;
                bw.write(studentData);
                bw.newLine();
            }
            bw.close();
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}