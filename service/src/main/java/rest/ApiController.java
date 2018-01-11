/**
 * @author Raju K Singh
 */
package rest;

import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private static final AtomicInteger counter = new AtomicInteger(0);
/**
 * Rest API returns no of hits and current timestamp
 * @return
 */
    @RequestMapping("/invokeApi")
    public Api invoke() {
        return new Api(counter.incrementAndGet());
    }
}