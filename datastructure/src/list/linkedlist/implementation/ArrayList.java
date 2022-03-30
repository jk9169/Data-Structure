package list.linkedlist.implementation;

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
		  for(int i = size - 1; i >= index; i--)
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
}
