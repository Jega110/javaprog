class Constructorp {
int result; // Parameterized constructor
Constructorp(int a, int b) {
result = a + b;
}
public static void main(String args[]) {
int x = 5;
int y = 10;
Constructorp obj = new Constructorp(x, y);
System.out.println("The result: " + obj.result);
}
}
