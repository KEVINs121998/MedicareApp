package com.medicare.doctorapp.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {
@GetMapping("/")
public String home()
{
return "Welcome to Medicare App";	
}
@GetMapping("/about")
public String about()
{
return "Welcome to Appointment App";	
}
}
