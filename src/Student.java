public class Student implements Comparable<Student>{
    private String id;

    public Student(){

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Student(String id){
        this.setId(id);
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
        return this.id.compareTo(o.getId());
    }
}
