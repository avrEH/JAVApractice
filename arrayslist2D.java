import java.util.*;
public class arrayslist2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 
        //intialisation
        for (int i=0;i<3;i++){
            list.add(new ArrayList<>());}
             //add element
             System.out.println("Enter element");
             for(int i=0;i<3;i++)//No of Rows
             {
                for (int j=0;j<5;j++)//No of Columns
                {
                    list.get(i).add(sc.nextInt());
                }
             }
             System.out.println(list);
        
    }

    
}