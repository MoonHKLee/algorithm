package CodeForce.t02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseCount = Integer.parseInt(br.readLine());
        System.out.println(testCaseCount);

        for (int i = 0; i < testCaseCount; i++) {
            String[] split = br.readLine().split(" ");
            int number = Integer.parseInt(split[1]);
            int lCount = 0;
            int answer = 0;
            String s = br.readLine();
            StringBuilder builder = new StringBuilder(s);
            for (int j = 0; j < builder.length(); j++) {
                if(builder.charAt(j) == 'L') {
                    lCount++;
                }
            }

            //logic
            while(number > 0 && lCount > 0) {
                if(builder.length()<3) {
                    for (int j = builder.length() - 1; j >= 0; j--) {
                        if (builder.charAt(j) == 'L') {
                            builder.replace(j, j + 1, "W");
                            number--;
                            lCount--;
                            break;
                        }
                    }
                } else {
                    for (int j = 1; j < builder.length()-1; j++) {
                        if((builder.charAt(j-1) == 'W') && (builder.charAt(j+1) == 'W') && builder.charAt(j)=='L') {
                            builder.replace(j,j+1,"W");
                            number--;
                            lCount--;
                            break;
                        }
                    }
                    for (int j = builder.length()-1; j >= 0; j--) {
                        if(j==0) {
                            if(builder.charAt(0)=='L') {
                                builder.replace(0,1,"W");
                                number--;
                                lCount--;
                                break;
                            }
                        }
                        if(builder.charAt(j-1)=='W') {
                            if(builder.charAt(j) == 'L') {
                                builder.replace(j,j+1,"W");
                                number--;
                                lCount--;
                                break;
                            }
                        }
                    }
                    if(number <= 0 || lCount <= 0) {
                        break;
                    }
                }
            }
            System.out.println(builder);
            if(builder.charAt(0)=='W') {
                answer++;
            }

            for (int j = 1; j < builder.length(); j++) {
                if(builder.charAt(j)=='W') {
                    if((builder.charAt(j-1) == 'W')) {
                        answer+=2;
                    } else {
                        answer++;
                    }
                }
            }

            bw.write(answer+"\n");
        }
        bw.flush();
        bw.close();
    }
}
