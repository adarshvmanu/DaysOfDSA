struct ListNode* removeNthFromEnd(struct ListNode* head, int n){
    struct ListNode *ptr;
    int len=0,loc;
    ptr=head;
    while(ptr->next!=NULL){
        ptr=ptr->next;
        len++;
    }
    loc=len-n+1;
    if(loc==0){
        head=head->next;
        return head;
    }
    ptr=head;
    while(loc>1){
        ptr=ptr->next;
        loc--;
    }
    ptr->next=ptr->next->next;
    return head;
}