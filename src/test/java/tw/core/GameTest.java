package tw.core;

import org.junit.Test;
import tw.core.generator.AnswerGenerator;
import tw.core.generator.RandomIntGenerator;
import tw.core.model.GuessResult;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {
    @Test
    public void should_return_guess_result() throws Exception {
        Game game = new Game(new AnswerGenerator(new RandomIntGenerator()));
        String actualAnswer = game.getActualAnswer().toString();
        Answer inputAnswer = Answer.createAnswer(actualAnswer);
        GuessResult guessResult = game.guess(inputAnswer);
        String expectedString = "4A0B";
        assertThat(guessResult.getResult()).isEqualTo(expectedString);
    }

}
