import java.util.Scanner;

class example1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Choose a fruit from Mango,Apple,Orange");
        String fruit = sc.nextLine();
        switch (fruit){
            case "Mango":
            System.out.println("King of fruits");
            break;
            case "Apple":
            System.out.println("A Sweet Red Fruit");
            break;
            case "Orange":
            System.out.println("A circular fruits");
            break;
            default:
            System.out.println("Please enter a valid fruit");
        }}}