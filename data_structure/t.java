static class node {
    int data;
    node next;
    node(int d){ data = d; }
}

static node insert(node head, int val){
    node n = new node(val);
    if(head == null) return n;
    node cur = head;
    while(cur.next != null) cur = cur.next;
    cur.next = n;
    return head;
}

static void display(node head){
    node c = head;
    while(c != null){
        System.out.print(c.data + " -> ");
        c = c.next;
    }
    System.out.println("null");
}

static node reverse(node head){
    node prev = null, cur = head;
    while(cur != null){
        node nxt = cur.next;
        cur.next = prev;
        prev = cur;
        cur = nxt;
    }
    return prev;
}

static node reorderList(node head){
    if(head == null || head.next == null) return head;

    // 1. Find middle
    node slow = head, fast = head;
    while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    // 2. Split + reverse second half
    node second = slow.next;
    slow.next = null;
    second = reverse(second);

    // 3. Weave using dummy
    node dummy = new node(0);
    node tail = dummy;
    node first = head, sec = second;

    while(first != null && sec != null){
        tail.next = first; first = first.next; tail = tail.next;
        tail.next = sec;   sec = sec.next;     tail = tail.next;
    }
    if(first != null) tail.next = first; else tail.next = null;

    return dummy.next;
}

public static void main(String[] args){
    java.util.Scanner sc = new java.util.Scanner(System.in);
    node head = null;
    System.out.println("Enter list values (end with -1):");
    while(sc.hasNextInt()){
        int v = sc.nextInt();
        if(v == -1) break;
        head = insert(head, v);
    }
    System.out.println("Original:");
    display(head);
    head = reorderList(head);
    System.out.println("Reordered:");
    display(head);
    sc.close();
}