package com.triddle.sfgdi.controllers;

import com.triddle.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();   // Dependency injection occurs here.
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}