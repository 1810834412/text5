package text5;

public class Student {
    String name;
    int Id;
    String sex;
    String Class;
    int age;
    Student(String name,int Id,String sex,String Class, int age){
        this.name=name;
        this.Id=Id;
        this.sex=sex;
        this.Class=Class;
        this.age=age;
    }
    public String toString(){
        return "姓名为："+name+"  "+"学号为："+Id+"  "+"性别为："+sex+"  "+"班级为："+Class+"  "+"年龄为："+age+"\n";
    }
}
