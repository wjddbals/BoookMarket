package jiho.spring.mvc.book.boookmarket.chap07;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Example02Controller {

	@PostMapping("/member")
	public String submitForm(@ModelAttribute Member member, Model model) {		
		System.out.println("@PostMapping----------------");
		System.out.println("���̵�: " + member.getId());
		System.out.println("��й�ȣ: " + member.getPasswd());
		System.out.println("������ : " + member.getCity());
		System.out.println("�� ��: " + member.getSex());
		System.out.print("�� ��: ");
		for(int i=0;i<member.getHobby().length;i++)
			System.out.print("["+ member.getHobby()[i]+ "] ");
		
		model.addAttribute("member", member);
		return "webpage07_02";
	}	
}
