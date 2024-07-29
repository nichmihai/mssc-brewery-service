package com.nichmihai.mssc_brewery_service.repositories;

import com.nichmihai.mssc_brewery_service.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
