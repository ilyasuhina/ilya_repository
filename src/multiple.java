/*СТАРЫЙ КОД
import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z = x * y;
        System.out.println(z);
    }
}
    class additional {
        public static void main(String[] args) {
            int x = 25;
            int y = 30;
            int z = x + y;
            System.out.println(z);
        }
    }
class Person {
    public static void main(String[] args) {
        String name; // = "Tom";
        String surname;
        String DoB;
        String age;
        String gender;
        String height;
        String weight;


        Scanner in = new Scanner(System.in);
        System.out.print("Iput name:");
         name = in.nextLine();

        System.out.print("Input Surname:");
       surname = in.nextLine();

        System.out.print("Input DoB:");
      DoB = in.nextLine();

        System.out.print("Input Age:");
        age = in.nextLine();

        System.out.print("Input Gender:");
       gender = in.nextLine();

        System.out.print("Input Height:");
        height = in.nextLine();

        System.out.print("Input Weight:");
        weight = in.nextLine();
        in.close();
    }
}

class Pizda{
    public static void main(String[]args){
        String a = new String();
        a = "something"; // то, что нужно перевернуть
        String b = new StringBuffer(a).reverse().toString();
System.out.println(b);
    }
}

class Telki{
    public static void main(String[]args){
        String name = new String();
        name = "Irina";
        int age = 22;
        System.out.println(age);
        System.out.println(name);
    }
}

class Human{
    public static void main(String[]args){
        String fname;
        String sname;
        String age;
        String tits;
        String ass;

        Scanner in = new Scanner(System.in);
        System.out.print("Input first name: ");
        fname = in.nextLine();

        //Scanner in = new Scanner(System.in);
        System.out.print("Input second name: ");
        sname = in.nextLine();


        //Scanner in = new Scanner(System.in);
        System.out.print("Input age: ");
        age = in.nextLine();

        //Scanner in = new Scanner(System.in);
        System.out.print("Input size of tits: ");
        tits = in.nextLine();

        //Scanner in = new Scanner(System.in);
        System.out.print("Input ass raiting: ");
        ass =in.nextLine();
        in.close();

        System.out.println();
        System.out.println();
        System.out.print("Name: ");
        System.out.print(fname);
        System.out.println();
        System.out.print("Sname: ");
        System.out.print(sname);
        System.out.println();
        System.out.print("Age: ");
        System.out.print(age);
        System.out.println();
        System.out.print("Tits: ");
        System.out.print(tits);
        System.out.println();
        System.out.print("Ass: ");
        System.out.print(ass);
        System.out.println();

    }

}
*
 */
/*import java.util.Scanner;
class Main{
    public static void main (String[]args) {
        System.out.println("Hello world sooqa");
        int x = 23;
        int e = 24;
        float y = 25.5f;
        String z = "qwerty";
        double v = 123.123;
        char w = 'A';
        System.out.println(x);
        System.out.println(y);
       System.out.println(z);
       System.out.println(v);
       System.out.println(w);

Scanner str = new Scanner(System.in);
System.out.print("Enter smth: ");
System.out.println(str.nextLine());

    }    }
*/

/*import java.util.Scanner;
class Operation{
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.print("Print x: ");
        x = num.nextInt();
        System.out.print("Print y: ");
        y = num.nextInt();
        z = x + y;
        System.out.print("Result: "+ z);
    }}
*/

/*
import java.util.Scanner;
class Additional{
    public static void main(String[]args){
        for(int i=0;i<3;i++)
        {
            Scanner num = new Scanner(System.in);
            int x;
            int y;
            int z;
            System.out.print("Write x: ");
            x = num.nextInt();
            System.out.print("Write y: ");
            y = num.nextInt();
            z = x / y;
            System.out.print("Result: "+ z );
            System.out.println();
            System.out.println("____________");
        }

    }
}

 */


/*import java.util.Arrays;
import java.util.Scanner;
class Massive{
    private static Object Arrays;

    public static void main(String[]args){
        int[] massive;
        //massive = new int[5]; // память под массив
        massive = new int[] {22,03,97};
        System.out.print(Arrays.toString(massive));
    }
}
*/

   //                Ввод количество эт-тов массива и их вывод
 /*
import java.util.Arrays;
import java.util.Scanner;
class Massive{
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int j;
        System.out.print("Write quanity: ");
        j = num.nextInt(); //  eneter J
        int[] massive;
        massive = new int[j];
        for(int i=0;i<j;i++){   // 0 to j
            System.out.print("Enter a ["+ i +"] = ");
          massive[i] = num.nextInt();

        }
    }
}
*/


//                          Ручной ввод массива из 5 элементов
/*
    class Massive3{
    public static void main(String[]args){
        Scanner number = new Scanner(System.in);
        int[] array;
        array = new int [5];

        System.out.print("Write array[0] = ");
        array[0] = number.nextInt();

        System.out.print("Write array[1] = ");
        array[1] = number.nextInt();

        System.out.print("Write array[2] = ");
        array[2] = number.nextInt();

        System.out.print("Write array[3] = ");
        array[3] = number.nextInt();

        System.out.print("Write array[4] = ");
        array[4] = number.nextInt();

        System.out.println("array = "+ "|"+ array[0] +"|"+ array[1] +"|"+ array[2] +"|"+ array[3] +"|"+ array[4]+"|");
    }
}
*/

   /*
    import java.util.Scanner;
    class Dmassive
    {
        public static void main(String[]args)
        {
            Scanner numb = new Scanner(System.in);

            int[][] array;
            array = new int[3][3];

            System.out.print("Write 1 string: ");
            array[0][0] = numb.nextInt();
            System.out.print("Write 2 string: ");
            array[1][1] = numb.nextInt();
            System.out.print("Write 3 string: ");
            array[2][2] = numb.nextInt();
            System.out.println("Massive:");
            System.out.println(array[0][0]);
            System.out.println(array[1][1]);
            System.out.println(array[2][2]);

        }
    }
    */ //
// Начинается отсчет с 0, как и по строкам, так и по столбцам

 /*  class Matrix
{
       public static void main (String[]args)
       {
           int [][] matrix = {{11,22,33},
                              {22,44,55},
                              {66,77,88}};
           System.out.println(matrix[0][1]);
           System.out.println(matrix[1][1]);
           //System.out.println(Arrays.asList(matrix));
           //for (int v : matrix)
               //System.out.println(v);
           String matrixString = Arrays.toString(matrix);
           System.out.println(matrix.String);
       }

}

  */
 /*class function{
        public static void main(String[]args)
        {
            int w = func( 3,4);
            System.out.println(w);
        }

        public static void func(int x, int y)
        {
            int z = 1;
            for (int i = 0; i<y;i++)
                z *= x;
            return z;
        }

 }
  */
/*import java.util.Scanner;
 class stepen{
     public static void main(String[]args)
     {
         Scanner numb = new Scanner(System.in);
         for(int j = 0; j < 3; j++)
         {
      int x,z,y;
      z=1;
      System.out.print("Input x = ");
      x = numb.nextInt();
      System.out.print("Input degree y = ");
      y = numb.nextInt();
            for (int i=0; i<y; i++)             //Цикл степени. В стпень подставляю Y.
            {                                  // В цикле Х умножается само на себя Y раз.
                z *= x;
            }
            System.out.print("Result = "+z);
            System.out.println();
            System.out.println("____________");
        }
     }
}

 */
/*
class Circle

 {
     public static void main(String[]args)
     {
        int x=2;
        int y=1;
        //int z;
        for (int i=0; i<5; i++)
        {
          y *=x;
        }
        System.out.print("Result = "+y);
     }
 }
 */
import java.util.Scanner;
class Function
{
    public static void main(String[]args)
    {
        int z = func(2, 2);
        System.out.print("Result = "+ z);

    }

            public static int func( int a, int b)
                {
                    Scanner  mew = new Scanner(System.in);
                    int z = 1;
                    /*
                    System.out.print("Enter a= ");
                    a = mew.nextInt();
                    System.out.print("Enter power= ");
                    b = mew.nextInt();
                     */
                    for (int i =0; i<b; i++)
                    {
                        z *=a;
                    }
                    return z;
                }

}


class Robot_try
{
    public static void main(String[]args)
    {
        Robot dog = new Robot();
        dog.height =  75.500f;
        System.out.println("Height:| " + dog.height);
        dog.weight = 20.400f;
        System.out.println("Weight:| "+ dog.weight);
        dog.name = "Sharik";
        System.out.println("Name:  | " + dog.name);
        dog.color = "Black";
        System.out.println("Color: | "+ dog.color);
        dog.arm = 0;
        System.out.println("Arm:   | "+ dog.arm);
        dog.feet = 4;
        System.out.println("Feet:  | "+ dog.feet);
    }
}
                //Главный Класс Робот, по которому создаются другие
class Robot{

    public String name ="RD-2D";
    public float weight = 100.60f;
    public float height = 200.00f;
    public float speed = 30.00f;
    public String color =" White";
    public int arm = 0;
    public int feet = 2;
    public int eye = 2;
    public int head = 1;
    public String speech = "plplplpl-pi-pi";
    private String company = "Star Wars";
}


/*class New{

    public static void main(String[]args) {

        Robot wally = new Robot();
         int weight = 10;
        System.out.print("Weight = " + weight);
    }
    constructor_cat cat1 = new constructor_cat();
    cat1.color = "white";
}

 */


class while_try

{
    public static void main(String[]args)
    {
        int apple = 1;
        while (apple <10 )
        {
            System.out.print(apple);
            apple++;
        }
        }
}

class while_try2{

    public static void main (String[]args)
    {
        int telki = 18;
        while ( telki < 28){
            System.out.println("Age: " + telki );
            telki++;

                            }
    }
}

                            //Создание конструктора

class constructor_cat
{
private String owner = "Ilya";
public String name;
public float age = 0.3f;
public String color;
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
}

class New{

    public static void main(String[]args) {

        Robot wally = new Robot();
        int weight = 10;
        System.out.println("Weight = " + weight);

    constructor_cat cat1 = new constructor_cat(); // мутки с конструктором
    cat1.color = "White";
    System.out.println("Color= " + cat1.color);
}
}

    class IT
    {
        //public static void main(String[]args)

            public String position;
            public String status;
            public float expirience;
            public String company;
            private String project;
            private float salary;
            public String ceo_name;
            public String getCeo()
        {
            return ceo_name;
        }
            public float getExpirience()
            {
                return expirience;
            }
    }


    class IT_check
    {
        public static void main(String[]args)
        {
            IT QA = new IT();
            QA.company = "NIX Solutions";
            System.out.println("Company: "+QA.company);
            QA.position = "Juniour QA";
            System.out.println("Position: " + QA.position);
            QA.expirience = 0.2f;
            System.out.println("Expirience: "+ QA.expirience);
            QA.status = "Junior";
            System.out.println("Status : "+ QA.status);

            IT ceo = new IT();
            ceo.ceo_name = "Ilya";
            System.out.println("CEO name: "+ceo.ceo_name);

            IT expirience = new IT();
            expirience.expirience = 1.5f;
            System.out.println("Experience: " +expirience.expirience);
        }
    }

    public constructor