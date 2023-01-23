// import java.util.Scanner;
// import java.time.LocalTime;


// public class jv1 {
//     public static void main(String[] args) {
//         LocalTime time = LocalTime.now();
//         System.out.print("Введите ваше имя: ");
//         Scanner iscan = new Scanner(System.in);
//         String name = iscan.nextLine();
//         int hour = time.getHour();
//         // System.out.println(hour);
//             if (hour >=5 && hour<=12) {
//                 System.out.printf("Доброе утро, %s", name);
//             }
//             else if (hour > 12 && hour<=18) {
//                 System.out.printf("Добрый день, %s", name);
//             }
//             else if (hour > 18 && hour<=23) {
//                 System.out.printf("Добрый вечер, %s", name);
//             }
//             else if (hour >= 0  && hour< 5) {
//                 System.out.printf("Доброй ночи, %s", name);
//             }
//         //System.out.printf("Привет, %s", name);
//         // System.out.print(name);

//     }
// }

public class jv1 {
    public static void main(String[] args) {
        int[] array = new int[] {1,0,1,1,1,1,0,0,0,1,1,1,1,1,0};
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            
            if (array[i]==1) {
                count2++;
            }
            if (array[i]==0){
                if (count2>count){
                    count = count2;
                    count2 = 0;
                } else {
                    count2 = 0;
                }
            }
        }
        System.out.println(count);

    }
}

