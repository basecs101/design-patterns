package decorator;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String sayHello = "Hello Decorator";
        DataSource fileDataSource = new FileDataSource("hello.txt");
        DataSourceDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
        DataSourceDecorator compressionDecorator = new CompressionDecorator(encryptionDecorator);

        DataSourceDecorator compressionDecorator2 = new CompressionDecorator(fileDataSource);
        DataSourceDecorator encryptionDecorator2 = new EncryptionDecorator(compressionDecorator2);

        compressionDecorator.writeData(sayHello);// compress -> encrypt -> write to file
        encryptionDecorator2.writeData(sayHello);// encrypt -> compress -> write to file
        encryptionDecorator.writeData(sayHello);//encrypt -> write to file
        compressionDecorator2.writeData(sayHello);//compress -> write to file
        fileDataSource.writeData(sayHello);//plain

//        DataSourceDecorator dataSourceDecorator = new DataSourceDecorator(fileDataSource);
//        dataSourceDecorator.writeData(sayHello);
        fileDataSource.writeData(sayHello);


        DataSource plain = new FileDataSource("hello.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(compressionDecorator.readData());
    }
}