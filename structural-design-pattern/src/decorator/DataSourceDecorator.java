package decorator;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;// aggregation
    // aggregation ->  A contains B, if A dies B can still exist -> weak association
    // composition -> A contains B, if A dies B has no meaning or no life -> strong association

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
