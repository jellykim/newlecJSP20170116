import java.util.Scanner;

public class CDOmok {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int enter_x = 0, enter_y = 0, swi = 0, restart=0;

      // 오목판 그리기

      char board[][] = new char[15][20];

         
      
      do{
      
      
         for (int y = 0; y < 15; y++)
            for (int x = 0; x < 20; x++) {
               if (x == 0 && y == 0)
                  board[y][x] = '┌';
               else if (x == 19 && y == 0)
                  board[y][x] = '┐';
               else if (x == 0 && y == 14)
                  board[y][x] = '└';
               else if (x == 19 && y == 14)
                  board[y][x] = '┘';
               else if (y == 0)
                  board[y][x] = '┬';
               else if (x == 19)
                  board[y][x] = '┤';
               else if (x == 0)
                  board[y][x] = '├';
               else if (y == 14)
                  board[y][x] = '┴';
               else
                  board[y][x] = '┼';
            }
   
         for (int y = 0; y < 15; y++) {
            for (int x = 0; x < 20; x++)
               System.out.printf("%c", board[y][x]);
            System.out.println();
         }
   
         
         // 오목 좌표 입력, 색상
         
         int w=0;
         
         gameover: while(true){
            
            
               
            do {
               swi=0;
               
               System.out.println(">오목입력(X Y)");
               System.out.println("오목입력 범위는(X= 0~19 , Y= 0~14)입니다");
               System.out.println("새로 시작하기는 (20 20)입니다");            
      
               enter_x = scan.nextInt();
               enter_y = scan.nextInt();
               
               if(enter_x == 20 && enter_y == 20){
                  restart=1;                  
                  break gameover;
                  
               }
               
                              
               char white = '○', black = '●';
               
               //중복 검사                        
               if((enter_x < 0 || enter_x >= 20) || (enter_y < 0 || enter_y >= 15)){
                  swi = 1;
                  System.out.println("그 자리에는 둘 수가 없습니다\n");
               }                  
               
               else if   (board[enter_y][enter_x]==white||board[enter_y][enter_x]==black)
                  System.out.println("<<이미 둔 자리입니다.>>");   
               
               else if ((enter_x >= 0 && enter_x < 20) && (enter_y >= 0 && enter_y < 15)) {
                              
                  if(w==0){
                     board[enter_y][enter_x]= white ;
                     w=1;                  
                  }   
                  
                  else if(w==1){
                     board[enter_y][enter_x]= black ;
                     w=0;               
                  }            
                  
               }            
                        
               
            }while (swi == 1);
                              
            for (int y = 0; y < 15; y++) {
               for (int x = 0; x < 20; x++)
                  System.out.printf("%c", board[y][x]);
                  System.out.println();
               }
            
            //승리 조건 
            char white = '○', black = '●';
            
            for(int y=0;y<15;y++){
               for(int x=0;x<20;x++){
                  if((x>=2&&x<=17)&&(y>=2&&y<=12)){
                     if((board[y][x-2]==white&&board[y][x-1]==white&&board[y][x]==white&&board[y][x+1]==white&&board[y][x+2]==white)||
                        (board[y-2][x]==white&&board[y-1][x]==white&&board[y][x]==white&&board[y+1][x]==white&&board[y+2][x]==white)||
                        (board[y-2][x-2]==white&&board[y-1][x-1]==white&&board[y][x]==white&&board[y+1][x+1]==white&&board[y+2][x+2]==white)||
                        (board[y+2][x-2]==white&&board[y+1][x-1]==white&&board[y][x]==white&&board[y-1][x+1]==white&&board[y-2][x+2]==white)){
                        System.out.println("백의 승리입니다.");
                        break gameover;
                     }
                     
                  
                     else if((board[y][x-2]==black&&board[y][x-1]==black&&board[y][x]==black&&board[y][x+1]==black&&board[y][x+2]==black)||
                              (board[y-2][x]==black&&board[y-1][x]==black&&board[y][x]==black&&board[y+1][x]==black&&board[y+2][x]==black)||
                              (board[y-2][x-2]==black&&board[y-1][x-1]==black&&board[y][x]==black&&board[y+1][x+1]==black&&board[y+2][x+2]==black)||
                              (board[y+2][x-2]==black&&board[y+1][x-1]==black&&board[y][x]==black&&board[y-1][x+1]==black&&board[y-2][x+2]==black)){
                        System.out.println("흑의 승리입니다.");
                        break gameover;
                     }
                  }
               }
            }            
         }
         
         
      }while(restart==1);
      
   }

}