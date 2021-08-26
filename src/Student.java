public class Student implements Comparable<Student>{
    private String id;
    private int age;
    public Student(){

    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Student(String id, int age){
        this.setId(id);
        this.setAge(age);
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student a = (Student)obj;
            return a.getId().equals(this.id);
        }else{
            return false;
        }
    }
    @Override
    public int compareTo(Student o) {
        //return this.id.compareTo(o.getId());
        if(this.getAge() > o.getAge()){
            return 5;
        }else if(this.getAge() < o.getAge()){
            return -5;
        }else {
            return 0;
        }
    }
}
