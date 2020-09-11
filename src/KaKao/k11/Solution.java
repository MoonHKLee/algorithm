package KaKao.k11;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    static int AUTO_INCREASE;
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
        System.out.println(solution.solution("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"}));
        System.out.println(solution.solution("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
    }

    public String solution(String m, String[] musicinfos) {
        AUTO_INCREASE = 1;
        List<Song> answers = new ArrayList<>();
        String replace = replace(m);
        List<Song> songs = getSongResult(musicinfos);
        for (Song song : songs) {
            if(song.melody.contains(replace)) {
                answers.add(song);
            }
        }
        if(answers.size()==0){
            return "(None)";
        }

        return answers.stream().sorted().collect(Collectors.toList()).get(0).title;
    }

    private List<Song> getSongResult(String[] musicinfos) {
        List<Song> list = new ArrayList<>();
        for (String musicinfo : musicinfos) {
            String[] split = musicinfo.split(",");
            int playTime = getPlayTime(split[0], split[1]);
            String melody = getMelody(replace(split[3]), playTime);
            list.add(new Song(AUTO_INCREASE,playTime, split[2], melody));
            AUTO_INCREASE++;
        }
        return list;
    }

    private String getMelody(String s, int playTime) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < playTime; i++) {
            builder.append(s.charAt(i % s.length()));
        }
        return builder.toString();
    }

    public int getPlayTime(String start, String end) {
        String[] split1 = start.split(":");
        LocalTime startTime = LocalTime.of(Integer.parseInt(split1[0]),Integer.parseInt(split1[1]),0,0);
        String[] split2 = end.split(":");
        LocalTime endTime = LocalTime.of(Integer.parseInt(split2[0]),Integer.parseInt(split2[1]),0,0);
        Duration duration = Duration.between(startTime,endTime);

        return (int) duration.getSeconds() / 60;
    }

    public String replace(String melody) {
        return melody.replace("C#","1")
                .replace("D#","2")
                .replace("F#","3")
                .replace("G#","4")
                .replace("A#","5");
    }

}

class Song implements Comparable<Song> {
    int id;
    int playTime;
    String title;
    String melody;

    public Song(int id, int playTime, String title, String melody) {
        this.id = id;
        this.playTime = playTime;
        this.title = title;
        this.melody = melody;
    }

    @Override
    public int compareTo(Song o) {
        if(this.playTime < o.playTime) {
            return 1;
        }else if(this.playTime == o.playTime) {
            if(this.id > o.id) {
                return 1;
            }
        }
        return -1;
    }
}
