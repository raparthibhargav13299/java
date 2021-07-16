class Node
{
    MusicItem musicItem;
    Node next;
    Node prev;
    Node(MusicItem word)
    {
        this.musicItem=word;
        this.next=null;
        this.prev=null;
    }
}