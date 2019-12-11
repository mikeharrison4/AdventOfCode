List<String> possiblePasswords = new ArrayList<>();

        boolean bPossible = false;

        for (int i = 372037; i < 905157; i++) {

            String strPassword = Integer.toString(i);

            for(int j = 0; j < strPassword.length() - 1; j++) {
                if( strPassword.charAt(j) <= strPassword.charAt(j + 1)) {
                    bPossible = true;
                } else {
                    bPossible = false;
                    break;
                }
            }

            if(bPossible) {
                if(strPassword.charAt(0) == strPassword.charAt(1) || strPassword.charAt(1) == strPassword.charAt(2) || strPassword.charAt(2) == strPassword.charAt(3) || strPassword.charAt(3) == strPassword.charAt(4)
                || strPassword.charAt(4) == strPassword.charAt(5)) {
                    possiblePasswords.add(strPassword);
                }
            }

        }

        System.out.println(possiblePasswords.size()); // part1

        List<String> emptyList = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < possiblePasswords.size(); i++) {

            String refinedPassword = possiblePasswords.get(i);

            for (int j = 0; j < refinedPassword.length(); j++) {
                if( map.containsKey(refinedPassword.charAt(j)) ) {
                    map.put(refinedPassword.charAt(j), map.get(refinedPassword.charAt(j)) + 1 );
                } else {
                    map.put(refinedPassword.charAt(j), 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry.getValue() == 2) {
                    if(!emptyList.contains(refinedPassword)) {
                        emptyList.add(refinedPassword);
                    }
                }
            }

            map.clear();

        }

        System.out.println(emptyList.size()); // part2
