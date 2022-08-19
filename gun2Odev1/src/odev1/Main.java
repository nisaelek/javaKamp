package odev1;

public class Main {
	public static void main(String[] args) {
Lessons lesson1 =new Lessons(1,"Java Yazılım Kampı",70,"Engin Demiroğ");
Lessons lesson2 =new Lessons(2,"Pyhton Yazılım Kampı",70,"Atıl Samancıoğlu");
Lessons lesson3 =new Lessons(2,"C# Yazılım Kampı",70,"Murat Yücedağ");
Lessons[] lessons = {lesson1,lesson2,lesson3};

Category category1=new Category(1,"Kurslarım");
Category category2=new Category(2,"Tüm Kurslar");
Category category3=new Category(3,"Kursa Hazırlık");
Category category4=new Category(4,"Sıkça Sorulan Sorular");
Category[] categories= {category1,category2,category3,category4};

LessonManager lManager= new LessonManager();

for(Lessons lesson:lessons){
   
	System.out.println(lesson.lessonName);

    lManager.addToRegister(lesson);
   
}

for(Category category:categories){
	   
	System.out.println(category.categoryName);

  
   
}
}
}
