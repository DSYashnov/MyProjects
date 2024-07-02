package work.chapter_8.dataInputStream;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(
                new FileOutputStream("my_test.bin"));
            DataInputStream dataInputStream = new DataInputStream(
                    new FileInputStream("my_test.bin"));
        ){
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeByte(5);
            dataOutputStream.writeChar('a');
            dataOutputStream.writeDouble(3.14);
            dataOutputStream.writeFloat(3.14f);
            dataOutputStream.writeInt(1);
            dataOutputStream.writeLong(1L);
            dataOutputStream.writeShort(3);

            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readByte());
            System.out.println(dataInputStream.readChar());
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readFloat());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readLong());
            System.out.println(dataInputStream.readShort());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
