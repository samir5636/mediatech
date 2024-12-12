package com.fstt.service;

import com.fstt.dto.ClientRequestDto;
import com.fstt.dto.ClientResponseDto;

public interface ClientService {
ClientResponseDto save(ClientRequestDto clientRequestDto);

ClientResponseDto findById(Integer id);

ClientResponseDto findByFirstName(String firstName);

void delete(Integer id);

ClientResponseDto update(ClientRequestDto clientRequestDto, Integer id);
}
