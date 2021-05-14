package bai10_danh_sach.bai_tap.array_list_va_linked_list;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size = 0;

    protected MyAbstractList(){

    }

    protected  MyAbstractList(E[] objects){
        for (E object : objects) {
            add(object);
        }
    }

    @Override
    public void add(E e){
        add(size , e);
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public boolean remove(E e) {
        if (indexOf(e) >= 0) {
            remove(indexOf(e));
            return true;
        } else {
            return false;
        }
    }
}