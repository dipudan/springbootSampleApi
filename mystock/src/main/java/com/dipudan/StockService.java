package com.dipudan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockRepository repo;

    public List<Stock> listAll(){
        return repo.findAll();
    }

    public void save(Stock stock){
        repo.save(stock);
    }

    public Stock get(Integer id){
        return repo.findById(id).get();
    }

    public void delete(Integer id){
        repo.deleteById(id);
    }
}
