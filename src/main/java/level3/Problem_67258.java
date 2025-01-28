package level3;

import java.util.*;

public class Problem_67258 {
    public int[] solution(String[] gems) {
        List<String> gemList = Arrays.asList(gems);

        Set<String> gemSet = new HashSet<>(gemList);
        int totalGemTypes = gemSet.size();  // 보석 종류 수

        int startIdx = 0;
        int endIdx = 0;
        int resultStartIdx = 0;
        int resultEndIdx = 0;
        int minLength = Integer.MAX_VALUE;
        int prevEndIdx = 0;

        // 구간 내에 등장한 보석들의 수를 세는 맵
        Map<String, Integer> gemsInWindow = new HashMap<>();

        // 좌우 인덱스를 이동하여 최소 구간을 찾음
        while (true)
        {
            if (gemList.size() - startIdx < totalGemTypes // 남은 구간에서 모든 보석 종류를 포함할 수 없는 경우
                    || endIdx >= gemList.size()     // endIdx가 리스트 끝을 넘어갔거나
                    || startIdx > endIdx)           // startIdx가 endIdx보다 커지는 경우
            {
                break;
            }

            // endIdx 값이 변경되었거나 처음 시작 시 (endIdx = 0)
            if (endIdx != prevEndIdx || endIdx == 0) {
                // 현재 보석을 gemsInWindow 맵에 추가하거나 등장 횟수 증가
                gemsInWindow.put(gemList.get(endIdx), gemsInWindow.getOrDefault(gemList.get(endIdx), 0) + 1);
            }

            // prevEndIdx 값을 업데이트하여 endIdx 값 변경을 추적
            prevEndIdx = endIdx;

            // 구간 내에 모든 보석 종류가 다 포함되었는지 확인
            if (gemsInWindow.size() == totalGemTypes) {
                // 현재 구간이 최소 구간보다 짧으면 업데이트
                if (endIdx - startIdx < minLength) {
                    resultStartIdx = startIdx;
                    resultEndIdx = endIdx;
                    minLength = endIdx - startIdx;
                }
                // startIdx를 증가시켜 구간의 시작을 오른쪽으로 이동
                // 해당 보석이 한 번만 등장했다면 삭제, 그렇지 않으면 등장 횟수 감소
                if (gemsInWindow.get(gemList.get(startIdx)) == 1) {
                    gemsInWindow.remove(gemList.get(startIdx));
                } else {
                    gemsInWindow.put(gemList.get(startIdx), gemsInWindow.get(gemList.get(startIdx)) - 1);
                }
                // 구간 시작점을 한 칸 증가
                startIdx++;
            } else {
                // 구간이 아직 모든 보석을 포함하지 않으면 endIdx를 증가시켜 구간을 확장
                endIdx++;
            }
        }

        // 0부터 시작이기에 result index에 1을 더해 리턴
        return new int[]{resultStartIdx + 1, resultEndIdx + 1};
    }


    public static void main(String[] args) {
        Problem_67258 p = new Problem_67258();
        String[] gems1 = new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        String[] gems2 = new String[]{"AA", "AB", "AC", "AA", "AC"};
        String[] gems3 = new String[]{"XYZ", "XYZ", "XYZ"};
        String[] gems4 = new String[]{"ZZZ", "YYY", "NNNN", "YYY", "BBB"};

//        printAnswer(p.solution(gems1));
//        printAnswer(p.solution(gems2));
//        printAnswer(p.solution(gems3));
        printAnswer(p.solution(gems4));
    }

    public static void printAnswer(int[] answer) {
        System.out.println(answer[0] + ", " + answer[1]);
    }
}
