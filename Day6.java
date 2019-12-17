public static void main(String[] args) throws IOException {

        getNoOfOrbits("COM)B\n" +
                "B)C\n" +
                "C)D\n" +
                "D)E\n" +
                "E)F\n" +
                "B)G\n" +
                "G)H\n" +
                "D)I\n" +
                "E)J\n" +
                "J)K\n" +
                "K)L");

    }

    private static void getNoOfOrbits(String mapList) {

        Map<String, List<String>> hashMap = new HashMap<>();
        String[] mapListSplit = mapList.split("\n");

        for (String s : mapListSplit) {

            String[] elem = s.split("\\)");
            if( !hashMap.containsKey(elem[1]) ) {
                hashMap.put(elem[1], new ArrayList<>());
            }
            hashMap.get(elem[1]).add(elem[0]);

        }

        System.out.println(hashMap.toString());

        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += ancestors(hashMap, key).size();
        }
        System.out.println(sum);

    }

    private static List<String> ancestors(Map<String, List<String>> hashMap, String key) {
        List<String> nodes = new ArrayList<>();
        System.out.println(key);
        while(!key.equals("COM")) {
            key = hashMap.get(key).get(0); // sets key to parent if key is not equal to COM
            nodes.add(key);
        }
        return nodes;
    }
