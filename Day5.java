private static int getParameters(int[] intCode, int pointer, int position) {
        String[] modes = String.format("%05d", intCode[pointer]).split("");
        boolean positionMode = modes[3 - position].equals("0");
        if(positionMode) {
            return intCode[ intCode[pointer + position] ];
        } else {
            return intCode[pointer + position];
        }
    }

    public static void main(String[] args) throws IOException {

        File file = new File("./src/assets/input.txt");
        BufferedReader br = null;
        br = new BufferedReader(new FileReader(file));

        String str;

        while ((str = br.readLine()) != null) {
            String[] stringCode = str.split(",");
            int[] intCode = Arrays.stream(stringCode).mapToInt(Integer::parseInt).toArray();

            boolean stop = false;
            int input = 5;

            for (int i = 0; i < intCode.length && !stop;) {
                int opCode = intCode[i] % 10;
                if(opCode == 9) opCode = 99;

                switch (opCode) {
                    case 1:
                        intCode[ intCode[i + 3] ] = getParameters(intCode, i, 1) + getParameters(intCode, i, 2);
                        i+=4;
                        break;
                    case 2:
                        intCode[ intCode[i + 3] ] = getParameters(intCode, i, 1) * getParameters(intCode, i, 2);
                        i+=4;
                        break;
                    case 3:
                        intCode[ intCode[i + 1] ] = input;
                        i+=2;
                        break;
                    case 4:
                        System.out.println(getParameters(intCode, i, 1) + " answer");
                        i+=2;
                        break;
                    case 5:
                        if( getParameters(intCode, i, 1) != 0 ) {
                            i = getParameters(intCode, i, 2);
                        } else {
                            i+=3;
                        }
                        break;
                    case 6:
                        if( getParameters(intCode, i, 1) == 0  ) {
                            i = getParameters(intCode, i, 2);
                        } else {
                            i+=3;
                        }
                        break;
                    case 7:
                        if( getParameters(intCode, i, 1) < getParameters(intCode, i, 2) ) {
                            intCode[intCode[i + 3]] = 1;
                        } else {
                            intCode[intCode[i + 3]] = 0;
                        }
                        i+=4;
                        break;
                    case 8:
                        if( getParameters(intCode, i, 1) == getParameters(intCode, i, 2) ) {
                            intCode[intCode[i + 3]] = 1;
                        } else {
                            intCode[intCode[i + 3]] = 0;
                        }
                        i+=4;
                        break;
                    case 99:
                        stop = true;
                        break;
                }
            }

        }
