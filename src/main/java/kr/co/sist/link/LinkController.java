package kr.co.sist.link;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinkController {
	@GetMapping("link/link_view")
	public String link(Model model) {
		LinkDTO lDTO = new LinkDTO();
		lDTO.setUrlName("구글");
		lDTO.setUrl("google.com"); // th:href="|http://${lDTO.url}|"
		
		LinkDTO lDTO2 = new LinkDTO();
		lDTO2.setUrlName("객체 값 출력");
		lDTO2.setUrl("obj/object_value"); // th:href="@{/경로/{lDTO2.url}"
		lDTO2.setName("이장훈");
		lDTO2.setAge(26);
		
		model.addAttribute("lDTO", lDTO);
		model.addAttribute("lDTO2", lDTO2);
		
		model.addAttribute("daum", "daum.net");
		model.addAttribute("google", "google.com");
		
		return "link/link_view";
	}
}
