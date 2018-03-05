import java.util.Scanner;
public class TestMyArrays {
    public static void main(String[] args) {


Scanner input = new Scanner(System.in);
    int[] list = new int[100];

    list[0] = 4;
    list[1] = 3;
    list[2] = 9;
    list[3] = 7;

    System.out.println(MyArrays.linearSearch(list,4,3));
    System.out.println(MyArrays.linearSearch(list,4,6));

        int[] list2 = new int[100];

        list2[0] = 4;
        list2[1] = 8;
        list2[2] = 9;
        list2[3] = 17;

        int[] list3 = new int[100];

        list3[0] = 5;
        list3[1] = 10;
        list3[2] = 11;
        list3[3] = 22;

        int[] list4 = new int[100];
        list4=MyArrays.merge(list2,0,3,list3,0,3);

       for(int x=0; x<9; x++) {
           System.out.println(list4[x]+"");
       }
    }
}
