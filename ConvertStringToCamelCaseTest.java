import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertStringToCamelCaseTest {
  ConvertStringToCamelCase convertStringToCamelCase;

  @Test
  void toCamelCase() {
    String st = "the-stealth-warrior";
    Assertions.assertEquals("theStealthWarrior", ConvertStringToCamelCase.toCamelCase(st));
  }
}