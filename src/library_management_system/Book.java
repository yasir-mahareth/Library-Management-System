/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management_system;


class Book {
    int ID,quantity,issued;
    String name,author,publisher,category;
    
    public Book(int id,String n,String a,String p,String c,int q,int i){
        ID=id;
        name=n;
        author=a;
        publisher=p;
        category=c;
        quantity=q;
        issued=i;
    }
}
