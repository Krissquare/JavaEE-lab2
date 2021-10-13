package RESRfulAPIForTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping()
    public Object searchFullOrder(){

        return new Object();
    }

    @PostMapping()
    public Object createNewOrder(){

        return new Object();
    }

}
