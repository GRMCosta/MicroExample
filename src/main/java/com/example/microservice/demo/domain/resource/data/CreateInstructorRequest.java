package com.example.microservice.demo.domain.resource.data;

import com.example.microservice.demo.domain.Instructor;
import com.example.microservice.demo.domain.InstructorDetail;
import lombok.*;

@Data
@Builder
public class CreateInstructorRequest {

    private String firstName;

    private String lastName;

    private String email;

    private InstructorDetail instructorDetail;

    public Instructor toInstructor(){
        return Instructor.builder()
                .firtsName(firstName)
                .lastName(lastName)
                .email(email)
                .instructorDetail(InstructorDetail.builder()
                    .youtubeChannel(instructorDetail.getYoutubeChannel())
                    .hobby(instructorDetail.getHobby())
                    .build())
                .build();
    }
}
