class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int size = position.length;
        if(size == 1){
            return 1;
        }
        int[][] cars = new int[size][2];

        for (int i = 0; i < size; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0] ));

        int groups = 1;

        double fleetTime = (double) (target - cars[0][0]) / cars[0][1];
        for (int i = 1; i < size; i++) {
            double time = (double) (target - cars[i][0]) / cars[i][1];

            if (time > fleetTime) {
                groups++;
                fleetTime = time;
            }
        }

        return groups == 0 ? 1 : groups;
    }
}
