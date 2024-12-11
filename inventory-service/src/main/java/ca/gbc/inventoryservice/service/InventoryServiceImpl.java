package ca.gbc.inventoryservice.service;

import ca.gbc.inventoryservice.repository.InventoryRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService{
    private final InventoryRepository inventoryRepository;

    @Override
    public boolean IsInStock(String skuCode, Integer quantity){
        return inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode,quantity);

    }

}
