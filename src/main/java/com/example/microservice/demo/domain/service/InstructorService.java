package com.example.microservice.demo.domain.service;

import com.example.microservice.demo.domain.repository.InstructorRepository;
import com.example.microservice.demo.domain.resource.data.CreateInstructorRequest;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository){this.instructorRepository = instructorRepository;}

    public void createdInstructor(CreateInstructorRequest request){
        val instructor = request.toInstructor();

    }
}
