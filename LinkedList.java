public class LinkedList implements List{

		private Node head;
		private int count;
	
		public void addFront(int x){

			Node n = new Node(x);
			
			if(count == 0)
			{
				head = n;
				count++;
				return;
			}

			n.next = head;
			head = n;
			count++;

		}

		public void add2ndLast(int x){ // IE there will be one note between this one and the tail node... which oh by the way
						//dosent exist...

			//options: list is empty... or any of the other odd cases
			if(count < 3){
				addFront(x);
				return;
			}
			//list has one
			//
			//if(count == 1){
			//	addFront(x);
			//	return;
			//}
			//list has two
			//
			//if(count == 2){
			//	addFront(x);
			//	return;
			//}
			//list has more than two

			if(count > 2){
				Node crawler = head;
				while(crawler.next.next.next != null){ crawler = crawler.next;}
				
				Node n = new Node(x);
				n.next = crawler.next;
				crawler.next = n;

				count++;
				return;
			}
		}

		public void clear(){

			head = null;
			count = 0;


		}

		public String toString(){

			Node crawler = head;

			String line = "{";
			for(int i = 0; i < count; i++){
				if(i == count-1){
					line = line + crawler.item;
				}else{
				
				line = line + crawler.item + ",";
				crawler = crawler.next;

				}
			}
			line = line + "}";
			return line;
		}

} 
