import java.util.*;
public class Dijkstra
{
    public void dijkstra(int[][] graph,int source){
        int V=graph.length;
        int dist[]=new int[V];
        boolean[] visited =new boolean[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{source,0});
        while(!pq.isEmpty()){
            int[] current=pq.poll();
            int u= current[0];
            if (visited[u]) continue;
            visited[u]=true;
            for(int v=0;v<V;v++){
                if(!visited[v] && graph[u][v]!=0){
                    int newDist=dist[u]+graph[u][v];
                    if (newDist<dist[v]){
                        dist[v]=newDist;
                        pq.add(new int[]{v,dist[v]});
                    }
                }
            }
        }
        System.out.println("shortest dist:"+source+":");
        for(int i=0;i<V;i++){
            System.out.println("to vertex"+ i +"->"+dist[i]);
        }
}
	public static void main(String[] args) {
		int graph[][]={{0,10,0,0,0,0},
		{10,0,5,0,0,15},
		{0,5,0,20,2,0},
		{0,0,20,0,0,0},
		{0,0,2,0,0,1},
		{0,15,0,0,1,0}};
		Dijkstra dijkstra=new Dijkstra();
		dijkstra.dijkstra(graph,0);
}
}