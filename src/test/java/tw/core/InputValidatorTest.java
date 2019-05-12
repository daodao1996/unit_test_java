package tw.core;

import org.junit.Test;
import tw.validator.InputValidator;
import static org.fest.assertions.api.Assertions.assertThat;

/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {
    @Test
    public void should_return_true_when_input_correct_format_answer() throws Exception {
        InputValidator inputValidator = new InputValidator();
        String input = "2 3 5 6";
        boolean actual = inputValidator.validate(input);
        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void should_return_true_when_input_five_parts_answer() throws Exception {
        InputValidator inputValidator = new InputValidator();
        String input = "2 3 5 6 7";
        boolean actual = inputValidator.validate(input);
        assertThat(actual).isEqualTo(false);
    }

    @Test
    public void should_return_true_when_input_out_of_border_answer() throws Exception {
        InputValidator inputValidator = new InputValidator();
        String input = "1 2 3 40";
        boolean actual = inputValidator.validate(input);
        assertThat(actual).isEqualTo(false);
    }

}
