package text5;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    public static void main(String[] ages) {
        Scanner input = new Scanner(System.in);
        System.out.println("***************学生的信息输入***************");
        System.out.println("1.姓名为:");
        String a = input.next();
        System.out.println("2.学号为：");
        int b = input.nextInt();
        System.out.println("3.性别为：");
        String c = input.next();
        System.out.println("4.班级为：");
        String d = input.next();
        System.out.println("5.年龄为：");
        int e = input.nextInt();
        Student students1 = new Student(a, b, c, d, e);
        String string1 = "";
        try {
            File file1 = new File("C:\\JAVA\\project\\src\\text5\\1.txt");
            char[] chars = new char[245];
            int n = 0;
            Reader in = new FileReader(file1);
            in.read(chars);
            while (n < chars.length) {
                string1 += chars[n];
                if ((n + 1) % 14 == 0) {
                    string1 += "。" + "\n";
                }
                else if ((n + 1) % 7 == 0) {
                    string1 += ",";
                }
                n++;
            }
            File file2 = new File("C:\\JAVA\\project\\src\\text5\\A.txt");
            Writer out = new FileWriter(file2);
            out.write(String.valueOf(students1));
            out.write(string1);
            out.flush();
            out.close();
        }
        catch (IOException Z) {
            System.out.println("File Error" + Z);
        }
        System.out.println("输入你想要查询的字或词");
        Scanner scanner1 = new Scanner(System.in);
        String s1 = scanner1.nextLine();
        Pattern pattern = Pattern.compile(s1);
        Matcher matcher = pattern.matcher(string1);
        if (matcher.find()) {
            int num = 1;
            while (matcher.find()) {
                num++;
            }
            System.out.println("该词出现的次数为" + num);
        } else {
            System.out.println("文本中没有该字符");
        }
    }
}