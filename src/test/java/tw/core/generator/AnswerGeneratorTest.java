package tw.core.generator;

import org.junit.Before;
import org.junit.Test;
import tw.core.Answer;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {
    private AnswerGenerator answerGenerator;

    @Before
    public void setup() {
        answerGenerator = new AnswerGenerator(new RandomIntGenerator());
    }

    @Test
    public void should_create_a_random_answer_and_limit_9() throws Exception {
        Answer exceptedAnswer = answerGenerator.generate();
        String[] answerArray = exceptedAnswer.toString().split(" ");
        assertThat(answerArray.length).isEqualTo(4);
        for(String s:answerArray){
            assertThat(Integer.valueOf(s)).isLessThan(10);
        }
    }

}

