package com.example.microservice.demo.domain.service;

import com.example.microservice.demo.domain.repository.InstructorRepository;
import com.example.microservice.demo.domain.resource.data.CreateInstructorRequest;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository){this.instructorRepository = instructorRepository;}

    public void createdInstructor(CreateInstructorRequest request){
        log.info("Inicializing Instructor creation");
        val instructor = request.toInstructor();
        instructorRepository.save(instructor);
        log.info("Finalizing instructor creation");
    }
}
