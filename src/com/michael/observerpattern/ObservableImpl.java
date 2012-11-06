package com.michael.observerpattern;

import java.util.ArrayList;
import java.util.List;

import com.michael.interfaces.Observable;
import com.michael.interfaces.Observer;

public class ObservableImpl implements Observable{

	private List<Observer> observerList;//这个List维护着观察者的注册和取消注册
	
	public ObservableImpl() {
		observerList = new ArrayList<Observer>();
	}

	/**
	 * 注册监听
	 * 
	 * */
	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	/**
	 * 取消监听
	 * 
	 * */
	@Override
	public void deleteObserver(Observer observer) {
		int index = observerList.indexOf(observer);
		if(index >= 0)
		{
			observerList.remove(index);
		}
	}

	/**
	 * 通知所有的观察者改变数据
	 * 
	 * */
	@Override
	public void notifyObservers(int progress) {
		for (Observer observer : observerList) {
			observer.update(progress);
        }
	}
	
	
	/**
	 * SeekBar通过这个方法与Subject进行交互
	 * 当然，通过notifyObservers也是一样的。
	 * 
	 * */
	public void setData(int progress)
	{
		notifyObservers(progress);
	}
	
}