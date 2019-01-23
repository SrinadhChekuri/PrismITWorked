/**
 * 
 */
package com.prismitcorp.assignments.math;

/**
 * @author cheku
 *
 */
public class ImplementingTable implements Table {

	/**
	 * 
	 */
	public ImplementingTable() {
	}

	/* (non-Javadoc)
	 * @see com.prismitcorp.assignments.math.Table#even(int, int)
	 */
	@Override
	public void even(int num, int value) {
		try{
			System.out.println("even value table is: ");
			for(int i=value;i<=10;i++) {	
				if((i%2)==0) {
					System.out.printf("%d*%d=%d", num,i,num*i);
					System.out.println();
			}
			
			}
		}catch(Exception ae) {
			ae.printStackTrace();
			System.out.println("arthimatic exception occured");
		}

	}

	/* (non-Javadoc)
	 * @see com.prismitcorp.assignments.math.Table#odd(int, int)
	 */
	@Override
	public void odd(int num, int value) {
		
         try {
        	 System.out.println("odd value table is: ");
        	 for(int i=value;i<=10;i++) {
        		 if((i%2)!=0) {
            		 System.out.printf("%d*%d=%d", num,i,num*i);
            		 System.out.println();
     		}
        	 
        	 }
         }catch(Exception e) {
        	 System.out.println("arthematic exception occured");
         }
	}

	/* (non-Javadoc)
	 * @see com.prismitcorp.assignments.math.Table#totalTable(int, int)
	 */
	@Override
	public void totalTable(int num, int value) {
		try {
			System.out.println(" full table is: ");
              for(int i=value;i<=10;i++) {
            	  System.out.printf("%d*%d=%d",num,i,num*i);
            	  System.out.println();
              }
			
		}catch(Exception ae) {
			ae.printStackTrace();
			System.out.println("error occured");
		}

	}

}
