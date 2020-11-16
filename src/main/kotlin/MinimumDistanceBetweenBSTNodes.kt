class MinimumDistanceBetweenBSTNodes {
    var result = Int.MAX_VALUE
    var previous: Int? = null

    fun minDiffInBST(root: RangeSumBST.TreeNode?): Int {

        if (root!!.left != null) {
            minDiffInBST(root.left)
        }
        if (previous != null) {
            result = result.coerceAtMost(root.`val` - previous!!)
        }
        previous = root.`val`
        if (root.right != null) {
            minDiffInBST(root.right)
        }
        return result
    }

}