class baseclass
{
public static void main(String[] args)
{
int[][] myNum={{1,2,3,4},{5,6,7},{8,9,10,11,12}};
int i,j;
for(i=0;i<myNum.length;i++)
{
for(j=0;j<myNum[i].length;j++)
{
System.out.print(myNum[i][j]+"\t");
}
System.out.println();
}
}
}

