import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Xuwq
 * @Description:
 * @Date: 2020/4/28
 **/
public class SMTest {
    public static void main(String[] args) throws IOException {

        StudentManager studentManager = new StudentManager();
        ArrayList<Student> student=new ArrayList<Student>();
        while(true){
            System.out.println("请选择操作：");
            System.out.println("******************");
            System.out.println("**    1、插入    **");
            System.out.println("**    2、删除    **");
            System.out.println("**    3、查找    **");
            System.out.println("**    4、遍历    **");
            System.out.println("**    5、修改    **");
            System.out.println("**    6、退出    **");
            System.out.println("******************");

            Scanner scanner=new Scanner(System.in);
            int btn=scanner.nextInt();
            switch(btn) {
                case 1://插入
                    StudentManager.insertStudent(student);
                    student.clear();
                    break;
                case 2://删除
                    StudentManager.deleteStudent(student);
                    student.clear();
                    break;
                case 3://查找
                    StudentManager.findStudent(student);
                    student.clear();
                    break;
                case 4://遍历
                    StudentManager.ListStudent(student);
                    student.clear();
                    break;
                case 5://修改
                    studentManager.updateStudent(student);
                    student.clear();
                    break;
                case 6://回主菜单
                    System.exit(0);
                    break;
                default:
                    System.out.println("无效输入！请输入1~5");
            }
        }
    }
}
