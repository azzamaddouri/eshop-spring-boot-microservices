package com.eshop.inventory.service.controller;

import com.eshop.inventory.service.dto.InventoryResponse;
import com.eshop.inventory.service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;
   // http://localhost:8082/api/inventory?sku-code=iphone-13&sku-code=iphone13-red
   @GetMapping
   @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){

       return inventoryService.isInStock(skuCode);
   }

}
