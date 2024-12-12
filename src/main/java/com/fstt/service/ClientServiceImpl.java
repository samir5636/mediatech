package com.fstt.service;

import com.fstt.dao.ClientDao;
import com.fstt.dto.ClientRequestDto;
import com.fstt.dto.ClientResponseDto;
import com.fstt.models.ClientEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service("impl1")
public class ClientServiceImpl implements ClientService {

    private ClientDao clientDao;
    private ModelMapper modelMapper;

    public ClientServiceImpl(ClientDao clientDao, ModelMapper modelMapper) {
        this.clientDao = clientDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public ClientResponseDto save(ClientRequestDto clientRequestDto) {
        ClientEntity clientEntity = modelMapper.map(clientRequestDto, ClientEntity.class);
        ClientEntity savedEntity = clientDao.save(clientEntity);
        return modelMapper.map(savedEntity, ClientResponseDto.class);
    }

    @Override
    public ClientResponseDto findById(Integer id) {
        ClientEntity clientEntity = clientDao.findClientEntitiesById(id);
        return modelMapper.map(clientEntity, ClientResponseDto.class);
    }

    @Override
    public ClientResponseDto findByFirstName(String firstName) {
        ClientEntity clientEntity = clientDao.findClientEntitiesByFirstName(firstName);
        return modelMapper.map(clientEntity, ClientResponseDto.class);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public ClientResponseDto update(ClientRequestDto clientRequestDto, Integer id) {
        return null;
    }
}
