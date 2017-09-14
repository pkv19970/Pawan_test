import java.util.*;
class DateEx
{
public static void main(String args[])
{
String str="pawan is go@od bo@y";
String[] str1=str.split("@",-3);
for(String a:str1)
System.out.println(a);
}
}