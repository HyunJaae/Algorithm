package algorithm.programmers.hash;

public class Camouflage {

    public static int solution(String[][] clothes) {
        int answer = 0;
        String first = clothes[0][0];
        System.out.println(first);
        return answer;
    }

    public static void main(String[] args) {
        String[][] participant = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(participant));
    }
}