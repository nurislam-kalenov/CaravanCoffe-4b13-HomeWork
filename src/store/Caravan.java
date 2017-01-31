package store;

import java.util.ArrayList;

import abstracts.CoffeAbstract;
import goods.ArabicaCoffee;

public class Caravan {
	/**
	 * �����,������ ���� ������ ������ 
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
private ArrayList<BuyItem> items;

private CoffeAbstract coffeAbstract;
private int amount; 

	public Caravan(){
	   items = new ArrayList<BuyItem>();
	 
	}
	
	public void addListOfItem(CoffeAbstract coffeAbstract , int amount){
	 BuyItem buyItem = new BuyItem();
		buyItem.setCoffeAbstract(coffeAbstract);
		buyItem.setAmount(amount);
		items.add(buyItem);
	
	}
	
	public ArrayList<BuyItem> getListOfItem(){
		return items;
	}
	
	public BuyItem getListOfItem(int number){
		return items.get(number);
	}
	public int getSizeBuyItem(){
		return items.size();
	}
}