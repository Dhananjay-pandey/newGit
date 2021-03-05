class Add{
public static void main(String args[]){
/*float a,b,c;
a=Float.parseFloat(args[0]);
b=Float.parseFloat(args[1]);

c=a+b;
System.out.println("First number is  : "+a);
System.out.println("Second number is : "+b);
System.out.println("Sum is : "+c);*/

int a[] = {10,20,40,30,90,7,86,56};
int temp = 0,i,j;
for(i =0;i<a.length;i++){
for(j =i+1;j<a.length;j++){
if(a[i]>a[j]){
temp = a[i];
a[i] = a[j];
a[j] = temp;
}
}
}
for(i = 0; i<a.length;i++)
System.out.println("Sorted Array is : "+a[i]);
System.out.println("Second Largest number is : "+a[i-2]);

}
}
