package com.example.catalog.service;

import com.example.catalog.jpa.CatalogEntity;

import java.util.List;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
