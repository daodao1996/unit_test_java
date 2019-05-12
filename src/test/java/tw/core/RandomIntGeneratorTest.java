package tw.core;


import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {
    @Test
    public void should_return_random_answer() throws Exception {
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        String randomAnswer = randomIntGenerator.generateNums(9,4);
        String[] answers = randomAnswer.split(" ");
        assertThat(answers.length).isEqualTo(4);
        for(String a:answers){
            assertThat(Integer.valueOf(a)).isLessThan(10);
        }
    }
}