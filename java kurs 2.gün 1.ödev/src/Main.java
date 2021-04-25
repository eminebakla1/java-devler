
public class Main {

	public static void main(String[] args) {
		
    Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý",0,"2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz");
    Category category1 = new Category(1,"Programlama");
    Teacher teacher1 = new Teacher(1,"Engin Demirog");

    CourseManager courseManager = new CourseManager();
    courseManager.addToCourse(course1);

	TeacherManager teacherManager = new TeacherManager();
    teacherManager.addToTeacher(teacher1);

    CategoryManager categoryManager = new CategoryManager();
	categoryManager.addToCategory(category1);
			  
			 }

	}


