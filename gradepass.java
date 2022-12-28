import java.util.Scanner;
public class gradepass {
    public static void main(String[] args) {

        int math;
        int turk;
        int phys;
        int chem;
        int music;
        int allGrade = 0; //0-100 arasındaki ders notlarını tutması için atadığım değer.
        int allLesson = 0; //0-100 değerleri girilmiş dersleri tutması için atadığım değer.
        // ikisinede 0 atadım çünkü hata vermemesi için bir başlangıç noktaları olması gerekir.
        //eğer değer atanmazsa ve hiç sayı girilmezse hata verir, bu şekilde 0 olduğunu yazacaktır.


        Scanner input= new Scanner(System.in);

        System.out.print("Math Grade : ");
        math=input.nextInt();
        if (math < 0 || math > 100){
            System.out.println("Please enter a number between 0 and 100.");
        }else {
            allLesson +=math; // + eklememin sebebi yukarıda atadığım 0 değerinin üstüne ekle demek.
            allGrade +=1; // aynı şekilde değerin üstüne ekleyerek ilerleyecek.
        }


        System.out.print("Chemistry Grade : ");
        chem=input.nextInt();
        if(chem < 0 || chem > 100){
            System.out.println("Please enter a number between 0 and 100.");
        }else {
            allLesson += chem;
            allGrade += 1;
        }


        System.out.print("Physics Grade : ");
        phys=input.nextInt();
        if (phys < 0 || phys > 100){
            System.out.println("Please enter a number between 0 and 100.");
        }else{
            allLesson +=phys;
            allGrade +=1;
        }



        System.out.print("Turkish Grade : ");
        turk= input.nextInt();
        if(turk < 0 || turk > 100){
            System.out.println("Please enter a number between 0 and 100.");
        }else{
            allLesson +=turk;
            allGrade +=1;
        }


        System.out.print("Music Grade : ");
        music=input.nextInt();
        if (music < 0 || music > 100){
            System.out.println("Please enter a number between 0 and 100");
        }else{
            allLesson +=music;
            allGrade +=1;
        }


        double avarage = allLesson/allGrade; // burada şarta uyan ders sayıları ve notların toplamını birbirine bölüyor.
        System.out.println("Your Avarage : " + avarage);

        if(avarage<=55){
            System.out.println("Sorry, you didn't pass the class.");

        } else {
            System.out.println("Congratulations You've Passed The Class.");
        }





    }
}
