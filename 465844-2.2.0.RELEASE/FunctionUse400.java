import org.springframework.cloud.openfeign.FeignClient;
public class FunctionUse400 {
public void funcUse() {
FeignClient feignclient = new FeignClient();
feignclient.decode404();
}
}