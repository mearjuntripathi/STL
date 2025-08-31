public class MyArray{
    int arr[];
    int len;
    int values;


    public MyArray(int len){
        this.len = len;
        arr = new int[len];
        int values = 0;
    }

    void insertAtBegin(int val){
        if(values == 0){
            arr[0] = val;
            values++;
            return;
        }

        int newarr[] = new int[++len];
        newarr[0] = val;

        for(int i = 0 ; i < values ; i++){
            newarr[i+1] = arr[i];
        }
        values++;
        arr = newarr;
    }

    void insertAtPosition(int pos, int val){
        if(pos > len){
            System.out.println("Invalid position");
            return;
        }

        int newarr[] = new int[len+1];
        for(int i = 0 ; i <= len ; i++){
            if(i < pos-1){
                newarr[i] = arr[i];
            }else if(i == pos -1){
                newarr[i] = val;
            }else{
                newarr[i] = arr[i-1];
            }
        }
        len++
        values++;
        arr = newarr;
    }

    void insertAtLast(int val){
        if(values == len){
            int newarr[] = new int[len+1];
            for(int i = 0 ; i < len ; i++){
                newarr[i] = arr[i];
            }
            len++;
            arr = newarr;
        }
        arr[values] = val;
        values++;
    }
}