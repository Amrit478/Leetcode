public class SORTracker {

    // Number of times get() has been called so far
    private int queries;
    
    // The left heap stores the top k best locations.
    // Its comparator is defined so that the smallest element (by our ranking) is at the top.
    private PriorityQueue<Location> left;
    
    // The right heap stores all other locations.
    // Its comparator ensures that the best candidate (to move into left) is at the top.
    private PriorityQueue<Location> right;
    
    // Helper class to store a location with its name and score.
    private static class Location {
        String name;
        int score;
        Location(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
    
    public SORTracker() {
        queries = 0;
        
        // In the left heap, we want the worst (kth best) among the top k to be at the top.
        // For equal scores, the location with the lexicographically larger name is considered "worse".
        left = new PriorityQueue<>((a, b) -> {
            if (a.score == b.score) {
                return b.name.compareTo(a.name);
            }
            return a.score - b.score;
        });
        
        // In the right heap, we want the best candidate among the remaining locations to be at the top.
        // For equal scores, the location with the lexicographically smaller name is considered better.
        right = new PriorityQueue<>((a, b) -> {
            if (a.score == b.score) {
                return a.name.compareTo(b.name);
            }
            return b.score - a.score;
        });
    }
    
    // Adds a new location.
    public void add(String name, int score) {
        Location loc = new Location(name, score);
        
        // Decide where to put the new location.
        if (!left.isEmpty() &&
            (loc.score > left.peek().score ||
            (loc.score == left.peek().score && loc.name.compareTo(left.peek().name) < 0))) {
            left.offer(loc);
        } else {
            right.offer(loc);
        }
        
        // Rebalance: maintain that left always contains exactly 'queries' locations.
        if (left.size() > queries) {
            right.offer(left.poll());
        } else if (left.size() < queries) {
            left.offer(right.poll());
        }
    }
    
    // Returns the kth best location, where k is the number of times get() has been called.
    public String get() {
        queries++;  // Increment query count (k)
        
        // If left doesn't have enough elements, move one from right to left.
        if (left.size() < queries) {
            left.offer(right.poll());
        }
        
        // The kth best location is at the top of left.
        return left.peek().name;
    }
    
    // Example usage and testing.
    public static void main(String[] args) {
        SORTracker tracker = new SORTracker();
        
        tracker.add("bradford", 2);
        tracker.add("branford", 3);
        System.out.println(tracker.get()); // 1st best location
        
        tracker.add("alps", 2);
        System.out.println(tracker.get()); // 2nd best location
        
        tracker.add("orland", 2);
        System.out.println(tracker.get()); // 3rd best location
        
        tracker.add("orlando", 2);
        System.out.println(tracker.get()); // 4th best location
        
        tracker.add("alpine", 2);
        System.out.println(tracker.get()); // 5th best location
    }
}
