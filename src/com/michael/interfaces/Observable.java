package com.michael.interfaces;

/**
 * 主题接口，也就是起到java.util.Observable这个类的作用
 * 
 * */
public interface Observable {

	void addObserver(Observer observer);
	void deleteObserver(Observer observer);
	void notifyObservers(int progress);
}
