class Solution {
    class Node
    {
        int time;
        int x,y;
        Node(int time,int x,int y)
        {
            this.time = time;
            this.x = x;
            this.y = y;
        }
    }
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<Node> q = new LinkedList<>();
        int count = 0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j] == 2)
                {
                    Node n = new Node(0,i,j);
                    q.add(n);
                }
            }
        }
        while(!q.isEmpty())
        {
            Node curr = q.peek();
            if(curr.x+1 < r && grid[curr.x+1][curr.y] == 1)
            {
                grid[curr.x+1][curr.y] = 2;
                Node n = new Node(curr.time+1,curr.x+1,curr.y);
                q.add(n);
            }
            if(curr.x-1 >= 0 && grid[curr.x-1][curr.y] == 1)
            {
                grid[curr.x-1][curr.y] = 2;
                Node n = new Node(curr.time+1,curr.x-1,curr.y);
                q.add(n);
            }
            if(curr.y+1 < c && grid[curr.x][curr.y+1] == 1)
            {
                grid[curr.x][curr.y+1] = 2;
                Node n = new Node(curr.time+1,curr.x,curr.y+1);
                q.add(n);
            }
            if(curr.y-1 >= 0 && grid[curr.x][curr.y-1] == 1)
            {
                grid[curr.x][curr.y-1] = 2;
                Node n = new Node(curr.time+1,curr.x,curr.y-1);
                q.add(n);
            }
            count = curr.time;
            q.poll();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j] == 1)
                {
                    return -1;
                }
            }
        }
        return count;
    }
}

/*
TC: O(N)
*/
