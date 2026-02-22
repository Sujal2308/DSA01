class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int res = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int high = 0; high < fruits.length; high++) {
            if (map.containsKey(fruits[high])) {
                int newCount = map.get(fruits[high]) + 1;
                map.put(fruits[high], newCount);
            } else {
                map.put(fruits[high], count);
            }

            while (map.size() > 2) {
                map.put(fruits[low], map.get(fruits[low]) - 1);

                if (map.get(fruits[low]) == 0) {
                    map.remove(fruits[low]);
                }

                low++;

            }
            res = Math.max(res, high - low + 1);

        }
        return res == -1 ? 1 : res;
    }
}
