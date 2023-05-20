public class EvaluateDivision {
    HashMap<String, List<String>> map;
    HashMap<Pair<String, String>, Double> valMap;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        map = new HashMap();
        for (List<String> equation : equations) {
            if (map.containsKey(equation.get(0))) {
                map.get(equation.get(0)).add(equation.get(1));
            } else {
                map.put(equation.get(0), new ArrayList());
                map.get(equation.get(0)).add(equation.get(1));
            }
            if (map.containsKey(equation.get(1))) {
                map.get(equation.get(1)).add(equation.get(0));
            } else {
                map.put(equation.get(1), new ArrayList());
                map.get(equation.get(1)).add(equation.get(0));
            }
        }
        valMap = new HashMap();
        int index = 0;
        for (List<String> equation : equations) {
            valMap.put(new Pair<String, String>(equation.get(0), equation.get(1)), values[index]);
            index++;
        }
        index = 0;
        double Arr[] = new double[queries.size()];
        for (List<String> Query : queries) {
            HashSet<Pair<String, String>> edgeVis = new HashSet();
            Arr[index] = DFS(Query.get(0), Query.get(1), edgeVis);
            index++;
        }
        return Arr;
    }

    double DFS(String start, String end, HashSet<Pair<String, String>> edgeVis) {
        System.out.print(start + " ");
        if (!map.containsKey(start))
            return -1;
        if (start.equals(end))
            return 1;
        List<String> neigh = map.get(start);
        double ans = -1;
        for (String str : neigh) {
            if (edgeVis.contains(new Pair<String, String>(start, str))) {
                continue;
            }
            edgeVis.add(new Pair<String, String>(start, str));
            if (valMap.containsKey(new Pair<String, String>(start, str))) {
                double temp = DFS(str, end, edgeVis);
                if (temp != -1) {
                    ans = valMap.get(new Pair<String, String>(start, str)) * temp;
                }
            }
            if (valMap.containsKey(new Pair<String, String>(str, start))) {
                double temp = DFS(str, end, edgeVis);
                if (temp != -1) {
                    ans = (1 / valMap.get(new Pair<String, String>(str, start))) * temp;
                }
            }
        }
        return ans;
    }
}
