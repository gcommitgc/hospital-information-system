package data;

import java.util.ArrayList;
import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Office waike=new Office("外科");
//		Office neike=new Office("内科");
//		Office erke=new Office("儿科");
//		Office fuke=new Office("妇科");
//		Office yanke=new Office("眼科");
//		ArrayList<Doctor> doctors1=new ArrayList<>();
//		ArrayList<Doctor> doctors2=new ArrayList<>();
//		ArrayList<Doctor> doctors3=new ArrayList<>();
//		ArrayList<Doctor> doctors4=new ArrayList<>();
//		ArrayList<Doctor> doctors5=new ArrayList<>();
//		ArrayList<Office> offices=new ArrayList<>();
//		Doctor d1=new Doctor("高先生",fuke,true);
//		Doctor d2=new Doctor("王师傅",fuke,false);
//		Doctor d3=new Doctor("李大师",fuke,false);
//		doctors1.add(d1);
//		doctors1.add(d2);
//		doctors1.add(d3);
//		fuke.setDoctors(doctors1);
//		offices.add(fuke);
//		d1=new Doctor("卢本伟",waike,true);
//		d2=new Doctor("马飞飞",waike,false);
//		d3=new Doctor("一个朋友",waike,false);
//		doctors2.add(d1);
//		doctors2.add(d2);
//		doctors2.add(d3);
//		waike.setDoctors(doctors2);
//		offices.add(waike);
//		d1=new Doctor("谢拉",neike,true);
//		d2=new Doctor("马自立",neike,false);
//		d3=new Doctor("阿夸",neike,false);
//		doctors3.add(d1);
//		doctors3.add(d2);
//		doctors3.add(d3);
//		neike.setDoctors(doctors3);
//		offices.add(neike);
//		d1=new Doctor("憨色",erke,true);
//		d2=new Doctor("冷鸟",erke,false);
//		d3=new Doctor("小缘",erke,false);
//		doctors4.add(d1);
//		doctors4.add(d2);
//		doctors4.add(d3);
//		erke.setDoctors(doctors4);
//		offices.add(erke);
//		d1=new Doctor("马库斯",yanke,true);
//		d2=new Doctor("康纳",yanke,false);
//		d3=new Doctor("卡拉",yanke,false);
//		doctors5.add(d1);
//		doctors5.add(d2);
//		doctors5.add(d3);
//		yanke.setDoctors(doctors5);
//		offices.add(yanke);
////		SaveUtil.save(doctors,"c:/documents/doctordata.txt");
//		SaveUtil.save(offices,"c:/documents/officedata.txt");
//		@SuppressWarnings("unchecked")
////		ArrayList<Office> officess=(ArrayList<Office>)ReadUtil.read("c:/documents/officedata.txt");
////		System.out.println(officess.get(3).getDoctors().get(0).getName());
//		HashMap<String,String> accountAndPassword=new HashMap<>();
//		HashMap<String,String> accountAndUser=new HashMap<>();
//		accountAndPassword.put("admin", "admin");
//		accountAndPassword.put("cashier", "cashier");
//		accountAndPassword.put("pharmacy", "pharmacy");
//		accountAndPassword.put("register", "register");
//		accountAndPassword.put("gao", "gao");
//		accountAndPassword.put("wang", "wang");
//		accountAndPassword.put("li", "li");
//		accountAndPassword.put("lu", "lu");
//		accountAndPassword.put("fei", "fei");
//		accountAndPassword.put("pengyou", "pengyou");
//		accountAndPassword.put("xie", "xie");
//		accountAndPassword.put("ma", "ma");
//		accountAndPassword.put("akua", "akua");
//		accountAndPassword.put("hanser", "hanser");
//		accountAndPassword.put("yousa", "yousa");
//		accountAndPassword.put("yuan", "yuan");
//		accountAndPassword.put("makusi", "makusi");
//		accountAndPassword.put("kana", "kana");
//		accountAndPassword.put("kora", "kora");
//		accountAndUser.put("admin","管理员");
//		accountAndUser.put("cashier","收银员");
//		accountAndUser.put("pharmacy","药房");
//		accountAndUser.put("register","挂号员");
//		accountAndUser.put("gao","高先生");
//		accountAndUser.put("wang","王师傅");
//		accountAndUser.put("li","李大师");
//		accountAndUser.put("lu","卢本伟");
//		accountAndUser.put("fei","马飞飞");
//		accountAndUser.put("pengyou","一个朋友");
//		accountAndUser.put("xie","谢拉");
//		accountAndUser.put("ma","马自立");
//		accountAndUser.put("akua","阿夸");
//		accountAndUser.put("hanser","憨色");
//		accountAndUser.put("yousa","冷鸟");
//		accountAndUser.put("yuan","小缘");
//		accountAndUser.put("makusi","马库斯");
//		accountAndUser.put("kana","康纳");
//		accountAndUser.put("kora","卡拉");
//		SaveUtil.save(accountAndPassword,"c:/documents/account.txt");
//		SaveUtil.save(accountAndUser,"c:/documents/user.txt");
		OfficeDataBase officeDataBase=OfficeDataBase.getInstance();
		Account account=Account.getInstance();
		System.out.println(OfficeDataBase.getOffices().get(3).getDoctors().get(0).getName());
		System.out.println(account.getAccountAndPassword().get("hanser"));
//		@SuppressWarnings("unchecked")
//		ArrayList<Doctor> doctorss=(ArrayList<Doctor>)ReadUtil.read("c:/documents/doctordata.txt");
//		System.out.println(doctorss.get(0).getName()+doctorss.get(1).getName()+doctorss.get(0).getOffice());
	}

}
