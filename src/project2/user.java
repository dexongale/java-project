/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author derrick.osae
 */
class user {
    private int sno;
    private String name,address,gender,exam,major;
    private byte[]picture;
    
    public user(int sno,String name, String address, String gender, String exam, String major,byte[]image){
        this.sno=sno;
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.exam=exam;
        this.major=major;
        this.picture=image;
    }
    public int getsno(){
        return sno;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getGender(){
        return gender;
    }
    public String getExam(){
        return exam;
    }
    public String getMajor(){
        return major;
    }
    public byte[] getImage(){
        return picture;
    }
}
