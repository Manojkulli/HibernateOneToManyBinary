package com.ty.BinaryOne2many.control;

import java.util.ArrayList;
import java.util.List;

import com.ty.BinaryOne2many.dao.Phonedao;
import com.ty.BinaryOne2many.dto.Phone;
import com.ty.BinaryOne2many.dto.Sim;

public class PersonMain {

	public static void main(String[] args) {
		Phone phone=new Phone();
		Sim sim1=new Sim();
		sim1.setName("Jio");
		sim1.setSimno(4543131);
		sim1.setPhone(phone);
		
		Sim sim2=new Sim();
		sim2.setName("Airtel");
		sim2.setSimno(879855);
		sim2.setPhone(phone);
		
		List<Sim> sim=new ArrayList<Sim>();
		sim.add(sim1);
		sim.add(sim2);
		
		
		phone.setName("vivo");
		phone.setPhone(565555);
		phone.setSim(sim);
		
		Phonedao dao=new Phonedao();
		dao.savePhone(phone);
		
	}
}
