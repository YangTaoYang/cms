package com.person.cms.service;

import com.person.cms.bean.Link;
import com.person.cms.exception.CustomerException;

public interface ILinkService {
    void addLink(Link link) throws CustomerException;
}
