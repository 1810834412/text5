# 计191 高亮 2019310199
# 实验五 模拟学生作业处理

## 一、	实验目的
### 1.	掌握字符串String及其方法的使用
### 2.	掌握文件的读取/写入方法
### 3.	掌握异常处理结构

## 二、	文件处理部分要求
### 在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。
### 文件A包括学生的基本信息，学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法，实现如下功能：
#### 每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”	允许提供输入参数，统计古诗中某个字或词出现的次数，输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A，考虑操作中可能出现的异常，在程序中设计异常处理程序

#### 输入：汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列士可怜光采生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行<未完，待续>

#### 输出：
#### 汉皇重色思倾国，御宇多年求不得。
#### 杨家有女初长成，养在深闺人未识。
#### 天生丽质难自弃，一朝选在君王侧。
#### 回眸一笑百媚生，六宫粉黛无颜色。
#### 春寒赐浴华清池，温泉水滑洗凝脂。
#### 侍儿扶起娇无力，始是新承恩泽时。
#### 云鬓花颜金步摇，芙蓉帐暖度春宵。
#### 春宵苦短日高起，从此君王不早朝。
#### …………

## 三、	学生类部分要求：
### 1.	设计学生类（可利用之前的）；
### 2.	采用交互式方式实例化某学生；
### 3.	设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。

## 四、	实验流程
### 1.	建立学生类，要求如下：
#### 1)	创建字符串型变量name,Class,sex，创建整型变量Id，age。
#### 2)	利用toString来复写学生类，方便后面的写入文件。
### 2.	设计Test类，要求能够读取文件内容，如何处理文件中的内容，利用字符流来读取文件，以及用字符流来将字节转换为字符。
## 五、	核心代码
```
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
```
## 六、	实验结果
![实验结果截图1](https://github.com/1810834412/text5/blob/main/%E5%AE%9E%E9%AA%8C5%E7%BB%93%E6%9E%9C%E6%88%AA%E5%9B%BE.png)
## 七、	实验体会
### 通过了本次的java实验，首先我学会了如何进行文件信息的读写以及如何处理文件信息和利用正则来实现信息的处理查找字词，其次学会创建及使用数组。
