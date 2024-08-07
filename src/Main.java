import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        FuncInterface fobj = (int x)->System.out.println(2*x);
        fobj.abractFun(5);

        //Using Lambda expression to print all element of array
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(n -> System.out.println(n));

        // Using Lambda expression to print even elements of array

        arrL.forEach(n-> {if(n % 2 == 0)
        System.out.println(n);});

    }
}