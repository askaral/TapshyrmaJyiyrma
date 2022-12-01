import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Parallelepiped parallelepiped = new Parallelepiped();
            parallelepiped.setLength(scanner.nextInt());
            parallelepiped.setHeight(scanner.nextInt());
            parallelepiped.setWidth(scanner.nextInt());
            if (parallelepiped.getWidth()>20||parallelepiped.getHeight()>20||parallelepiped.getLength()>20){
                throw new MyException("Number must be below 20");
            }
            if (parallelepiped.getWidth()<0||parallelepiped.getHeight()<0||parallelepiped.getLength()<0){
                throw new MyException("Number must not be negative");
            }
            if (scanner.nextInt()!=parallelepiped.getHeight()||scanner.nextInt()!=parallelepiped.getLength()
                ||scanner.nextInt()!=parallelepiped.getWidth()) {
                throw new RuntimeException();
            }

            parallelepiped.getArea();
            parallelepiped.getVolume();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }catch (RuntimeException e) {
            System.out.println("Can't put letters");
        }


    }
}