public class MyArrayList<T>{
    private T[] array;
    private int size;
    private int capacity;

    MyArrayList(){
        array = (T[]) new Object[1];
        size = 0;
        capacity = 1;
    }

    private void resize(){
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];

        for(int i = 0 ; i < size ; i++){
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public void add(T value){
        if(size ==  capacity){
            resize();
        }

        array[size++] = value;
    }

    public T get(int idx){
        if(idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Given Index is out of Bouund");
        }
        return array[idx];
    }

    public void set(int idx, T value){
        if(idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Given Index is out of Bouund");
        }
        array[idx] = value;
    }


    public void remove(int idx){
        if(idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Given Index is out of Bouund");
        }
        for(int i = idx ; i < size - 1 ; i++){
            array[i] = array[i + 1];
        }
        array[size-1] = null;
        size--;
    }


    public int size() {
        return size;
    }

    public int capacity(){
        return capacity;
    }
}