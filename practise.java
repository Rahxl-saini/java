// import java.util.Scanner;
// public class practise {
//     public static void main(String[] args){
//         int arr[] = {2, 7, 11, 15};
//         int target = 13;

//         boolean found = false;

//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i] + arr[j] == target){
//                     System.out.println("pairs exists : " + arr[i] + " + " + arr[j]);
//                     found = true;
//                 }
//             }
//         }
//         if(!found){
//             System.out.println("pairs doesnot exists");
//         }
//     }
// }



import java.util.Scanner;
public class practise {
    public static void main(String[] args){
        int arr[] = {2, 7, 11, 15};
        int target = 13;

        boolean found = false;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("pairs exist: " + arr[i] + " + " + arr[j]);
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("pairs not exist");
        }
    }
}