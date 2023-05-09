import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> A []; // 그래프 저장 인접리스트
    static int [] check; // 체크 배열
    static boolean [] visited; // 방문여부
    static boolean isEven; //  이분배열 판단
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i =0 ; i < T ;i++){ // test_case loop
            String[] s= br.readLine().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            A = new ArrayList[V+1]; // 노드의 갯수 만큼 초기화 노드는 시작이 인덱스 1 번부터 사용
            visited = new boolean[V+1];
            check = new int[V+1];
            isEven = true;
            for(int j = 1 ; j < V+1 ; j++){
                A[j] = new ArrayList<Integer>();
            }

            // 에지의 정보를 인접리스트에 저장하기
            for(int j = 0 ; j < E; j++){
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);

                // 방향이 명시되지 않아서 양방향으로 삽입
                A[start].add(end);
                A[end].add(start);
            }

            // 모든 노드가 연결 된것이 아니므로 모든 노드에 대해 DFS탐색
            for(int j = 1 ; j < V+1; j++){
                if(isEven){
                    DFS(j);
                }
                else { // 1개라도 아니면
                    break;
                }
            }
            if(isEven){ // 이분 그래프가 맞다.
                System.out.println("YES");
            } else System.out.println("NO");


        }

    }

    private static void DFS(int start) {
        visited[start] = true; // 탐색완료
        for(int i : A[start]){ // 인접리스트로 받아서 start에서 연결된 모든 노드를 탐색
            if(!visited[i]){
                // 직전 노드와 다른 집합으로 분류작업 0,1  1,2
                check[i] = (check[start]+1)%2; // 1,0 토글
                DFS(i);
            }
            else if(check[i] == check[start]){ // 이미 방문한 노드이면서 같은 집합인경우
                isEven = false;
            }
        }
    }
}
