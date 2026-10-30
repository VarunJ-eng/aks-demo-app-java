
package aks_demo_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello! Java 21 Spring Boot application is running on Azure AKS!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }

    @GetMapping("/info")
    public String info() {
        return "Application: AKS Demo App | Version: 1.0";
    }
}
