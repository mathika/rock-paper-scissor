import java.util.*;
class Game{
    int p1;
    int p2;
    int score;
    Game(int p1,int p2,int score){
        this.p1=p1;
        this.p2=p2;
        this.score=score;
    }
    void scissor(int m,int n){
        if(n==300){
            score+=1;
        }else if(n==100){
            score-=1;
        }
        else{
            score=score;
        }
    }
    void paper(int m,int n){
        if(n==100){
            score+=1;
        }else if(n==200){
            score-=1;
        }
        else{
           score=score;
        }
    }
    void rock(int m,int n){
        if(n==300){
            score-=1;
        }
        else if(n==200){
            score+=1;
        }
        else{
            score=score;
        }
    }
    
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Game g1=new Game(0,0,0);
      
        
        int k=sc.nextInt();
        int h=k;
        while(k>0){
            System.out.print("player 1:");
            int m=sc.nextInt();
            System.out.print("player 2:");
            int n=sc.nextInt();

            if(m==200){
                g1.scissor(m,n);
            }else if(m==300){
                g1.paper(m,n);
            }
            else{
                g1.rock(m,n);
            }
            k--;
        }
        if(g1.score>0){
            System.out.print("player 1 wins");
        }
        else if (g1.score ==0){
            System.out.print("drw match");
        }
        else{
            System.out.print("player 2 wins");;
        }
    }
}