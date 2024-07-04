package chapter_8.FileStream.bufferANDchannel;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample2 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
        FileChannel channel = file.getChannel();
        ) {
            ByteBuffer bufferedReader = ByteBuffer.allocate(5);
            channel.read(bufferedReader);
            bufferedReader.flip();
            System.out.println((char)bufferedReader.get());
            System.out.println((char)bufferedReader.get());
            System.out.println((char)bufferedReader.get());
            bufferedReader.rewind();
            System.out.println((char)bufferedReader.get());

            System.out.println("-----------------------------");
            bufferedReader.compact();
            channel.read(bufferedReader);
            bufferedReader.flip();
            while(bufferedReader.hasRemaining()) {
                System.out.println((char)bufferedReader.get());
            }
            System.out.println("-----------------------------");
            bufferedReader.clear();
            channel.read(bufferedReader);
            bufferedReader.flip();
            System.out.println((char)bufferedReader.get());
            bufferedReader.mark();
            System.out.println((char)bufferedReader.get());
            System.out.println((char)bufferedReader.get());
            bufferedReader.reset();
            while(bufferedReader.hasRemaining()) {
                System.out.println((char)bufferedReader.get());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
