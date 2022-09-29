package com.techcourse.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LogoutControllerTest {

    private final ControllerTestEnv controllerTestEnv = new ControllerTestEnv();

    @BeforeEach
    void init() {
        controllerTestEnv.init();
    }

    @Test
    void logout() throws ServletException, IOException {
        // given
        final HttpServletRequest request = controllerTestEnv.getRequestOf("/logout", "GET");
        final HttpServletResponse response = controllerTestEnv.getResponse();
        controllerTestEnv.setRequestSessionForLogout(request);

        // when
        controllerTestEnv.sendRequest(request, response);

        // then
        controllerTestEnv.verifyResponseSendRedirectTo(response, "/");
    }
}