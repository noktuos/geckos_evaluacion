package com.evaluacion_geckos.geckos.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="gecko")
public class Gecko {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Integer id;

    @Column(name ="fase", nullable = false , columnDefinition = "char(20)")
    private String fase;

    @Column(name="fase_padre", nullable=false , columnDefinition = "char(20)")
    private String fase_padre;

    @Column(name ="fase_madre", nullable =false , columnDefinition ="char(20)")
    private String fase_madre;
// duda como hacer mandarle los parametros
//    @Column(name = "birth_day", nullable = false , columnDefinition = "datetime default now()" )
//    private Date birth_day;
    @Column(name="precio", nullable = false , columnDefinition = "int(10)")
    private String precio;

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Column(name = "id_proyecto", unique = true , nullable = false, columnDefinition = "int(2)")
    private int id_proyecto;

    public Gecko(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getFase_padre() {
        return fase_padre;
    }

    public void setFase_padre(String fase_padre) {
        this.fase_padre = fase_padre;
    }

    public String getFase_madre() {
        return fase_madre;
    }

    public void setFase_madre(String fase_madre) {
        this.fase_madre = fase_madre;
    }

//    public Date getBirth_day() {
//        return birth_day;
//    }

//    public void setBirth_day(Date birth_day) {
//        this.birth_day = birth_day;
//    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }





}
