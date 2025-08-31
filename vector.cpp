#include <iostream>
using namespace std;

template <typename T>
class MyVector {
private:
    T* data;
    int _size;
    int _capacity;

    void resize() {
        _capacity *= 2;
        T* newData = new T[_capacity];
        for (int i = 0; i < _size; ++i)
            newData[i] = data[i];
        delete[] data;
        data = newData;
    }

public:
    MyVector(int cap = 4) {  // default capacity is 4
        _capacity = cap;
        _size = 0;
        data = new T[_capacity];
    }

    ~MyVector() {
        delete[] data;
    }

    void push_back(T value) {
        if (_size == _capacity)
            resize();
        data[_size++] = value;
    }

    int size() const {
        return _size;
    }

    int capacity() const {
        return _capacity;
    }

    T at(int index) const {
        if (index < 0 || index >= _size) {
            throw out_of_range("Index out of range");
        }
        return data[index];
    }

    T& operator[](int index) {
        return data[index];  // No bounds checking
    }
};

int main() {
    MyVector<int> vec;

    vec.push_back(10);
    vec.push_back(20);
    vec.push_back(30);

    cout << "Size: " << vec.size() << endl;       // Output: 3
    cout << "Capacity: " << vec.capacity() << endl;

    for (int i = 0; i < vec.size(); ++i)
        cout << vec[i] << " ";                     // Output: 10 20 30

    return 0;
}
