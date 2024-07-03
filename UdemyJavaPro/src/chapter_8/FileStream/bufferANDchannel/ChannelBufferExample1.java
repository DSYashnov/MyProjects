package chapter_8.FileStream.bufferANDchannel;

import chapter_8.FileStream.file.FileExample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample1 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test2.txt", "rw")){
            FileChannel channel = file.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stih = new StringBuilder();

            channel.read(buffer);
            int bytesRead = channel.read(buffer);
            while (bytesRead != -1) {
                System.out.println("read " + bytesRead);

                buffer.flip();
                while (buffer.hasRemaining()) {
                    stih.append((char) buffer.get());
                }
                buffer.clear();
                bytesRead = channel.read(buffer);
            }
            System.out.println(stih);

            String text = "Hello";

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
