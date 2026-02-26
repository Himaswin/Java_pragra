package Jan24;

public class Record <Value>{
    Value val;

    public Record(Value val) {
        this.val = val;
    }

    public Value getVal() {
        return val;
    }

    public void setVal(Value val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Record{" +
                "val=" + val +
                '}';
    }
}
