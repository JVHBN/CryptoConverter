package application;

 public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    
    @Configuration
    @EnableAutoConfiguration
    @ComponentScan("Controller")
    public static class AppConfig {
        
    }
}
