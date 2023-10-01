import java.util.*;

class July7{

    public static int firstOccourance(int []arr,int size,int element){
        int first = 0;
        for(int i=0;i<size;i++){
            if(arr[i] == element){
                first = i;
                break;
            }
        }
        return first;
    }

    public static int lastOccourance(int []arr,int element ,int size){
        int last = 0;
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                last = i;
            }
        }
        return last;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements :");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Element you want to search ");;
        int element = sc.nextInt();

        int first = firstOccourance(arr,element,size);
        int last = lastOccourance(arr,element,size);

        System.out.println("First Ocourance is :"+ first);
        System.out.println("last ocourance is :"+last);
        
        sc.close();
    }
}