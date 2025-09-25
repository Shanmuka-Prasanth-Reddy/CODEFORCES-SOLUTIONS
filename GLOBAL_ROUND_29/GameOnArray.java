import java.util.*;

public class GameOnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Long, Long> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long val = sc.nextLong();
                if (val > 0) {
                    m.put(val, m.getOrDefault(val, 0L) + 1);
                }
            }
            PriorityQueue<Map.Entry<Long, Long>> pq = 
                new PriorityQueue<>((a, b) -> {
                    if (!a.getValue().equals(b.getValue())) {
                        return b.getValue().compareTo(a.getValue());
                    }
                    return b.getKey().compareTo(a.getKey());
                });

            for (Map.Entry<Long, Long> entry : m.entrySet()) {
                pq.add(entry);
            }

            long aliceScore = 0;
            long bobScore = 0;
            boolean turn1 = true;

            while (!pq.isEmpty()) {
                Map.Entry<Long, Long> current = pq.poll();
                long value = current.getKey();
                long cnt = current.getValue();
                
                if (m.get(value) == null || !m.get(value).equals(cnt)) {
                    continue;
                }
                
                if (turn1) {
                    aliceScore += cnt;
                } else {
                    bobScore += cnt;
                }

                m.remove(value);

                if (value > 1) {
                    m.put(value - 1, m.getOrDefault(value - 1, 0L) + cnt);
                    pq.add(new AbstractMap.SimpleEntry<>(value - 1, m.get(value - 1)));
                }

                turn1 = !turn1;
            }

            System.out.println(aliceScore + " " + bobScore);
        }
    }
}