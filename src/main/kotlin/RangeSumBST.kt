class RangeSumBST {
    class TreeNode(var `val`: Int = 0) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        return when {
            root == null -> {
                0
            }
            root.`val` in low..high -> {
                root.`val` + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
            }
            else -> {
                rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
            }
        }
    }

}