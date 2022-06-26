struct ListNode* swapNodes(struct ListNode* head, int k){
    int n;
    struct ListNode *ptr=head;
    for(int i=1;i<k;i++){
        ptr=ptr->next;
    }
    n=ptr->val;
    struct ListNode *current=head,*fast=ptr;
    while(fast->next!=NULL){
        current=current->next;
        fast=fast->next;
    }
    ptr->val=current->val;
    current->val=n;
    return head;
}