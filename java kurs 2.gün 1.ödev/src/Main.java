
public class Main {

	public static void main(String[] args) {
		
    Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�",0,"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz");
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


