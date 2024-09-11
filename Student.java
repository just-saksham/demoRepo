package myfirstproject;

public class Student{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Student [] student = new Student[5];
        for(int i = 0;i<5;i++)
        {
            student[i] = new Student();
        }
        String [] names = {"John","Mithu","Sallu","Jetha","Saku"};
        for(int i =0;i<5;i++)
        {
            student[i].setName(names[i]);
        }
        for(int i = 0;i<5;i++)
        {
            System.out.println("Student Name: "+student[i].getName());
        }


    }

}
    

