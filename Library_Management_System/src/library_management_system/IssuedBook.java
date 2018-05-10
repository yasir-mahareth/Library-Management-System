/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management_system;

/**
 *
 * @author Yaas
 */
class IssuedBook {
    int bookID,studentID,contact;
    String studentName,date;
    
    public IssuedBook(int bid,String sn,int sid,int c,String d){
        bookID=bid;
        studentName=sn;
        studentID=sid;
        contact=c;
        date=d;
        
    }
}
