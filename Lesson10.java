class Lesson10{
    public static void main(String[] args) {
        int age =8;

        if(age >=20){
            System.out.println("adult.");
        } else if(age >= 13) {
            System.out.println("teenager.");
        } else if(age == 0) {
            System.out.println("baby.");
        } else {
            System.out.println("child.");
        }
    }
}