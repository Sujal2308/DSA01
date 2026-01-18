public static int countWords(String s) {
        int count = 0;
        int whiteSpaceCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (whiteSpaceCount > 0) {
                    count++;
                    whiteSpaceCount = 0;
                }


            } else if (s.charAt(i) == ' ') {
                whiteSpaceCount++;
            }

        }
        if(s.charAt(0)!=' '){
            return count+1;
        }

        return count;
    }
