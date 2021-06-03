package com.mall.lyh.service.impl;

import com.mall.lyh.common.CommonResult;
import com.mall.lyh.mbg.model.PmsProduct;
import com.mall.lyh.service.PmsProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品管理业务层
 * @author lyh 2021-05-31
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {
    @Override
    public CommonResult<List<PmsProduct>> getPmsProductList() {
        return null;
    }
}
