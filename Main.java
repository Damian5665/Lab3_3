import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
  int i,a,sumaw=0,sumak=0;
    //int b = rand.nextInt(50+50) - 50;
    //System.out.print(b);
   int[][] znak = new int[11][11];
    for(i=0;i<11;i++)
      {
        for(a=0;a<11;a++)
          {
            if(a<10)
            {
            znak[i][a] = rand.nextInt(50+50) - 50;
            System.out.print(znak[i][a] + " ");
            sumaw += znak[i][a];
            }
            else
            {
              znak[i][a] = sumaw;
              System.out.print(" suma " + znak[i][a]);
              sumaw = 0;
            }
          }
          System.out.print("\n");
        }
    for(i=0;i<11;i++)
      {
        for(a=0;a<11;a++)
          {
            if(a<10)
            {
              sumak += znak[a][i];
            }
            else
            {
              znak[a][i] = sumak;
              System.out.print(" suma " + znak[i][a]);
              sumak = 0;
            }
          }
        }
  }
}