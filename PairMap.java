package day0530;

abstract class PairMap {
	protected String keyArray [];///key저장배열
	protected String valueArray [];//value저장배열
	abstract String get(String key);//key값을 가진value리턴 없음 null
	abstract void put(String key,String value);//key와 value저장 key가 잇을시 value로 수정
	abstract String delete(String key);//key값을 가진 아이템 (value도)삭제 삭제된 value값리턴
	abstract int length();//현재 저장된 아이템수
}
