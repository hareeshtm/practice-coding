package Arrays;

import java.util.Scanner;

public class Game2 {

	public static boolean canWin(int leap, int[] game) {
        int index=0;
        for(;index<game.length;index++)
        {
        	if(game[index]==0)
        	{
        		if(index+leap>=game.length)
        			return true;
        		else
        		{
        			
        		}
//        		else
//            	{
//            		int i=0;
//            		for( i=index+leap;i<game.length;i++)
//           			{
//           				if(game[i]==1)
//           					return false;
//           			}
//            		if(i==game.length)
//           			return true;//if all are zeros
//           		}
            	
        	}
        
        	else
        	{
        		if(game[index-1]==0)
            	{
            		if(index-1+leap<game.length)
            		{
            			index=index-1+leap;
//            			int i=0;
//            			for( i=index-1+leap;i<game.length;i++)
//            			{
//            				if(game[i]==1)
//            					return false;
//            				
//            			}
//            			if(i==game.length)
//                   			return true;//if all are zeros
            		}
            	}
        	}
        	
        		      			
        }
      return false;       	
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

	


