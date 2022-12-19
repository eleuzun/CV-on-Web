package cv.onweb.ro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CVController {

	
	@GetMapping("/welcome")
	public String welcome(@RequestParam(value ="message", defaultValue ="Create your CV online", required= true)String name, Model model) {
		model.addAttribute("message", "CV");
		return "Welcome";
	}
	@GetMapping("/style")
	public String style() {
		return "add-css-js-cv";
	}
	
	
	@GetMapping("/new-cv/personal-info")
	public String bootstrap(){
		return "add.bootstrap";
	}

	@GetMapping("/education")
	public String education() {
		return "add-education";
	}
	
	@GetMapping("/workexperience")
	public String workExperience() {
		return "work-experience";
	}
	
	@GetMapping("/skills")
	public String skills() {
		return "add-skills";
		
	}
	
	@GetMapping("/references")
	public String references () {
		return "add-references";
	}
}

