package jiho.spring.mvc.book.boookmarket.chap07;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example01Controller {

	@GetMapping("/member")
	public String showForm(Model model) {
		Member member = new Member();
		System.out.println("@GetMapping----------------");
		System.out.println("���̵�: " + member.getId());
		System.out.println("��й�ȣ: " + member.getPasswd());
		System.out.println("������ : " + member.getCity());
		System.out.println("�� ��: " + member.getSex());
		System.out.println("�� ��: " + member.getHobby());
		model.addAttribute("member", member);
		return "webpage07_01";
	}	
}
