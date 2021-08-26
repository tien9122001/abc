import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("s1", 1);
        Student s2 = new Student("s2", 2);
        List<Student> arr = new ArrayList<Student>();
        arr.add(s1);
        arr.add(s2);
        arr.add(new Student("s1", 3));
        arr.add(new Student("s2", 1));
        arr.add(new Student("s1", 1));
        arr.add(new Student("s5", 2));
        // Collections.sort(arr, new Comparator<Student>(){
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return o1.getId().compareTo(o2.getId());
        //     }
        // });
        Collections.sort(arr);
        // for(int i = 0; i < arr.size(); i++){
        //     System.out.println(arr.get(i).getId());
        // }
        // Iterator<Student> itr = arr.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next().getId());
        // }
        Student find = null;
        Iterator<Student> itr1 = arr.iterator();
        // while(itr1.hasNext()){
        //     Student x = itr1.next();
        //     if(x.getId().equals("s2")){
        //         itr1.remove();
        //         break;
        //     }
        // }
        // arr.forEach((p) -> {
        //     System.out.println(p.getId() + p.getAge());
        // });
        arr.sort((p1, p2) -> {
            if(p1.getId().compareTo(p2.getId()) > 0){
                return 1;
            }else if(p1.getId().compareTo(p2.getId()) < 0){
                return -1;
            }else{
                return p1.getAge()-p2.getAge();
            }
        });
        for(Student x : arr){
            System.out.println(x.getId() + x.getAge());
        }
        
        //System.out.println("----"+find.getId());
    
    }
}
