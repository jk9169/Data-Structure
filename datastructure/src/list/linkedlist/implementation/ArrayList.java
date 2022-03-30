package list.linkedlist.implementation;

public class ArrayList {

	  private int size = 0;
	  private Object[] elementData = new Object[100];
	  
	  public boolean addFirst(Object element) //arraylist 첫번째에 값을 추가할 때
	  {
		  return add(0, element);
	  }
	  
	  public boolean addLast(Object element) //arraylist마지막에 값을 추가할 때
	  {
		  elementData[size] = element;
		  size++;
		  return true;
	  }
	  
	  public boolean add(int index, Object element) //arraylist에서 값을 추가하는 메소드
	  {
		  for(int i = size - 1; i >= index; i--)
		  {
			  elementData[i + 1] = elementData[i];
		  }
		  elementData[index] = element;
		  size++;
		  return true;
	  }
	  
	  public String toString() //객체가 가진 값을 반환하는 메소드
	  {	  String str = "[";
	  for(int i = 0; i < size; i++)
	  {
		  str += elementData[i];
		  if(i < size - 1)
		  {
			  str += ",";
		  }
	  }
		  return str + "]";
	 
	  }
}
