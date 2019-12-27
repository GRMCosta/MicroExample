package com.example.microservice.demo.domain.resource;


import com.example.microservice.demo.domain.service.InstructorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/instructor")
public class CreateInstructorResource {

    private final InstructorService instructorService;

    public CreateInstructorResource(InstructorService instructorService){ this.instructorService = instructorService;}

}
