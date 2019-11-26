package com.person.cms.service.impl;

import com.person.cms.bean.Link;
import com.person.cms.dao.ILinkDao;
import com.person.cms.exception.CustomerException;
import com.person.cms.service.ILinkService;
import com.person.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImpl implements ILinkService {
    @Autowired
    private ILinkDao linkDao;
    @Override
    public void addLink(Link link) throws CustomerException {
        if (link == null) {
            throw new CustomerException(CodeUtil.WORST_CODE,"参数为空");
        }
        linkDao.save(link);
    }
}
