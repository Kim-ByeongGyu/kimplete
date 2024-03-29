public class TeamProblem5 {
    //팀별 회고 알고리즘 풀이 0329
    //프로그래머스 주사위 게임2
    public static int solution(int a, int b, int c){
        int answer=0;
        if(a!=b)
            if(b!=c)
                if(c!=a)
                    answer = a + b + c;
                else
                    answer = (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
            else
                answer = (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
        if(a==b)
            if(b==c)
                answer = (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2))*(int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
            else
                answer = (a+b+c)*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(2,6,1));
        System.out.println(solution(5,3,3));
        System.out.println(solution(4,4,4));
    }
}
