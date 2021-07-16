class SinglyLinkedList
{
    Node head=null;
    Node tail = null;
    public Node words(Word w)
    {
        Node next = head;
        while(next!=null)
        {
            if(next.word.word.equals(w.word))
            {
                return next;
            }
            next=next.node;
        }
        return null;
    }
    public void insertAt(Word word)
    {
        Node node=new Node(word);
        if (head==null) 
        {
            head=node;
        }
        if(words(word)!=null)
        {
            words(word).word.no_of_occ++;
        }
        else
        {
            Node temp=head;
            while(temp.node!=null)
            {
                temp=temp.node;
            }
            temp.node=node;
        }
    }
    public void sortNode()
    {
        Node temp = head , iNode=null;
        Word w;
        if(head==null)
        {
            return;
        }
       while(temp.node!=null)
       {
           iNode=head;
           while(iNode.node!=null)
           {
               if(iNode.word.word.compareToIgnoreCase(iNode.node.word.word)>0)
               {
                   w=temp.word;
                   temp.word=iNode.word;
                   iNode.word=w;
               }
               iNode=iNode.node;
           }
           temp=temp.node;
       }
    } 
    public void reverseNode(Node rev)
    {
        if(rev==null)
        {
            return;
        }
        reverseNode(rev.node);
        System.out.println(rev.word.word);
    }
    public void showFreqWords() 
    {
        Node temp = head ; 
        if(head==null || head.node==null)
        {return;}
        while(temp.node!=null)
        {
            Node flag = temp , next = temp;
            while(flag!=null)
            {
                if(flag.word.no_of_occ>next.word.no_of_occ && next.word.word.compareToIgnoreCase(flag.word.word)>0)
                {
                    next=flag;
                } 
                flag=flag.node;
            }
            Word w = temp.word;
            temp.word=next.word;
            next.word=w;
            temp=temp.node;
        }
    }
    public void showWordList()
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.println(temp.word.word);
            System.out.println(temp.word.no_of_occ);
            temp=temp.node;
        }
    }
}