/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdevassignment1;

/**
 *
 * @author shahe
 */
public class Customer {

    private String name, memberType;
    private boolean member = false;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", memberType=" + memberType + ", member=" + member + '}';
    }

}
