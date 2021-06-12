import java.util.*;

class diamondStarPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows in Odd value:");
        int rows = sc.nextInt();
        int mid = rows/2 + 1;
        int current_row = 1;
        int first_star = mid;
        int second_star = mid;


        while(current_row <= mid){
            int col = 1;
            while(col <= rows){
                if(col == first_star || col == second_star){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                col++;

            }
           System.out.println();
           first_star--;
           second_star++;
           current_row++;
        }

        first_star+=2;
        second_star-=2;
        while(current_row <= rows){
            int col = 1;
            while(col <= rows){
                if(col == first_star || col == second_star){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            first_star++;
            second_star--;
            current_row++;
        }
    }
}