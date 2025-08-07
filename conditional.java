// public class conditional {

//     public static void main(String[] args) {
        
//         int temp = 23;

//         if (temp >= 38) {

//             System.out.println("Hot");

//         }

//         else if (temp >= 28 && temp < 38) {

//             System.out.println("Warm");

//         }

//         else if (temp >= 15 && temp < 28) {

//             System.out.println("Normal");

//         }

//         else {

//             System.out.println("Cold");

//         }

//     }
    
// }

// public class conditional {

//     public static void main(String[] args) {

//         int day = 6;

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;

//             case 2:
//                 System.out.println("Tuesday");
//                 break;

//             case 3:
//                 System.out.println("Wednesday");
//                 break;

//             case 4:
//                 System.out.println("Thursday");
//                 break;

//             case 5:
//                 System.out.println("Friday");
//                 break;

//             case 6:
//                 System.out.println("Saturday");
//                 break;

//             case 7:
//                 System.out.println("Sunday");
//                 break;

//             default:
//                 throw new AssertionError();
//         }

//     }

// }


public class conditional {

    boolean isLeapYear(int year) {

        if(year % 400 == 0){

            return true;
        }

        if (year % 100 == 0) {
            
            return false;
        }

        if (year % 4 == 0) {

            return true;
        }

        else {
            return false;
        }

    }


    public static void main(String[] args) {
        
        int year = 1800;

        conditional obj = new conditional();

        if(obj.isLeapYear(year)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

}
