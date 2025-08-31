public class MyArrayList<T>{
    private T array[];
    private int size;
    private int capacity;

    private void resize(){
        capacity *= 2;
        T temp[] = (T[]) new Object[capacity];

        for(int i = 0 ; i < size ; i++){
            temp[i] = array[i];
        }

        array = temp;
    }

    // Intilizatoin Part
    public MyArrayList(){
        capacity = 1;
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T val){
        if(size == capacity){
            resize();
        }
        array[size++] = val;
    }


    public void insert(int idx, T val){
        if(idx < 0 || idx > size){
            throw new IndexOutOfBoundsException("Given index is out of range"); 
        }
        // if(idx == size){
        //     add(val);
        //     return;
        // }
        if(size == capacity){
            resize();
        }

        for(int i = size ; i >= idx ; i--){
            array[i] = array[i-1];
        }
        array[idx-1]=val;
        size++;
    }

    public T get(int idx){
        if(idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Given index is out of range"); 
        }

        return array[idx];
    }

    public void set(int idx, T val){
        if(idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Given index is out of range"); 
        }

        array[idx] = val;
    }

    public void remove(int idx){
        if(idx < 0 || idx >= size){
            throw new IndexOutOfBoundsException("Given index is out of range"); 
        }

        for(int i = idx ; i < size-1; i++){
            array[i] = array[i+1];
        }
        size--;
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return capacity;
    }

}