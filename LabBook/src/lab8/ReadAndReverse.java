package lab8;

import java.io.*;

public class ReadAndReverse {
	public static void main(String[] args) {

		FileInputStream fis = null;
		RandomAccessFile raf = null;

		try {

			File in = new File("D:/Text/source.txt");
			fis = new FileInputStream(in);

			Reader r = new InputStreamReader(fis);
			File out = new File("D:/Text/target.txt");
			raf = new RandomAccessFile(out, "rw");
			raf.setLength(in.length());
			char[] buff = new char[1];
			long position = in.length();
			while ((r.read(buff)) > -1) {
				Character c = buff[0];
				String s = c + "";
				byte[] bBuff = s.getBytes();
				position = position - bBuff.length;
				raf.seek(position);
				raf.write(bBuff);
			}
			System.out.println("copied successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
			}
			try {
				raf.close();
			} catch (Exception e2) {
			}
		}

	}

}
