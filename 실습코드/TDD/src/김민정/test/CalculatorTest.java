public class CalculatorTest {
    Calculator cal = new Calculator();
    @Test
    void plus(){
        Assertions.assertEquals(5,cal.plus(2,3));
    }
    @Test
    void minus(){
        Assertions.assertEquals(2, cal.minus(3,1));
    }
    @BeforeAll
    static void beforeAll(){
        System.out.println("테스트 클래스가 실행될 때 한번 실행");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("각 테스트 메소드가 실행되기 전에 실행");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("테스트 클래스가 죵료될 때 한번 실행");
    }
    @AfterEach
    void afterEach(){
        System.out.println("각 테스트 메소드가 실행된 후 실행");
    }
}
