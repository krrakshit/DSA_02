public class adpract {
    import java.util.*;
public class students {
	    
    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("vineet", 275),
            new Student("shreya", 312),
            new Student("vishal", 195),
            new Student("kamanth", 275),
            new Student("rabin", 235),
            new Student("sandy", 205)
        );

        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        int maxMarks = students.get(0).marks;
        List<String> toppers = new ArrayList<>();

        for (Student student : students) {
            if (student.marks == maxMarks) {
                toppers.add(student.name);
            } else {
                break;
            }
        }

        if (toppers.size() == 1) {
            System.out.println("Unique topper: " + toppers.get(0));
        } else {
            System.out.println("Joint toppers: " + String.join(", ", toppers));
        }
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }

    public void fixList() {
        Node oddNode = null;
        Node evenNode = null;
        Node current = head;

        while (current != null) {
            if (current.data % 2 != 0) {
                oddNode = current;
            }
            current = current.next;
        }

        if (oddNode != null) {
            current = head;
            while (current != null) {
                if (current.data % 2 == 0) {
                    evenNode = current;
                    break;
                }
                current = current.next;
            }

            if (oddNode != null && evenNode != null) {
                int temp = oddNode.data;
                oddNode.data = evenNode.data;
                evenNode.data = temp;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList A = new LinkedList();
        LinkedList B = new LinkedList();

        int[] inputA = {150, 52, 26, 31, 12, 64};
        for (int num : inputA) {
            A.append(num);
        }

        int[] inputB = {23, 100, 7, 17, 3};
        for (int num : inputB) {
            B.append(num);
        }

        System.out.print("Original A: ");
        A.display();
        System.out.print("Original B: ");
        B.display();

        A.fixList();
        B.fixList();

        System.out.print("Updated A: ");
        A.display();
        System.out.print("Updated B: ");
        B.display();
    }
}

public class MostCommonHeight {
    public static void main(String[] args) {
        int h = 6;
        int[] deviations = {1, 0, -1, -2, 1, 2, 2, 1, 1, -1, 1, 0, -1, -1, 1};
        int numberOfCandidates = deviations.length;
        int[] heights = new int[numberOfCandidates];

        for (int i = 0; i < numberOfCandidates; i++) {
            heights[i] = h + deviations[i];
        }

        int[] heightCount = new int[101];

        for (int height : heights) {
            heightCount[height]++;
        }

        int mostCommonHeight = -1;
        int maxCount = 0;

        for (int i = 0; i < heightCount.length; i++) {
            if (heightCount[i] > maxCount) {
                maxCount = heightCount[i];
                mostCommonHeight = i;
            }
        }

        System.out.println("The most common height is: " + mostCommonHeight);
    }
}
}
