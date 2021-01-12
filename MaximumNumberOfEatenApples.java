class Solution {
    class Pair
    {
        int a;
        int d;
        Pair(int a,int d)
        {
            this.a=a;
            this.d=d;
        }
    }
    public int eatenApples(int[] apples, int[] days) {
        Comparator co=new Comparator<Pair>()
        {
            public int compare(Pair a1,Pair a2)
            {
                return a1.d-a2.d;
            }
        };
        int count=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>(co);
        int i=0;
        for(i=0;i<apples.length;i++)
        {
            pq.add(new Pair(apples[i],i+days[i]));
            while(!pq.isEmpty() && pq.peek().d<=i)
                pq.poll();
            if(pq.size()>0)
            {
                Pair p1=pq.poll();
                int ap=p1.a;
                int dd=p1.d;
                count++;
                ap--;
                if(ap>0)
                {
                    pq.add(new Pair(ap,dd));
                }
                
                
                
                
            }
        }
        while(!pq.isEmpty())
        {
            while(!pq.isEmpty() && pq.peek().d<=i)
                pq.poll();
            if(pq.size()>0)
            {
                Pair p1=pq.poll();
                int ap=p1.a;
                int dd=p1.d;
                count++;
                ap--;
                if(ap>0)
                {
                    pq.add(new Pair(ap,dd));
                }
                i++;
        }}
            return count;
        
    }
}