package com.example.demo;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Repo;

@Controller
public class homeController {
	
	@Autowired
	AlienRepo alienRepo;
	
	@ModelAttribute
	public void modelDate(Model m) {
		m.addAttribute("name","Aliens");
	}
	
	// home page
	@RequestMapping("/")	
	public String home() {
		return "index";
	}
	
	@GetMapping("/getAliens")
    public String listAll(Model model) {
        List<Repo> listAliens = alienRepo.findAll();
        model.addAttribute("result", listAliens);
        return "showAliens";
    }
	
	@GetMapping("/getAlien")
	    public String getAlien(@RequestParam int id, Model m ){
	         m.addAttribute("result",alienRepo.findById(id)) ;
	         return "showAliens";
	    
	}
	@GetMapping("/getAlienByName")
    public String getAlienByName(@RequestParam String name, Model m ){
         m.addAttribute("result",alienRepo.find(name)) ;
         return "showAliens";
    
}
	
	@PostMapping(path = "/addAlien")
    public @ResponseBody String addAlien(@RequestParam int id, @RequestParam String name) {
        Repo r = new Repo();
        r.setid(id);
        r.setName(name);
        alienRepo.save(r);
        return "User Created";
    }

}
