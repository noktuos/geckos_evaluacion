package com.evaluacion_geckos.geckos.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWR implements Runnable{

    private File file;
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private int i;

    public FileWR(){
        file=new File ("C:\\Users\\Noktuos\\Documents\\file.txt");
        i=0;
    }

    @Override
    public void run() {
        while(true){
            try{
                fileWriter = new FileWriter(file,true);
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("guardando con threads"+": "+ (i++));
                bufferedWriter.close();
                fileWriter.close();
                Thread.sleep(255);
            }catch(Exception e){

            }

        }







































    }
}
