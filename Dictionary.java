package day0530;

public class Dictionary extends PairMap{
	int count=0,i;
	public Dictionary(int arr){
		keyArray=new String[arr];
		valueArray=new String[arr];
		for(i=0;i<arr;i++){
			keyArray[i]="";
			valueArray[i]="";
		}
	}
	@Override
	String get(String key) {
		// TODO Auto-generated method stub
		for(i=0;i<keyArray.length;i++){
			if(keyArray[i].equals(key))
				return valueArray[i];
		}
		return "NULL";
	}

	@Override
	void put(String key, String value) {
		// TODO Auto-generated method stub
		this.keyArray[count]=key;
		this.valueArray[count]=value;
		count++;
	}

	@Override
	String delete(String key) {
		// TODO Auto-generated method stub
		for(i=0;i<keyArray.length;){
			if(keyArray[i].equals(key))
				keyArray[i]="";
			return valueArray[i];
		}
		return "";
	}

	@Override
	int length() {
		int min=0;
		// TODO Auto-generated method stub
		for(i=0;i<keyArray.length;i++){
			if(keyArray[i]=="")min++;
		}
		return keyArray.length-min;
	}

}
