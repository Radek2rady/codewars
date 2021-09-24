import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class examTest {

  @Test
  void zipMerge() {
    String[] first = new String[]{"banana", "apple"};
    String[] second = new String[]{"orange", "pear", "pear2", "pear3"};
    String [] result = new String[] {"banana", "orange", "apple", "pear", "pear2", "pear3"};
    Assertions.assertArrayEquals(result, exam.zipMerge(first, second));
  }


}