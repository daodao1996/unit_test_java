package tw.core;

import org.junit.Test;
import tw.core.model.Record;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {


    @Test
    public void should_return_an_answer() throws Exception {
        Answer answer = new Answer();
        Answer actualAnswer = answer.createAnswer("1 2 3 4");
        String expectedString = "1 2 3 4";
        assertThat(actualAnswer.toString()).isEqualTo(expectedString);
    }

    @Test
    public void should_return_an_record() throws Exception {
        Answer answer = Answer.createAnswer("1 2 3 4");
        Answer inputAnswer = Answer.createAnswer("5 3 2 4");
        Record actualRecord = answer.check(inputAnswer);
        String expectedString = "1A2B";
        assertThat(actualRecord.getValue()).isEqualTo(expectedString);
    }
}