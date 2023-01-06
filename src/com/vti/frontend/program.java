package com.vti.frontend;

import java.time.LocalDate;

import com.vti.enity.Account;
import com.vti.enity.Answer;
import com.vti.enity.CategoryQuestion;
import com.vti.enity.Deparment;
import com.vti.enity.Exam;
import com.vti.enity.ExamQuestion;
import com.vti.enity.Group;
import com.vti.enity.Groupaccount;
import com.vti.enity.Question;
import com.vti.enity.TypeQuestion;
import com.vti.enity.TypeQuestion.TypeName;
import com.vti.enity.position;
import com.vti.enity.position.positionNAME;

public class program {

	public static void main(String[] args) {
		// make deparment
		Deparment dep1 = new Deparment();
		dep1.id = 1;
		dep1.name = "sale";
		System.out.println("thông tin phòng ban số 1: ");
		System.out.println("ID: " + dep1.id);
		System.out.println("name: " + dep1.name);

		Deparment dep2 = new Deparment();
		dep2.id = 2;
		dep2.name = "mkt";
		System.out.println("thông tin phòng ban số 2: ");
		System.out.println("ID: " + dep2.id);
		System.out.println("name: " + dep2.name);

		Deparment dep3 = new Deparment();
		dep3.id = 3;
		dep3.name = "ke toan";

		// make position
		position pos1 = new position();
		pos1.id = 1;
		pos1.name = positionNAME.dev;

		position pos2 = new position();
		pos2.id = 2;
		pos2.name = positionNAME.scrum_master;

		position pos3 = new position();
		pos3.id = 3;
		pos3.name = positionNAME.test;
		System.out.println("lay ra vi tri:");
		System.out.println("id: " + pos1.id + " PositionName: " + pos1.name);

		// make Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "nguyedanhcat1";
		acc1.username = "nguyen danh cat";
		acc1.fullname = "cat danh nguyen";
		acc1.deparment = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();
		System.out.println("nguoitao: " + acc1.position.id);

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "nguyedanhcat2";
		acc2.username = "nguyen danh cat2";
		acc2.fullname = "cat danh nguyen2";
		acc2.deparment = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.now();

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "nguyedanhcat3";
		acc3.username = "nguyen danh cat3";
		acc3.fullname = "cat danh nguyen3";
		acc3.deparment = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.of(2021, 12, 20);
		System.out.println("lay ra account:");
		System.out.println("AccountID: " + acc2.id + " email: " + acc2.email + " UseName: " + acc2.username
				+ " FullName: " + acc2.fullname + " DeparmentID: " + acc2.deparment.id + " PositionID: "
				+ acc2.position.id + " CreateDate: " + acc2.createDate);

		// make group
		Group g1 = new Group();
		g1.id = 1;
		g1.Groupname = "cungcogang";
		g1.Creatorid = acc1;
		g1.creatDate = LocalDate.now();
		System.out.println("nguoi tao: " + g1.creatDate);

		Group g2 = new Group();
		g2.id = 2;
		g2.Groupname = "soccer";
		g2.Creatorid = acc2;
		g2.creatDate = LocalDate.now();

		Group g3 = new Group();
		g3.id = 1;
		g3.Groupname = "mentor";
		g3.Creatorid = acc3;
		g3.creatDate = LocalDate.now();
		System.out.println("lay ra group: ");
		System.out.println("id: " + g1.id + " GroupName: " + g1.Groupname + " CreatorID: " + g1.Creatorid
				+ " CreateDate: " + g1.creatDate);
		// gan account vao group
		Account[] group1account = new Account[2];
		group1account[0] = acc1;
		group1account[1] = acc3;
		g1.accounts = group1account;
		System.out.println("group 1 co cac account tham gia: ");
		System.out.println("ID: " + g1.id);
		System.out.println("account: " + g1.accounts[0].id);
		System.out.println("account: " + g1.accounts[1].id);

		// gán group vào account
		Group[] accountGroups = new Group[2];
		accountGroups[0] = g1;
		accountGroups[1] = g3;
		acc1.groups = accountGroups;

		Group[] account1Groups = new Group[2];
		accountGroups[0] = g1;
		accountGroups[1] = g2;
		acc2.groups = account1Groups;
		System.out.println("in ra group account tham gia: ");
		System.out.println(acc1.groups[0].id);
		System.out.println(acc1.groups[1].id);

		// make groupaccount
		Groupaccount ga1 = new Groupaccount();
		ga1.Groupid = g1;
		ga1.Accountid = acc1;
		ga1.JoinDate = LocalDate.now();

		Groupaccount ga2 = new Groupaccount();
		ga2.Groupid = g2;
		ga2.Accountid = acc2;
		ga2.JoinDate = LocalDate.now();

		Groupaccount ga3 = new Groupaccount();
		ga3.Groupid = g3;
		ga3.Accountid = acc3;
		ga3.JoinDate = LocalDate.now();
		System.out.println("day la groupaccont:");
		System.out.println(
				"Groupid: " + ga1.Groupid.id + " Accountid: " + ga1.Accountid.id + " ngay tham gia: " + ga1.JoinDate);

		// make TypeQuestion
		TypeQuestion tq1 = new TypeQuestion();
		tq1.typeID = 1;
		tq1.TypeName = TypeName.Essay;

		TypeQuestion tq2 = new TypeQuestion();
		tq2.typeID = 2;
		tq2.TypeName = TypeName.Multiple_choice;

		TypeQuestion tq3 = new TypeQuestion();
		tq3.typeID = 3;
		tq3.TypeName = TypeName.Essay;
		System.out.println("lay ra kieu typequestion: ");
		System.out.println("id: " + tq1.typeID + " TypeName: " + tq3.TypeName);

		// make CategoryQuestion
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.id = 1;
		cq1.name = "Java";

		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.id = 2;
		cq2.name = "NET";

		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.id = 3;
		cq3.name = "SQL";
		System.out.println("kieu cau hoi: ");
		System.out.println("id: " + cq1.id + " name: " + cq1.name);

		// make question
		Question q1 = new Question();
		q1.id = 1;
		q1.content = "cau hoi ve java";
		q1.Categoryid = cq1;
		q1.TypeID = tq1;
		q1.CreatorID = acc1;
		q1.createDate = LocalDate.now();

		Question q2 = new Question();
		q2.id = 2;
		q2.content = "cau hoi ve java";
		q2.Categoryid = cq2;
		q2.TypeID = tq2;
		q2.CreatorID = acc2;
		q2.createDate = LocalDate.now();

		Question q3 = new Question();
		q3.id = 1;
		q3.content = "cau hoi ve java";
		q3.Categoryid = cq3;
		q3.TypeID = tq3;
		q3.CreatorID = acc3;
		q3.createDate = LocalDate.now();
		System.out.println("thông tin câu hỏi: ");
		System.out.println("id: " + q1.id + " content: " + q1.content + " CategoryID: " + q1.Categoryid.id + " TypeID: "
				+ q1.TypeID.typeID + " CreatorID: " + q1.CreatorID.id + " CreateDate: " + q1.createDate);

		// make answer
		Answer a1 = new Answer();
		a1.id = 1;
		a1.content = "cau tra loi java";
		a1.QuestionID = q1;
		a1.isCorrect = true;

		Answer a2 = new Answer();
		a2.id = 2;
		a2.content = "cau tra loi c";
		a2.QuestionID = q2;
		a2.isCorrect = true;

		Answer a3 = new Answer();
		a3.id = 3;
		a3.content = "cau tra loi html";
		a3.QuestionID = q3;
		a3.isCorrect = false;
		System.out.println("cau tra loi la: ");
		System.out.println("id: " + a1.id + " noi dung: " + a1.content + " QuestionID: " + a1.QuestionID.id
				+ " isCorrect: " + a1.isCorrect);

		// make exam
		Exam e1 = new Exam();
		e1.ExamID = 1;
		e1.Code = 123;
		e1.Title = "thi hoc ki";
		e1.CategoryID = cq1;
		e1.duration = 90;
		e1.CreatorID = acc1;
		e1.createDate = LocalDate.now();

		Exam e2 = new Exam();
		e2.ExamID = 2;
		e2.Code = 223;
		e2.Title = "thi cuoi ki";
		e2.CategoryID = cq2;
		e2.duration = 45;
		e2.CreatorID = acc2;
		e2.createDate = LocalDate.now();

		Exam e3 = new Exam();
		e3.ExamID = 3;
		e3.Code = 123;
		e3.Title = "thi hoc ki";
		e3.CategoryID = cq3;
		e3.duration = 90;
		e3.CreatorID = acc3;
		e3.createDate = LocalDate.now();
		System.out.println(" lay ra exam: ");
		System.out.println("ExamID: " + e1.ExamID + " code: " + e1.Code + " Title: " + e1.Title + " CategoryID: "
				+ e1.CategoryID.id + " Duration: " + e1.duration + " CreatorID: " + e1.CreatorID.id + " CreateDate: "
				+ e1.createDate);

		// make Examquestion
		ExamQuestion eq1 = new ExamQuestion();
		eq1.ExamID = e1;
		eq1.QuestionID = q2;

		ExamQuestion eq2 = new ExamQuestion();
		eq2.ExamID = e1;
		eq2.QuestionID = q3;

		ExamQuestion eq3 = new ExamQuestion();
		eq3.ExamID = e2;
		eq3.QuestionID = q1;
		System.out.println("lay ra Examquestion: ");
		System.out.println("ExamID: " + eq1.ExamID.ExamID + " QuestionID: " + eq1.QuestionID.id);
	}

}
