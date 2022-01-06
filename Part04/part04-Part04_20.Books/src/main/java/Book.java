/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harry
 */
public class Book {
    private String name;
    private int pages, year;
    
    public Book(String name, int pages, int year){
        this.name = name;
        this.pages = pages;
        this.year = year;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    @Override
    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.year;
    }
}
