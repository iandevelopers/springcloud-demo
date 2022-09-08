package com.galaxy.heros.feign;

import com.galaxy.heros.api.TestApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "demo-provider")
public interface TestClient extends TestApi {

}
