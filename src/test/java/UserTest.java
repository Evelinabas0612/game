import com.example.game.entities.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest {
    String username = "Tom";
    Integer count = 1;
    String ip = "0:0:0:0:0:0:0:1";


    @Test
    @DisplayName("Test1: Проверить, что при передаче в конструктор первым параметром null, будет выброшено IllegalArgumentException")
    public void exceptionFirstArgumentIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(null, count, ip);
                }
        );

    }

    @Test
    @DisplayName("Test2: Проверить, что при передаче в конструктор первым параметром null, выброшенное исключение будет содержать сообщение \"Name cannot be null.\"")
    public void exceptionFirstArgumentIsNullGetMessage() {
        IllegalArgumentException illegalArgumentException = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(null, count, ip);
                }
        );
        assertEquals("Name cannot be null.", illegalArgumentException.getMessage());
    }

    @ParameterizedTest
    @DisplayName("Test3: Проверить, что при передаче в конструктор первым параметром пустой строки или строки содержащей только пробельные символы (пробел, табуляция и т.д.), будет выброшено IllegalArgumentException.")
    @ValueSource(strings = {"", " ", "\n", "\t"})
    public void exceptionFirstArgumentIsEmptyString(String username) {
        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(username, count, ip);
                }
        );


    }

    @ParameterizedTest
    @DisplayName("Test4: Проверить, что при передаче в конструктор первым параметром пустой строки или строки содержащей только пробельные символы (пробел, табуляция и т.д.), выброшенное исключение будет содержать сообщение \"Name cannot be blank.\"")
    @ValueSource(strings = {"", " ", "\n", "\t"})
    public void exceptionFirstArgumentIsEmptyStringGetMessage(String username) {
        IllegalArgumentException illegalArgumentException = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(username, count, ip);
                }
        );
        assertEquals("Name cannot be blank.", illegalArgumentException.getMessage());
    }

    @ParameterizedTest
    @DisplayName("Test5: Проверить, что при передаче в конструктор вторым параметром отрицательного числа, будет выброшено IllegalArgumentException")
    @ValueSource(ints = {-10, -20, -77})
    public void exceptionSecondArgumentIsNegative(Integer count) {
        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(username, count, ip);
                }
        );
    }

    @ParameterizedTest
    @DisplayName("Test6: Проверить, что при передаче в конструктор вторым параметром отрицательного числа, выброшенное исключение будет содержать сообщение \"Count cannot be negative.\"")
    @ValueSource(ints= {-1, -2, -7})
    public void exceptionSecondArgumentIsNegativeGetMessage(Integer count) {
        IllegalArgumentException illegalArgumentException = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(username, count, ip);
                }
        );
        assertEquals("Count cannot be negative.", illegalArgumentException.getMessage());
    }
    @Test
    @DisplayName("Test7: Проверить, что при передаче в конструктор третьим параметром null, будет выброшено IllegalArgumentException")
    public void exceptionThirdArgumentIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(username, count, null);
                }
        );

    }

    @Test
    @DisplayName("Test8: Проверить, что при передаче в конструктор третьим параметром null, выброшенное исключение будет содержать сообщение \"IP cannot be null.\"")
    public void exceptionThirdArgumentIsNullGetMessage() {
        IllegalArgumentException illegalArgumentException = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(username, count, null);
                }
        );
        assertEquals("IP cannot be null.", illegalArgumentException.getMessage());
    }

    @ParameterizedTest
    @DisplayName("Test9: Проверить, что при передаче в конструктор третьим параметром пустой строки или строки содержащей только пробельные символы (пробел, табуляция и т.д.), будет выброшено IllegalArgumentException.")
    @ValueSource(strings = {"", " ", "\n", "\t"})
    public void exceptionThirdArgumentIsEmptyString(String ip) {
        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(username, count, ip);
                }
        );


    }

    @ParameterizedTest
    @DisplayName("Test4: Проверить, что при передаче в конструктор третьим параметром пустой строки или строки содержащей только пробельные символы (пробел, табуляция и т.д.), выброшенное исключение будет содержать сообщение \"Name cannot be blank.\"")
    @ValueSource(strings = {"", " ", "\n", "\t"})
    public void exceptionThirdArgumentIsEmptyStringGetMessage(String ip) {
        IllegalArgumentException illegalArgumentException = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new User(username, count, ip);
                }
        );
        assertEquals("IP cannot be blank.", illegalArgumentException.getMessage());
    }


}
