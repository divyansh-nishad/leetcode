public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
         Set<Integer> keys = new HashSet<>();
         LinkedList<Integer> q = new LinkedList<>();
         q.add(0);
         keys.add(0);
         
         while(!q.isEmpty()) {
             int room = q.removeFirst();
             for(int key : rooms.get(room)) {
                 if(!keys.contains(key)) {
                     q.add(key);
                     keys.add(key);
                 }
             }
             if(keys.size() == n)
                 return true;
         }
         return false;
     }
    
}
