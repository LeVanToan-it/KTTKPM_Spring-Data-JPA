package com.example.Spring-Data-JPA;

@SpringBootApplication
public class SpringDataPjaPrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataPjaPrApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository employeeRepository){
        return args -> {
            insertEmployee(employeeRepository);
        };
    }
    private void insertEmployee(EmployeeRepository employeeRepository){
        Employee employee = Employee.builder()
                .firstName("Van")
                .lastName("Hung")
                .email("hungvan@gmail.com")
                .build();
        employeeRepository.save(employee);

    }
