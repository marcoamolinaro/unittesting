# unittesting

If you are using JUnit 5, in the next lecture use

@ExtendWith(MockitoExtension.class)

instead of @RunWith(MockitoJUnitRunner.class)

JUnit 5 Code
@WebMvcTest(HelloWorldController.class)

application.properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.data.jpa.repositories.bootstrap-mode=default

JUnit 5 Code
@DataJpaTest

JUnit 5 Code
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

www.xunitpatters.com
