package com.wxl.cloud.miniecommerce.system.controller.express;

import com.wxl.cloud.miniecommerce.common.util.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.ExpressInfo;
import com.wxl.cloud.miniecommerce.system.service.ExpressInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：ExpressInfoContoller
 * @description：快递信息Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/expressinfo")
@Tag(name="快递信息")
public class ExpressInfoController {


    @Autowired
    private ExpressInfoService expressInfoService;


    @Operation(summary = "根据id查询快递信息")
    @GetMapping("/{id}")
    public Result<ExpressInfo> getById(@PathVariable Long id){
        return Result.ok(expressInfoService.getById(id));
    }
    
    
    @Operation(summary = "查询快递信息列表")
    @GetMapping("list")
    public Result<List<ExpressInfo>> list(){
        return Result.ok(expressInfoService.list());
    }
    
    
    @Operation(summary = "保存或更新快递信息")
    @PostMapping("saveorupdate")
    public Result saveOrUpdate(@RequestBody ExpressInfo dto){
        expressInfoService.saveOrUpdate(dto);
        return Result.ok();
    }
    
    
    @Operation(summary = "根据id删除快递信息")
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Long id){
        expressInfoService.removeById(id);
        return Result.ok();
    }

}

