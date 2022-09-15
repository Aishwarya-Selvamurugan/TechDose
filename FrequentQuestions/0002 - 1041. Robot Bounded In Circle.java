class Solution {
    public boolean isRobotBounded(String instructions) {
        int y=0,x=0;
        int d = 0;
        for(char c:instructions.toCharArray())
        {
            if(c == 'G')
            {
                if(d == 0)
                {
                    y++;
                }
                else if(d == 90)
                {
                    x--;
                }
                else if(d == 180)
                {
                    y--;
                }
                else
                {
                    x++;
                }
            }
            else if(c == 'L')
            {
                d = (d+90)%360;
            }
            else
            {
                d= (d-90+360)%360;
            }
        }
        return d != 0 || x==0&&y==0;
    }
}
