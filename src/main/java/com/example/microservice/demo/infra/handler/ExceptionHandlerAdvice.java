package com.example.microservice.demo.infra.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import interfaces.MessageService;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
@Slf4j
public class ExceptionHandlerAdvice {

  @Value("${message-locator.service-name}")
  private String serviceName;

  @Value("${message-locator.benefits-users.service-name}")
  private String benefitsUsersServiceName;

  @Value("${message-locator.service-id}")
  private Integer serviceId;

  private final MessageService messageService;

  private final ObjectMapper objectMapper;

  public ExceptionHandlerAdvice(MessageService messageService, ObjectMapper objectMapper) {
    this.messageService = messageService;
    this.objectMapper = objectMapper;
  }


}
