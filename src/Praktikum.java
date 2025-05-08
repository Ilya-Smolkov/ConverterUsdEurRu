import java.util.ArrayList;

public class Praktikum {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(122.1);
        expenses.add(111.1);
        double sum=0;
        //expenses.clear();
        if (expenses.isEmpty()){
            System.out.println("Trat 0");
        }else {
            for (Double exp:expenses){
                sum +=exp;
            }
            System.out.println("Trati est, ih "+ expenses.size()+" na summu "+sum);
        }




    }
}

