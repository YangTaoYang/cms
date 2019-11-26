package com.person.cms.service;

import com.person.cms.bean.Link;
import com.person.cms.exception.CustomerException;

import java.util.List;


public interface ILinkService {
    void saveOrUpdateLink(Link link) throws CustomerException;

    void deleteLink(int id) throws CustomerException;

    Link findById(int id) throws CustomerException;

    List<Link> findAll() throws CustomerException;

}
