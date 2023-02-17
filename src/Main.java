public class Main {
    public static void main(String[] args) {
Java java=new Java("Torogeldi",16,'M',"@Torogeldi06");
Java java2=new Java("Erik",28,'M',"@Erikda");
Java java3=new Java("Baxa",20,'M',"@baxa02");
Java java4=new Java("Erjgit",18,'M',"@Erjigit");
Java java5=new Java("Madon",12,'W',"@Madon112");
Java java6=new Java("Malika",14,'W',"@malika07");
Java java7=new Java("Bael",18,'M',"@Bael2004");

Java [] javas={java,java2,java3,java4,java5};
Java [] javas1={java6,java7};

Android android=new Android("Mako",19, 'M',"@Makowe4");
Android android2=new Android("Sanjar",22, 'M',"@sancho20");
Android android3=new Android("Alia",16, 'W',"@aliad");
Android android4=new Android("Aizirek",17, 'W',"@llkkio");

Android []androids={android,android2,android3};
Android [] androids1={android4};

Go go=new Go("Davran",17,'M',"@davran23");
Go go2=new Go("Riant",25,'M',"@rinat253");
Go go3=new Go("Adilet",22,'M',"@adilet2001");

Go [] go1={go,go2};
Go [] gos1={go3};


Company company =new Company("Beishekeiva 15",javas,androids,go1);
Company company1=new Company("Jibek jolu 45",javas1,androids1,gos1);


        System.out.println(company);
        System.out.println(company1);
    }
}