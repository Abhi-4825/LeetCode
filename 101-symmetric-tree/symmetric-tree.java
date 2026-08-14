class Solution {
    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {

            int size = q.size();
            TreeNode[] arr = new TreeNode[size];

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                arr[i] = curr;

                if (curr != null) {
                    q.offer(curr.left);
                    q.offer(curr.right);
                }
            }

            int left = 0;
            int right = size - 1;

            while (left < right) {

                if (arr[left] == null && arr[right] == null) {
                    left++;
                    right--;
                    continue;
                }

                if (arr[left] == null || arr[right] == null)
                    return false;

                if (arr[left].val != arr[right].val)
                    return false;

                left++;
                right--;
            }
        }

        return true;
    }
}