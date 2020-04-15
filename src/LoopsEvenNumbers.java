/*
This program lists all the even numbers from 1 to 20
 */
public class LoopsEvenNumbers {
    public static void main(String[] args) {

        System.out.println("Here is list of even numbers from 1 to 20: ");
        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
