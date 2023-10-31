package com.isc.authentication.client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import com.isc.authentication.utils.exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "registry", url = "gateway:8080", fallbackFactory = RegistryFallback.class)
@CircuitBreaker(name = "registry")
public interface RegistryClient {


}

@Slf4j
@Component
class RegistryFallback implements FallbackFactory<RegistryClient> {


    }
}
