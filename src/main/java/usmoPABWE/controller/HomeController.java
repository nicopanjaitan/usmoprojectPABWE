/*
 	Nama File	: HomeController.java
 	NIM			: 11S16041
 	Kelas		: 13 TI 2
*/

package usmoPABWE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	
	public String home() {
		return "home";
	}
}
