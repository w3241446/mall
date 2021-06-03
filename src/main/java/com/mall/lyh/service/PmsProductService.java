package com.mall.lyh.service;

import com.mall.lyh.common.CommonResult;
import com.mall.lyh.mbg.model.PmsProduct;

import java.util.List;

/**
 * 商品管理业务层
 * @author lyh 2021-05-31
 */
public interface PmsProductService {
    CommonResult<List<PmsProduct>> getPmsProductList();
}
