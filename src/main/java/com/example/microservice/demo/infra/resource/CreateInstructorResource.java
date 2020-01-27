package com.example.microservice.demo.infra.resource;


import com.example.microservice.demo.infra.resource.data.CreateInstructorRequest;
import com.example.microservice.demo.domain.service.InstructorService;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/instructor")
public class CreateInstructorResource {

    private final InstructorService instructorService;

    public CreateInstructorResource(InstructorService instructorService){ this.instructorService = instructorService;}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void instructor(@Valid @RequestBody CreateInstructorRequest request){
        instructorService.createdInstructor(request);
    }
}
