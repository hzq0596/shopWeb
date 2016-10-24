package com.hzq.shop.dao;

import com.hzq.shop.domain.ProductPhotos;

public interface ProductPhotosMapper {
    int deleteByPrimaryKey(Long photoId);

    int insert(ProductPhotos record);

    int insertSelective(ProductPhotos record);

    ProductPhotos selectByPrimaryKey(Long photoId);

    int updateByPrimaryKeySelective(ProductPhotos record);

    int updateByPrimaryKey(ProductPhotos record);
}