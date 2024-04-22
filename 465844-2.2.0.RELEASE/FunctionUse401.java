import org.springframework.cloud.openfeign.FeignClient;
public class FunctionUse401 {
public void funcUse() {
FeignClient feignclient = new FeignClient();
feignclient.contextId();
}
}