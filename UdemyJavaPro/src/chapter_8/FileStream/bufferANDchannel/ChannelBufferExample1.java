package chapter_8.FileStream.bufferANDchannel;


import java.io.*;
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

            String text = "\nThere are only two ways to live your life."
            + "One is as though nothing is a miracle. The other is as" +
                    " though everything is a miracle.";

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);
//
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
//            buffer2.put(text.getBytes());
//            buffer2.flip();
//            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
