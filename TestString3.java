import java.util.Scanner;
class TestString3{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

if(args.length > 0){
	for(int i=0; i<args.length; i++){
String input1 = args[0];
String input2 = args[1];
String input3 = args[2];
System.out.println(input1 +" "+input2+" "+input3);
	}
}else{
System.out.println("Use Case added");
}
}
}