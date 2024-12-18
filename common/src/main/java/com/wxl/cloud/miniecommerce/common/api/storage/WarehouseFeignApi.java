package com.wxl.cloud.miniecommerce.common.api.storage;


import com.wxl.cloud.miniecommerce.common.util.http.Result;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @InterfaceName  ：WarehouseFeignApi
 * @description    ：仓库远程调用
 * @author         ：wxl
 * @date           ：2024/12/14 12:36
 */
@FeignClient(name = "me-storage", path = "/storage/warehouse",contextId = "warehouse")
public interface WarehouseFeignApi {

    @Operation(summary = "根据id查询仓库")
    @GetMapping("/{id}")
     Result getById(@PathVariable Long id);
}
