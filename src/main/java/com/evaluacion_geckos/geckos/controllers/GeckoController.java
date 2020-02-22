package com.evaluacion_geckos.geckos.controllers;

import com.evaluacion_geckos.geckos.utils.Consultar;
import com.evaluacion_geckos.geckos.utils.FileWR;
import com.evaluacion_geckos.geckos.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Controller
@RequestMapping(UrlConstants.GECKO)
public class GeckoController {

    @GetMapping("")
    public String goGecko(){

        int i=0;
        Runnable[]r = new Runnable[5];

        r[i++]= new FileWR();
        r[i++]= new FileWR();
        r[i++]= new Consultar();
        r[i++]= new FileWR();
        r[i++]= new FileWR();


        ExecutorService sPool = Executors.newFixedThreadPool(4);

        for(Runnable t : r)
            sPool.execute(t);
            System.out.println("thread runned");





































        return "gecko";
    }
}
