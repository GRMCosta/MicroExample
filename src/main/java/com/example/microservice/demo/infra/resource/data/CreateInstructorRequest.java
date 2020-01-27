package com.example.microservice.demo.infra.resource.data;

import com.example.microservice.demo.domain.Instructor;
import com.example.microservice.demo.domain.InstructorDetail;
import com.example.microservice.demo.domain.Messages;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.*;

@Data
@Builder
public class CreateInstructorRequest {

    @NotBlank(message = Messages.FIST_NAME_IS_REQUIRED)
    private String firstName;

    @NotBlank(message = Messages.LAST_NAME_IS_REQUIRED)
    private String lastName;

    @NotBlank(message = Messages.EMAIL_IS_REQUIRED)
    private String email;

    @Valid
    @NotNull(message = Messages.INSTRUCTOR_DETAILS_IS_REQUIRED)
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
