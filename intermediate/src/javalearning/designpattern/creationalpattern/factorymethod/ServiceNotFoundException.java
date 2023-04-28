package javalearning.designpattern.creationalpattern.factorymethod;

public class ServiceNotFoundException extends RuntimeException{
    private String msg;
    ServiceNotFoundException(String msg){
    	this.msg = msg;
    }
}
