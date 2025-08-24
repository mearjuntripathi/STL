public class TestMyArrayList{
    public static void main(String[] args) {
        MyArrayList<String> students = new MyArrayList<>();

        students.add("Shyam");
        students.add("Rohan");
        students.add("Jyoti");
        students.add("Abhisha");
        students.add("Abhisha");


        for(int i = 0 ; i < students.size() ; i++){
            System.out.println(students.get(i));
        }
        System.out.println(students.capacity());
        students.remove(2);
        System.out.println(students.capacity());
        System.out.println(students.size());
        for(int i = 0 ; i < students.size() ; i++){
            System.out.println(students.get(i));
        }
    }
}