class TreeNode{
    data: number;
    left: TreeNode | null;
    right: TreeNode | null;

    constructor(item: number) {
        this.data = item;
        this.left = null;
        this.right = null;
    }
}

// FACTORY FUNCTION : 
function makeNode(data: number, left: TreeNode | null, right: TreeNode | null) {
    const root = new TreeNode(data);
    root.left = left;
    root.right = right;
    return root;
}

function initializeTree () {
    /**
     *              15
     *             /  \
     *            /    \
     *           /      \
     *         35        40
     *        /  \      /  \
     *       3    6    5    7
     *      / \       / \
     *     1   10    8   41
     */
    const rootNode = makeNode(
        15,
        makeNode(35,
            makeNode(3,
                makeNode(1, null, null),
                makeNode(10, null, null)
            ),
            makeNode(6, null, null)
        ),
        makeNode(
            40,
            makeNode(5,
                makeNode(8, null,null),
                makeNode(41, null, null)
            ),
            makeNode(7, null, null)
        )
    );
    console.log({rootNode});
    return rootNode;
}

/**
 * 
 * @param root 
 * @returns 
 * === Binary Tree Structure ===
 *
 *  └── 15
 *       ├── 35
 *       │   ├── 3
 *       │   │   ├── 1
 *       │   │   └── 10
 *       │   └── 6
 *       └── 40
 *           ├── 5
 *           │   ├── 8
 *           │   └── 41
 *           └── 7
 */
function printTree(root: TreeNode | null, prefix = "", isLeft=false): void {
    if(root === null) return;

    const data = root.data;
    const left = root.left;
    const right = root.right;
    
    const prtStr = prefix + (isLeft ? '├── ' : '└── ') + data;
    console.log(prtStr);

    if(left) {
        printTree(left, prefix+"    ", true);
    }
    if(right) {
        printTree(right, prefix+"    ", false);
    }
}

const tree = initializeTree();
console.log(tree);
console.log("=== Binary Tree Structure ===\n");
printTree(tree, );