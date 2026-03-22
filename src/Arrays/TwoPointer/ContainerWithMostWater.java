//https://leetcode.com/problems/container-with-most-water/
public class temp {
    public static void main(String[] args) {

        int[] arr1 = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr1));
    }

    public static int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(low<high){
            int wt = high-low;
            int ht = Math.min(height[low], height[high]);
            int area = wt*ht;
            list.add(area);
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
    }
