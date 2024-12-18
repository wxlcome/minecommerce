package com.wxl.cloud.miniecommerce.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wxl.cloud.miniecommerce.common.util.http.Result;
import com.wxl.cloud.miniecommerce.model.entity.system.CityInfo;
import com.wxl.cloud.miniecommerce.model.entity.system.DistrictInfo;
import com.wxl.cloud.miniecommerce.model.entity.system.Paymethod;
import com.wxl.cloud.miniecommerce.model.entity.system.ProvinceInfo;
import com.wxl.cloud.miniecommerce.system.service.CityInfoService;
import com.wxl.cloud.miniecommerce.system.service.DistrictInfoService;
import com.wxl.cloud.miniecommerce.system.service.PaymethodService;
import com.wxl.cloud.miniecommerce.system.service.ProvinceInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName  ：RegionContoller
 * @description：地区Controller
 * @author     ：wxl
 * @date       ：2024/12/05 16:44
 */
@RestController
@RequestMapping("/system/region")
@Tag(name="地区")
public class RegionContoller {

    @Autowired
    private ProvinceInfoService provinceInfoService;
    @Autowired
    private CityInfoService cityInfoService;
    @Autowired
    private DistrictInfoService districtInfoService;


    @Operation(summary = "获取省份列表")
    @GetMapping("/province/list")
    public Result<List<ProvinceInfo>> getProvinceList(){
        return Result.ok(provinceInfoService.list());
    }


    @Operation(summary = "获取省份id获取城市列表")
    @GetMapping("/city/list/{provinceId}")
    public Result<List<CityInfo>> getCityList(@PathVariable Long provinceId){
        return Result.ok(cityInfoService.list(new LambdaQueryWrapper<CityInfo>().eq(CityInfo::getProvinceId,provinceId)));
    }



    @Operation(summary = "获取城市id获取地区列表")
    @GetMapping("/district/list/{cityId}")
    public Result<List<DistrictInfo>> getDistrictList(@PathVariable Long cityId){
        return Result.ok(districtInfoService.list(new LambdaQueryWrapper<DistrictInfo>().eq(DistrictInfo::getCityId,cityId)));
    }


}

