import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        double score = getAverageScore(new Scanner(System.in));

        System.out.printf("당신의 점수는 %.2f점 입니다.%n", score);

        System.out.printf("당신은 %s 등급 입니다.", estimateGrade(score));

    }

    /**

     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :

     * 사용자가 0을 입력하기 전까지 계속해서 score에 숫자를 더해야 합니다.

     * 사용자가 0을 입력할 경우, while문을 break해야 합니다.

     */

    private static double getAverageScore(Scanner scanner) {

        int loop = 0;

        int score = 0;



        while (true) {

            System.out.println("점수를 입력하시오");

            int num = scanner.nextInt();



            if(num==0)

            {

                break;

            }else{

                score += num;

                loop++;

            }

        }

        return ((double)score)/((double)loop);

    }



    /**

     * 해당 메서드는 다음과 같은 역할을 가져야 합니다 :

     * 다중 if문을 활용하여 범위에 맞는 점수일 떄, 문자열을 반환해야 합니다.

     *

     * - 90점 이상은 "A"를 반환해야 합니다.

     * - 80점 이상은 "B"를 반환해야 합니다.

     * - 70점 이상은 "C"를 반환해야 합니다.

     * - 나머지는 "D"를 반환해야 합니다.

     *

     * @param averageScore 평균 점수

     */

    private static String estimateGrade(double averageScore) {



        if (averageScore >= 90) {

            return "A";

        } else if (averageScore >= 80) {

            return "B";

        } else if (averageScore >= 70) {

            return "C";

        } else if(averageScore<70) {

            return "D";

        }

        // 이와 같이, else문을 중첩하여 사용함으로써 이전 조건이 맞지 않는다는 가정의 성립이 가능합니다.

        return null;


    }

}
