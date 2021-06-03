package com.mall.lyh.controller.pmsController;

import com.mall.lyh.common.CommonResult;
import com.mall.lyh.mbg.model.PmsProduct;
import com.mall.lyh.service.PmsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品管理控制层
 * @author lyh 2021/5/31
 */
@RestController("/product")
public class PmsProductController {
    @Autowired
    private PmsProductService pmsProductService;

    @ApiOperation("")
    @GetMapping("getPmsProductList")
    public CommonResult<List<PmsProduct>> getPmsProductList(){
        return pmsProductService.getPmsProductList();
    }
}
