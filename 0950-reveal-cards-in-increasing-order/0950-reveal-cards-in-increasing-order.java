import java.util.*;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        
        // Step 1: Sort the deck
        Arrays.sort(deck);
        
        // Step 2: Create a queue of indices
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }
        
        // Step 3: Place each card in the correct position
        for (int card : deck) {
            int index = queue.poll();   
            result[index] = card;    
            
            if (!queue.isEmpty()) {
                queue.offer(queue.poll()); 
            }
        }
        
        return result;
    }
}