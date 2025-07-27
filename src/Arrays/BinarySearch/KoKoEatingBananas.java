class KoKoEatingBananas{
  public int minEatingSpeed(int[] piles, int h) {
    int low = 1;
    int high = Arrays.stream(piles).max().getAsInt();
    int result = high;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        long hoursNeeded = perHourCapacity(piles, mid);

        if (hoursNeeded <= h) {
            result = mid;
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return result;
  }

  static long perHourCapacity(int[] piles, int k) {
    long sum = 0;
    for (int bananas : piles) {
        sum += (bananas + k - 1) / k; // Equivalent to ceil(bananas / k)
    }
    return sum;
  }

}