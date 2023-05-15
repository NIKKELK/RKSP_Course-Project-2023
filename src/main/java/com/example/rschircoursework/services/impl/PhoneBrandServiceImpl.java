package com.example.rschircoursework.services.impl;


import com.example.rschircoursework.model.dao.IPhoneBrandRepository;
import com.example.rschircoursework.model.entity.PhoneBrand;
import com.example.rschircoursework.services.IPhoneBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class PhoneBrandServiceImpl extends AbstractServiceImpl<PhoneBrand, IPhoneBrandRepository> implements IPhoneBrandService {
    @Autowired
    protected PhoneBrandServiceImpl(IPhoneBrandRepository defaultDao) {
        super(defaultDao);
    }

    @Override
    public PhoneBrand update(Long id, PhoneBrand entity) {
        findById(id);
        entity.setId(id);
        return create(entity);
    }
}
