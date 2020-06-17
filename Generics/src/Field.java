public class Field<T> {
    private T value1;
    private T value2;
    public Field(T value1, T value2){
        this.value1=value1;
        this.value2=value2;
    }
    public T getValue1() {
        return value1;
    }
    public T getValue2(){
        return value2;
    }
    public void set(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}