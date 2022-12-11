class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
 
    if (nums.size() == 0) {return 0;}  
        
    int valid_size = 0;    
        
    for(int i = 0; i < nums.size(); i++) {
                
        if (val != nums.at(i)) {
            nums.at(valid_size) = nums.at(i);
            valid_size++;
        }
        
    }
    
    return valid_size;
}
};
