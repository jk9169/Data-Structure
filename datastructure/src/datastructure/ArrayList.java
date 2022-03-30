package datastructure;

import java.util.ListIterator;

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
		  for(int i = size - 1; i >= index; i--)	//추가하고자 하는 값 뒤의 데이터들을 오른쪽으로 한칸씩 밈.
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
	  
	  public Object remove(int index) 		//arraylist에서 데이터 삭제
	  {	Object removed = elementData[index];		//삭제할 데이터를 변수에 담음
		  for(int i = index + 1; i <= size - 1; i++) 		//삭제한 데이터 뒤를 한칸씩 땡김
		  {
			  elementData[i - 1] = elementData[i]; 
		  }
		  size--;
		  elementData[size] = null;
		  return removed; //삭제한 데이터 반환
	  }
	  
	  public  Object removeFirst() //arraylist에서 첫번째 데이터 삭제
	  {
		  return remove(0); 
	  }
	  
	  public Object removeLast()	//arraylist에서 마지막 데이터 삭제
	  {
		  return remove(size - 1);
	  }
	  
	  public Object get(int index) //arraylist는 인덱스로 접근하여 속도가 빠름
	  {
		  return elementData[index];
	  }
	  public int size() //arraylist의 크기 반환
	  {
		  return size;
	  }
	  public int indexOf(Object o) //arraylist 검색
	  {
		  for(int i = 0; i < size; i++)
		  {
			  if(o.equals(elementData[i]))
			  {
				  return i;
			  }
		  }
		  return -1;
	  }
	  public ListIterator listIterator()
	  {
		  return new ListIterator();
	  }
	  
	  class ListIterator
	  {
		private int nextIndex = 0;
		
		public boolean hasNext()
		{
			return nextIndex < size ();
		}
		
		public Object next()
		{
			return elementData[nextIndex++];
		}
		
		public Object previous()
		{
			return elementData[--nextIndex];
		}
		
		public boolean hasprevious()
		{
			return nextIndex > 0;
		}
		
		public void add(Object element)
		{
			ArrayList.this.add(nextIndex++, element);
		}
		public void remove()
		{
			ArrayList.this.remove(nextIndex - 1);
			nextIndex--;
		}
	  
	  }
}