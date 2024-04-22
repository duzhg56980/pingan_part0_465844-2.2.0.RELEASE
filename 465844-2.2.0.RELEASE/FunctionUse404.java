import org.springframework.cloud.openfeign.FeignClientsRegistrar;
public class FunctionUse404 {
public void funcUse() {
FeignClientsRegistrar feignclientsregistrar = new FeignClientsRegistrar();
feignclientsregistrar.validateFallback(null);
}
}