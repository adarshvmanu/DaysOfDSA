struct TreeNode* searchBST(struct TreeNode* root, int val){
    struct TreeNode* ptr=root;
     while(ptr){
        if(ptr->val==val) 
            return ptr;
        else if(ptr->val>val &&ptr->left) 
            ptr=ptr->left;
        else if(ptr->right) 
            ptr=ptr->right;
        else return NULL;
    }
    return NULL;
}