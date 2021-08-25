package com.dipudan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class StockController {

    @Autowired
    private StockService service;

    @GetMapping("/stocks")
    public List<Stock> lis(){
        return service.listAll();
    }

    @GetMapping("/stocks/{id}")
    public ResponseEntity<Stock> get(@PathVariable Integer id){
        try{
            Stock stock= service.get(id);
            return new ResponseEntity<Stock>(stock, HttpStatus.OK);
        } catch (NoSuchElementException e){
            return new ResponseEntity<Stock>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/stocks")
    public void add(@RequestBody Stock stock){
        service.save(stock);
    }

    @PutMapping("/stocks/{id}")
    public ResponseEntity<Stock> update(@RequestBody Stock stockUpdate, @PathVariable Integer id){
        try{
            Stock stock = service.get(id);

            stock.setStockcode(stockUpdate.stockcode);
            stock.setStockname(stockUpdate.stockname);
            stock.setStockprice(stockUpdate.stockprice);
            stock.setQuantity(stockUpdate.quantity);
            stock.setTransactiontype(stockUpdate.transactiontype);
            service.save(stock);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/stocks/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
