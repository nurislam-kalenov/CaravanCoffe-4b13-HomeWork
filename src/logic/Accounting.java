package logic;

import java.util.ArrayList;

import store.BuyItem;


public class Accounting {
	/**
	 * �����, ����������� ����� ����� � ��� �������
	 * @version 1.0
	 * @author Kalenov Nurislam
	 * */
	
	 /** ������� ����� ���� 
     * @param ArrayList<BuyItem> - ������ �������
     * @see Accounting
    */
public int summaryPrice(ArrayList<BuyItem> items){
	int summary = 0;
	int count = items.size();
	if(count <= 0){
		return 0;
	}
	else{
	for(int i =0; i < count; i++){
			summary += items.get(i).getCoffeAbstract().determinePrice()*items.get(i).getAmount();
		
	}
   return summary;
}
}
/** ������� ����� ���  
 * @param ArrayList<BuyItem> - ������ �������
 * @see Accounting
*/
public int summaryWeight(ArrayList<BuyItem> items){
	int summary = 0;
	int count = items.size();
	if(count <= 0){
		return 0;
	}
	else{
	for(int i =0; i < count; i++){
			summary += items.get(i).getCoffeAbstract().determineWeight()*items.get(i).getAmount();
		
	}
   return summary;
}
}

}