package com.itcast.ssm.dao;

import com.itcast.ssm.domain.Items;

public interface itemsDao {
    public Items findById(Integer id);
}
