    part2( stringCode, intCode, 19690720);

    private static int part2(String[] stringCode, int[] intCode, int expectedNum) {

        int answer = 0;

        for (int noun = 0; noun < 100; noun++) {
            for(int verb = 0; verb < 100; verb++) {
                int result = part1(stringCode, intCode, noun, verb);

                if(result == expectedNum) {
                    answer = 100 * noun + verb;
                    break;
                }

            }
        }

        return answer;
    }
