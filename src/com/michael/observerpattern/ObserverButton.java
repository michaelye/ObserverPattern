package com.michael.observerpattern;

import com.michael.interfaces.Observable;
import com.michael.interfaces.Observer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * 
 * 
 * */
public class ObserverButton extends Button implements Observer{
	
	public ObserverButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public ObserverButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ObserverButton(Context context) {
		super(context);
	}

	/**
	 * 将本类注册成为一个观察者，本来这个最好是在构造器中进行，但是由于构造器的参数限制，因此写一个方法用来注册
	 * 这个方法需要首先被调用
	 * 
	 * */
	public void registerObserver(Observable observable)
	{
		observable.addObserver(this);
	}
	
	/**
	 * 取消监听
	 * 
	 * */
	public void unRegisterObserver(Observable observable)
	{
		observable.deleteObserver(this);
	}
	
	/**
	 * 对主题的改变进行处理
	 * 
	 * */
	@Override
	public void update(int degree) {
		this.setText("" + degree);
	}
}
















