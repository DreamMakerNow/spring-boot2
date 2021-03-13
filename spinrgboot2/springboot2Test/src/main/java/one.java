import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// DATE: 2021/3/13-16:49  Happy Every Day
@RestController
@EnableAutoConfiguration
public class one {
    @RequestMapping("/one")
    String one(){
        return "hello test!";
    }

    public static void main(String[] args) {
        SpringApplication.run(one.class,args);
    }
}
