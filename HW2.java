import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class HW2 {
        public static void main(String[] args) throws UnsupportedEncodingException {
            int income;
            int spending;
            income = 44000;
            spending = 30000;
            int itogo;
            PrintStream out=new PrintStream(System.out,true,"UTF-8");
            String txt = "Итого (руб):";
            out.println(txt);
            System.out.println(income-spending);
        }
    }

