package com.example.microservice.demo.domain.resource.data;

import com.example.microservice.demo.domain.Instructor;
import lombok.*;

@Data
@Builder

public class CreateInstructorRequest {

    private String firstName;

    private String lastName;

    private String email;

    private InstructorDetail instructorDetail;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class InstructorDetail{

        private  String youtubeChannel;

        private String hobby;
    }

    public Instructor toInstructor(){
        val instructorDetail = toInstructorDetail();

        return Instructor.builder()
                .firtsName(firstName)
                .lastName(lastName)
                .email(email)
                .instructorDetail()
                .build();

    }
    private InstructorDetail toInstructorDetail()



}
