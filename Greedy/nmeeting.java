package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class nmeeting {
    static class Meeting{
        int start,end;
        Meeting(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public int maxMeetings(int[] start, int[] end) {
    if (start.length != end.length) {
        throw new IllegalArgumentException("Start and end arrays must be of the same length.");
    }

    int n = start.length;
    List<Meeting> meetings = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        meetings.add(new Meeting(start[i], end[i]));
    }

    // Sort by end time
    meetings.sort(Comparator.comparingInt(a -> a.end));

    int count = 0;
    int lastEnd = -1;

    for (int i = 0; i < n; i++) {
        if (meetings.get(i).start > lastEnd) {
            count++;
            lastEnd = meetings.get(i).end;
        }
    }

    return count;
}

    
}

