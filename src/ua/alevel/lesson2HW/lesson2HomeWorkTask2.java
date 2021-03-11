package ua.alevel.lesson2HW;

/**
 * Create by Lev Sehal 04.03.2021
 */
//Task
/**
 * Create a class that will display the smallest number by module
 * from the three real numbers stored in the class.
 * Use the ternary operation to calculate the modulus.
 */
public class lesson2HomeWorkTask2 {
    public static void main(String...args) {
        //numbers stored in the class
        double a = 3;
        double b = -17;
        double c = 29.85;
        //calculate the modulus of each number
        double moduleA = a>0? (a) : (-a);
        double moduleB = b>0? (b) : (-b);
        double moduleC = c>0? (c) : (-c);
        //define the smallest number by modulo
        if (moduleA<moduleB) { if(moduleA<moduleC) {
            System.out.println("the smallest number by module is" + moduleA);
        }else{
            System.out.println("the smallest number by module is" + moduleC);
        }
        }else{
            if(moduleB<moduleC) {
                System.out.println("the smallest number by module is" + moduleB);
            }else{
                System.out.println("the smallest number by module is" + moduleC);
            }
        }
    }
}
