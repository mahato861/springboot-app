
package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
// this is my firsht dev project
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!. This is a page maintained by Manoj";
      
    }

}
