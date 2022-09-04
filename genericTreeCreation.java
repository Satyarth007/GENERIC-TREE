package aa;

import java.util.ArrayList;
import java.util.Stack;

class Node {
	// Generic Tree have one parent-many child relation
	/*
	 * each node have two parts:- 1. DATA PART (to store value) 2. LINK PART (to get
	 * linked hierarchically with their children)
	 * 
	 */
	int data;
	ArrayList<Node> children = new ArrayList<>();

}

public class genericTreeCreation {
	// ========================================================================================================
	// DISPLAY METHOD

	public static void display(Node node) {
		String str = node.data + " -> ";
		for (Node child : node.children) {
			str += child.data + " , ";
		}
		str += " ; ";
		System.out.println(str);
		for (Node child : node.children) {
			display(child);
		}
	}

	// ========================================================================================================
	// MAIN METHOD
	public static void main(String[] args) {
		// INPUT ARRAY
		int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
				-1 };

		// CREATING TREE
		Node root = null;
		Stack<Node> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				st.pop();
			} else {
				Node t = new Node();
				t.data = arr[i];
				if (st.size() > 0) {
					st.peek().children.add(t);
				} else {
					root = t;
				}
				st.push(t);
			}
		}

		display(root);
		
		mirroredTree.mirror(root);
		
		display(root);

	}
}
