import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Bài 1
        //làm vời do white
        String select = "";
        int sum=0;
        do {
            System.out.println("Mời bạn nhập 1 số nguyên:");
            int n=Integer.parseInt(scanner.nextLine());
            System.out.println("Do you want to continue? (Y/N)");
            select=scanner.nextLine();
            sum+=n;
        } while (select.equals("Y"));
        System.out.println("Tổng các số nguyên là: " +sum);

        //Làm với white
        /*String select = "";
        System.out.println("Mời bạn nhập 1 số nguyên:");
        int n=Integer.parseInt(scanner.nextLine());
        System.out.println("Do you want to continue? (Y/N)");
        select=scanner.nextLine();
        int sum=n;
        while (select.equals("Y")){
            System.out.println("Mời bạn nhập 1 số nguyên:");
            n=Integer.parseInt(scanner.nextLine());
            System.out.println("Do you want to continue? (Y/N)");
            select=scanner.nextLine();
            sum+=n;
        }
        System.out.println("Tổng các số nguyên là: " +sum);*/


        //Bài 2
        String select="";
        do {
            System.out.println("Mời bạn nhập tên:");
            String name= scanner.nextLine();
            System.out.println("Mời bạn nhập địa chỉ:");
            String address= scanner.nextLine();
            System.out.println("Mời bạn nhập tuổi:");
            int age=Integer.parseInt(scanner.nextLine());
            System.out.println("Thông tin sinh viên là\nTên sinh viên: "+name+"\nĐịa chỉ: "+address+"\nTuổi: "+age);
            System.out.println("Do you want to continues?(Y/N)");
            select=scanner.nextLine();
        } while (select.equals("Y"));
    }
}
