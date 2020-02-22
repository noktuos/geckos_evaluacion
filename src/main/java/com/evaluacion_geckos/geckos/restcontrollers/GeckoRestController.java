package com.evaluacion_geckos.geckos.restcontrollers;

import com.evaluacion_geckos.geckos.models.Gecko;
import com.evaluacion_geckos.geckos.services.GeckoService;
import com.evaluacion_geckos.geckos.utils.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlConstants.GECKO)
public class GeckoRestController {

    @Autowired
    GeckoService service;

    @GetMapping(UrlConstants.LIST)
    public List<Gecko> list(){
        return service.list();
    }

    @GetMapping(UrlConstants.GET)
    public Gecko get(@PathVariable int id){
        return service.get(id);
    }

    @PostMapping(UrlConstants.ADD)
    public void add(@RequestBody Gecko gecko) {
        service.add(gecko);
    }

    @PutMapping(UrlConstants.UPDATE)
    public void update(@RequestBody Gecko gecko, @PathVariable int id){
        service.update(gecko,id);
    }

    @DeleteMapping(UrlConstants.DELETE)
    public void delete(@PathVariable int id){
        service.delete(id);
    }




























}
