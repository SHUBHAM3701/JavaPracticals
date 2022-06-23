class NestedForLoop
{
public static void main(String args[])
{

int column;

for (int row=1;row<=5;row++)
{
for (column=1;column<=row;column++)
{
System.out.print("*");
}
System.out.println();
}
}
}
