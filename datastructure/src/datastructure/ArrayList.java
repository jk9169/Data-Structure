package datastructure;

import java.util.ListIterator;

public class ArrayList {

	  private int size = 0;
	  private Object[] elementData = new Object[100];
	  
	  public boolean addFirst(Object element) //arraylist ù��°�� ���� �߰��� ��
	  {
		  return add(0, element);
	  }
	  
	  public boolean addLast(Object element) //arraylist�������� ���� �߰��� ��
	  {
		  elementData[size] = element;
		  size++;
		  return true;
	  }
	  
	  public boolean add(int index, Object element) //arraylist���� ���� �߰��ϴ� �޼ҵ�
	  {
		  for(int i = size - 1; i >= index; i--)	//�߰��ϰ��� �ϴ� �� ���� �����͵��� ���������� ��ĭ�� ��.
		  {
			  elementData[i + 1] = elementData[i];
		  }
		  elementData[index] = element;
		  size++;
		  return true;
	  }
	  
	  public String toString() //��ü�� ���� ���� ��ȯ�ϴ� �޼ҵ�
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
	  
	  public Object remove(int index) 		//arraylist���� ������ ����
	  {	Object removed = elementData[index];		//������ �����͸� ������ ����
		  for(int i = index + 1; i <= size - 1; i++) 		//������ ������ �ڸ� ��ĭ�� ����
		  {
			  elementData[i - 1] = elementData[i]; 
		  }
		  size--;
		  elementData[size] = null;
		  return removed; //������ ������ ��ȯ
	  }
	  
	  public  Object removeFirst() //arraylist���� ù��° ������ ����
	  {
		  return remove(0); 
	  }
	  
	  public Object removeLast()	//arraylist���� ������ ������ ����
	  {
		  return remove(size - 1);
	  }
	  
	  public Object get(int index) //arraylist�� �ε����� �����Ͽ� �ӵ��� ����
	  {
		  return elementData[index];
	  }
	  public int size() //arraylist�� ũ�� ��ȯ
	  {
		  return size;
	  }
	  public int indexOf(Object o) //arraylist �˻�
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