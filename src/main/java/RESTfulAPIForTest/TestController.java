package RESTfulAPIForTest;

import Utils.MyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/orders/{id}")
    public Object searchFullOrder(@PathVariable Integer id){

        return new Object();
    }

    @PostMapping("/orders")
    public Object createNewOrder(){

        return MyResponse.OK(null);
    }

}
