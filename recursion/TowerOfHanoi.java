public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from + " to rod " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }
    public static void main(String[] args){
        int n=3;
        System.out.println("The sequence of moves involved in the Tower of Hanoi are: for number of disks "+n);
        System.out.println("\n");
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}
