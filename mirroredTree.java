package aa;

import java.util.Collections;

public class mirroredTree {

	public static void mirror(Node node) {
		for(Node child:node.children) {
			mirror(child);        // with each recursive call we will reverse the child nodes
		}
		Collections.reverse(node.children);   // reversing the child node
	}

}
