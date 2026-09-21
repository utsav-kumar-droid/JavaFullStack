public class Student {
    private String name;
    private int marks;



    public Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }


    public Student(){

    }
    public String setName(String name){
        return name;
    }
    public String getName() {
        return name;
    }
    public int setMarks(int marks){
        return marks;
    }
    public int getMarks(){
        return marks;
    }

    @Override
    public String toString(){
        return "Name:"+name+"\nMarks:"+marks;
    }

}
