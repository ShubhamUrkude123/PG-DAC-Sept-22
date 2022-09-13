class Pattern13{
public static void main(String[] args){
   int asc=65;
   for(int i=5;i>=1;i--)
   {
       for(int j=1;j<i;j++)
		   
		   {
			System.out.print(" ");
			
			   
		   }
         for(int j=5;j>=i;j--)
		   
		   {
			System.out.print((char) (asc )+" ");
			
			   
		   }
           asc++;
           System.out.println();

   }

}
}