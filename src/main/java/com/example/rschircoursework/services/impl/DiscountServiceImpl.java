package com.example.rschircoursework.services.impl;

import com.example.rschircoursework.model.dao.IDiscountRepository;

import com.example.rschircoursework.model.entity.Discount;
import com.example.rschircoursework.services.IDiscountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DiscountServiceImpl extends AbstractServiceImpl<Discount, IDiscountRepository> implements IDiscountService {
    protected DiscountServiceImpl(IDiscountRepository defaultDao) {
        super(defaultDao);
    }

    @Override
    public Discount update(Long id, Discount entity) {
        findById(id);
        entity.setId(id);
        return create(entity);
    }
}
