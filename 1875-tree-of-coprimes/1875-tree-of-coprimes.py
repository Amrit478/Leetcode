
class Solution:
    def getCoprimes(self, nums: List[int], edges: List[List[int]]) -> List[int]:
        # Step 1: Build adjacency list representation of the tree
        tree = defaultdict(list)
        for u, v in edges:
            tree[u].append(v)
            tree[v].append(u)
        
        # Step 2: Initialize answer array and coprime tracking dictionary
        n = len(nums)
        ans = [-1] * n
        ancestor_dict = {}  # {value: (node, depth)}
        
        def dfs(node, parent, depth):
            # Find the closest coprime ancestor
            best_ancestor, best_depth = -1, -1
            for val, (anc_node, anc_depth) in ancestor_dict.items():
                if gcd(nums[node], val) == 1 and anc_depth > best_depth:
                    best_ancestor, best_depth = anc_node, anc_depth
            
            ans[node] = best_ancestor  # Store the closest coprime ancestor
            
            # Add current node's value to the ancestor tracking dictionary
            prev_entry = ancestor_dict.get(nums[node])  # Store previous value to backtrack later
            ancestor_dict[nums[node]] = (node, depth)
            
            # DFS traversal
            for neighbor in tree[node]:
                if neighbor == parent:  # Avoid revisiting the parent node
                    continue
                dfs(neighbor, node, depth + 1)
            
            # Backtrack: Remove current node's value after visiting children
            if prev_entry is None:
                del ancestor_dict[nums[node]]
            else:
                ancestor_dict[nums[node]] = prev_entry
        
        # Step 3: Start DFS from root node (0)
        dfs(0, -1, 0)
        
        return ans
