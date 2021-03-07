package com.company;

public class IntersectTwo {
    public Node getIntersectionNode(Node headA, Node headB) {
        int len1 = 0;
        int len2 = 0;
        Node p1=headA, p2=headB;
        if (p1 == null || p2 == null)
            return null;

        while(p1 != null){
            len1++;
            p1.setNext(p1);
        }
        while(p2 !=null){
            len2++;
            p2.setNext(p2);
        }

        int diff = 0;
        p1=headA;
        p2=headB;

        if(len1 > len2){
            diff = len1-len2;
            int i=0;
            while(i<diff){
                p1.setNext(p1);
                i++;
            }
        }else{
            diff = len2-len1;
            int i=0;
            while(i<diff){
                p2.setNext(p2);
                i++;
            }
        }

        while(p1 != null && p2 != null){
            if(p1.getValue() == p2.getValue()){
                return p1;
            }
            p1 = p1.getNext();
            p2 = p2.getNext();
        }

        return null;
    }
}
