package nextstep.mvc.controller.tobe;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;
import nextstep.mvc.controller.tobe.fixture.AnnotationController;
import nextstep.mvc.controller.tobe.fixture.OtherAnnotationController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;

class ControllerScannerTest {

    @DisplayName("Controller 어노테이션이 붙은 클래스와 인스턴스를 구한다")
    @Test
    void getControllers() {
        final var reflections = new Reflections("nextstep.mvc");
        final var controllerScanner = new ControllerScanner(reflections);

        Map<Class<?>, Object> result = controllerScanner.getControllers();

        assertThat(result).containsKeys(AnnotationController.class, OtherAnnotationController.class);
    }
}