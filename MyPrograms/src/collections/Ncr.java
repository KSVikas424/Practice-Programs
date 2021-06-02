package collections;
import java.util.*;
public class Ncr {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        TreeMap sm = new TreeMap();
	        int tstcs=scan.nextInt();
	        for(int i=1;i<tstcs;i++){
	            Integer ke=new Integer(scan.nextInt());
	            sm.put(ke,ke*tstcs);
	        }
	        Set keyset = sm.keySet();
	        HashSet hs= new HashSet();
	        Iterator i= keyset.iterator();
	        int keysum=0;
	        while (i.hasNext()){
	            keysum= keysum+(Integer)i.next();
	        }
	        Collection valueSum= sm.values();
	        i=valueSum.iterator();
	        int value=0;
	        while(i.hasNext()) {
	        	value=(Integer)i.next();
	        	if(value > keysum) {
	        		break;
	        	}
	        }
	        Object o=1;
	        Collection valueSu= sm.values();
	        i=valueSu.iterator();
	        for(int j=0;j<sm.size();j++) {
	        	o=sm.get(value);
	        	   System.out.println(o);
	        	if(value> (Integer)i.next()) {
	        		break;
	        	}
	        }
	        System.out.println(o);
	}

}