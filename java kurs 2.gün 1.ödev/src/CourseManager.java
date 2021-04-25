
public class CourseManager {
	
	public void addToCourse(Course course){
    if(course.price == 0){
    System.out.println("Ücretsiz Kurs Eklendi: "+course.name);
    }
    else{
    System.out.println("Kurs Eklendi: "+course.name);
    }
    }
    public void removeToCourse(Teacher teacher){
    System.out.println("Öðretmen Silindi: "+teacher.name);
		 
    }
}
