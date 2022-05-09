import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.LongAccumulator;

public class RandomNumber {
	public static void main(String[] args) {
		// Department
		Department department1 = new Department();
		department1.departmentId = 1;
		department1.departmentName = "Marketing";
		
		Department department2 = new Department();
		department2.departmentId = 2;
		department2.departmentName = "Sale";

		Department department3 = new Department();
		department3.departmentId = 3;
		department3.departmentName = "Báº£o vá»‡";

		Department department4 = new Department();
		department4.departmentId = 4;
		department4.departmentName = "NhÃ¢n sá»±";

		Department department5 = new Department();
		department5.departmentId = 5;
		department5.departmentName = "No person";
		
		// Position
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = positionName.DEV;
		
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = positionName.TEST;
		
		Position position3 = new Position();
		position3.positionId = 3;
		position3.positionName = positionName.SCRUM_MASTER;
		
		Position position4 = new Position();
		position4.positionId = 4;
		position4.positionName = positionName.PM;
		
		// Account
		Account account1 = new Account();
		account1.accountId = 1;
		account1.email = "khanh1@gmail.com";
		account1.userName = "khanh1";
		account1.fullName = "nguyen khanh 1";
		account1.departmentID = department1;
		account1.positionID = position1;
		
		account1.createDate = new Date("2022/12/03");

		Account account2 = new Account();
		account2.accountId = 2;
		account2.email = "khanh2@gmail.com";
		account2.userName = "khanh2";
		account2.fullName = "nguyen khanh 2";
		account2.departmentID = department2;
		account2.positionID = position2;
		account2.createDate = new Date("2022/12/04");

		Account account3 = new Account();
		account3.accountId = 3;
		account3.email = "khanh3@gmail.com";
		account3.userName = "khanh3";
		account3.fullName = "nguyen khanh 3";
		account3.departmentID = department3;
		account3.positionID = position3;
		account3.createDate = new Date("2022/12/05");
		
		Account account4 = new Account();
		account4.accountId = 4;
		account4.email = "khanh4@gmail.com";
		account4.userName = "khanh4";
		account4.fullName = "nguyen khanh 4";
		account4.departmentID = department4;
		account4.positionID = position4;
		account4.createDate = new Date("2022/12/03");
		
		Account account5 = new Account();
		account5.accountId = 5;
		account5.email = "khanh5@gmail.com";
		account5.userName = "khanh5";
		account5.fullName = "nguyen khanh 5";
		account5.departmentID = department5;
		account5.positionID = position1;
		account5.createDate = new Date("2022/12/04");
		
		// Group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "java";
		group1.creatorID =account1;
		group1.createDate = new Date("2022/05/06");
		
		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "c#";
		group2.creatorID = account2;
		group2.createDate = new Date("2022/05/07");

		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "c#";
		group3.creatorID = account3;
		group3.createDate = new Date("2022/05/08");
		
		//Account -group
		Group [] group1s = {group1,group3};
		account1.groups = group1s;
		
		Group [] group2s = {group1,group2,group3};
		account1.groups = group2s;
		
		Group [] group3s = {group1};
		account1.groups = group3s;
		
		Group [] group4s = {group3};
		account1.groups = group4s;
		
		Group [] group5s = {group2,group3};
		account1.groups = group5s;
		
		//groupAccount
		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.group_ID = group1;
		Account [] groupAccount1s = {account1,account3,account4};
		groupAccount1.accountIDs = groupAccount1s;
		groupAccount1.joinDates = new Date("2022/05/08");
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.group_ID = group2;
		Account [] groupAccount2s = {account2,account3,account4};
		groupAccount2.accountIDs = groupAccount2s;
		groupAccount2.joinDates = new Date("2022/05/09");
		
		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.group_ID = group3;
		Account [] groupAccount3s = {account1,account4,account5};
		groupAccount3.accountIDs = groupAccount3s;
		groupAccount3.joinDates = new Date("2022/05/05");
		
		// TypeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 1;
		typeQuestion1.typeName = TypeName.ESSAY;
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2;
		typeQuestion2.typeName = TypeName.MULTIPLE_CHOICE;
		
		// CategoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 1;
		categoryQuestion1.categoryName = "Java";
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2;
		categoryQuestion2.categoryName = "NET";
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryId = 3;
		categoryQuestion3.categoryName = "SQL";
		
		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.categoryId = 4;
		categoryQuestion4.categoryName = "Postman";
		
		CategoryQuestion categoryQuestion5 = new CategoryQuestion();
		categoryQuestion5.categoryId = 5;
		categoryQuestion5.categoryName = "Ruby";
		
		// Question
		
		Question question1 = new Question();
		question1.questionId = 1;
		question1.content = "Cau truc MySQL";
		question1.category_ID = categoryQuestion1;
		question1.type_ID = typeQuestion2;
		question1.creator_ID = account2;
		question1.createDate = new Date("2022/1/2");
		
		Question question2 = new Question();
		question2.questionId = 2;
		question2.content = "cac loai datatype";
		question2.category_ID = categoryQuestion2;
		question2.type_ID = typeQuestion2;
		question2.creator_ID = account1;
		question2.createDate = new Date("2022/1/3");
		
		Question question3 = new Question();
		question3.questionId = 3;
		question3.content = "toan tu like";
		question3.category_ID = categoryQuestion4;
		question3.type_ID = typeQuestion1;
		question3.creator_ID = account5;
		question3.createDate = new Date("2022/2/2");
		
		Question question4 = new Question();
		question4.questionId = 4;
		question4.content = "so sanh tinyint vs int";
		question4.category_ID = categoryQuestion5;
		question4.type_ID = typeQuestion1;
		question4.creator_ID = account3;
		question4.createDate = new Date("2022/5/2");
		
		// Answer
		
		Answer answer1 = new Answer();
		answer1.answerId = 1;
		answer1.content = "ngon ngu truy van co cau truc";
		answer1.question_ID = question2;
		answer1.isCorrect = true;
		
		Answer answer2 = new Answer();
		answer2.answerId = 2;
		answer2.content = "hoc Java";
		answer2.question_ID = question1;
		answer2.isCorrect = false;
		
		Answer answer3 = new Answer();
		answer3.answerId = 3;
		answer3.content = "store proceduce";
		answer3.question_ID = question3;
		answer3.isCorrect = false;
		
		Answer answer4 = new Answer();
		answer4.answerId = 4;
		answer4.content = "method trong Java";
		answer4.question_ID = question4;
		answer4.isCorrect = true;
		
		// Exam
		
		Exam exam1 = new Exam();
		exam1.examId = 1;
		exam1.code = 1;
		exam1.title = "xa hoi";
		exam1.category_ID = categoryQuestion1;
		exam1.duration = LocalTime.of(0, 50, 30, 0);
		exam1.creator_Id = account1;
		exam1.createDate = new Date("2022/01/01");
		
		Exam exam2 = new Exam();
		exam2.examId = 2;
		exam2.code = 2;
		exam2.title = "tu nhien";
		exam2.category_ID = categoryQuestion2;
		exam2.duration =LocalTime.of(0, 45, 30, 0);;
		exam2.creator_Id = account2;
		exam2.createDate = new Date("2022/01/02");
		
		Exam exam3 = new Exam();
		exam3.examId = 3;
		exam3.code = 3;
		exam3.title = "lich su";
		exam3.category_ID = categoryQuestion3;
		exam3.duration =LocalTime.of(0, 55, 30, 0);;
		exam3.creator_Id = account4;
		exam3.createDate = new Date("2022/01/03");
		
		// ExamQuestion
		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.exam_ID = exam1;
		Question [] questionId1s = {question1,question3,question4};
		examQuestion1.questionIDs = questionId1s;
		
		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.exam_ID = exam2;
		Question [] questionId2s = {question2,question3,question4};
		examQuestion1.questionIDs = questionId2s;
		
		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.exam_ID = exam3;
		Question [] questionId3s = {question1,question2};
		examQuestion3.questionIDs = questionId3s;
		
		/* Question 1:
			In ngẫu nhiên ra 1 số nguyên */
//		Random random = new Random();
//		int a = random.nextInt();
//		System.out.println("so nguyen ngau nhien: " + a);
		
		
		
		/* Question 2:
			In ngẫu nhiên ra 1 số thực */
//		Random random = new Random();
//		float b = random.nextFloat();
//		System.out.println("so nguyen ngau nhien: " + b);
		
		/* Question 3:
			Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó 
			in ngẫu nhiên ra tên của 1 bạn */
//		String [] tensvs = {"A","B","C"};
//		Random random = new Random();
//		int c = random.nextInt(tensvs.length);
//		System.out.println("ten sv ngau nhien: " + tensvs[c])
		/* Question 4:
			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới 
			ngày 20-12-1995 */
		
//		Random random = new Random();
//		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
//		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
//		long randomInt = minDay + random.nextInt(maxDay - minDay);
//		LocalDate randomday = LocalDate.ofEpochDay(randomInt);
//				System.out.println(randomday);
		
		/* Question 5:
			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây */
//		Random random = new Random();
//		int now = (int) LocalDate.now().toEpochDay();
//		int namtruoc = now - random.nextInt(366);
//		LocalDate randomday = LocalDate.ofEpochDay(namtruoc);
//				System.out.println(randomday);
		
		/* Question 6:
			Lấy ngẫu nhiên 1 ngày trong quá khứ */
//		Random random = new Random();
//		int maxDay = (int) LocalDate.now().toEpochDay();
//		long randomInt = random.nextInt(maxDay);
//		LocalDate randomday = LocalDate.ofEpochDay(randomInt);
//				System.out.println(randomday);
		
		/* Question 7:
			Lấy ngẫu nhiên 1 số có 3 chữ số */
//		Random random = new Random();
//		int a = random.nextInt(900) +100 ;
//		System.out.println("so nguyen ngau nhien: " + a);
		
		}
}
