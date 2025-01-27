package actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionsController {
	
	@GetMapping(value = "/api/actions")
	public String actionsTest() {
		return "app-with-actions version:0.0.1 \nHello, World! \nBye, World!";
	}

	@GetMapping("/api/status")
	public String statusTest() {
		return "status - returned by pod // 2025.01.08";
	}


}
