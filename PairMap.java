package day0530;

abstract class PairMap {
	protected String keyArray [];///key����迭
	protected String valueArray [];//value����迭
	abstract String get(String key);//key���� ����value���� ���� null
	abstract void put(String key,String value);//key�� value���� key�� ������ value�� ����
	abstract String delete(String key);//key���� ���� ������ (value��)���� ������ value������
	abstract int length();//���� ����� �����ۼ�
}
