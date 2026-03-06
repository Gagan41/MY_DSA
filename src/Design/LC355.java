package Design;
import java.rmi.server.UID;
import java.util.*;

public class LC355 {
    private static int time = 0;

    class Tweet{
        int id;
        int time;

        Tweet(int id, int time){
            this.id = id;
            this.time = time;
        }
    }

    HashMap<Integer, Set<Integer>> fmap;
    HashMap<Integer, List<Tweet>> tmap;

    public LC355(){
        fmap = new HashMap<>();
        tmap = new HashMap<>();
    }

    public void postTweet(int uId, int tId){
        tmap.putIfAbsent(uId,new ArrayList<>());
        tmap.get(uId).add(new Tweet(tId, time++));
    }

    public List<Integer> getNews(int uId){
        PriorityQueue<Tweet> pq = new PriorityQueue<>(
                (a, b) -> b.time - a.time
        );

        fmap.putIfAbsent(uId, new HashSet<>());
        fmap.get(uId).add(uId);

        for(int flw : fmap.get(uId)){
            if(tmap.containsKey(flw)){
                for(Tweet t: tmap.get(flw)){
                    pq.offer(t);
                }
            }
        }

        List<Integer> res = new ArrayList<>();
        int count = 10;

        while (!pq.isEmpty() && count-- > 0){
            res.add(pq.poll().id);
        }

        return res;
    }

    public void follow(int fId, int fwId){
        fmap.putIfAbsent(fId, new HashSet<>());
        fmap.get(fId).add(fwId);
    }

    public void unfollow(int fId, int fwId){
        if(fmap.containsKey(fId) && fId != fwId){
            fmap.get(fId).remove(fwId);
        }
    }
}
