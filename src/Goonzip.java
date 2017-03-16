import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Goonzip { // 군집분석을 통한 데이터마이닝
   public static void main(String[] args) throws IOException {
      FileInputStream fpop = new FileInputStream("dong/groupdata.txt");
      FileOutputStream ffpop = new FileOutputStream("dong/cluster.txt");
      Scanner finput = new Scanner(fpop);
      double idata[][] = new double[100][100];
      double matrix[][] = new double[100][100];
      double kmatrix[][] = new double[100][100];
      String line[] = new String[10];
      int grouping[][][] = new int[100][100][100];
      int num = 0, lang = 0;
      double popin = 0, total = 0;

      // 초기 data 입력
      while (finput.hasNext()) {
         num++;
         line[num] = finput.nextLine();
         String pop[] = line[num].split(" ");
         lang = pop.length;
         for (int i = 1; i <= lang; i++) {
            idata[num][i] = Integer.parseInt(pop[i - 1]);
         }
      }

      // 표준화

      // 기본 테이블 구성 - 기본 거리행렬
      for (int i = 1; i <= num; i++) {
         for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= lang; k++) { // lang은 도시 수, num은 유저 숫자
               popin = Math.pow(idata[i][k] - idata[j][k], 2);
               total += popin;
            }
            matrix[i][j] = total; matrix[j][i] = total;
            kmatrix[i][j] = total;
            total = 0;
         }
      }
      for (int i = 1; i <= num; i++) {
         for (int j = 1; j <= i; j++) {
            System.out.print(kmatrix[i][j] + "      ");
         }
         System.out.println();
      }

      // <군집화> - 초기 개별 군집
      double min = 0;
      int gx = 0, gy = 0, tt = 1, gnum = 0;
      for (int i = 1; i <= num; i++) {
         grouping[1][i][1] = i;
         grouping[1][i][0] = 1;
      }
      
      do {
         // gnum번째 kmatrix의 군집간 최소 거리 산출
         min = 1000000;
         for (int i = 1; i <= num - gnum; i++) {
            for (int j = 1; j < i; j++) {
               if (min > kmatrix[i][j]) {
                  min = kmatrix[i][j];
                  gx = i;   gy = j;
               }
            }
         }
   
         // grouping배열에 군집 형태 저장
         gnum++;
         for (int i = 1; i <= grouping[gnum][gx][0]; i++) {
            grouping[gnum + 1][1][i] = grouping[gnum][gx][i];
         }
         for (int i = grouping[gnum][gx][0] + 1; i <= grouping[gnum][gx][0] + grouping[gnum][gy][0]; i++) {
            grouping[gnum + 1][1][i] = grouping[gnum][gy][i - grouping[gnum][gx][0]];
         }
         grouping[gnum + 1][1][0] = grouping[gnum][gx][0] + grouping[gnum][gy][0];         
         tt=1;   
         for (int i = 1; i <= num - gnum + 1; i++) {
            if (i != gx && i != gy) {
               tt++;
               for (int j = 1; j <= grouping[gnum][i][0]; j++) {
                  grouping[gnum + 1][tt][j] = grouping[gnum][i][j];
               }
               grouping[gnum + 1][tt][0] = grouping[gnum][i][0];
            }
         }
         
         // kmatrix 초기화
         for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
               kmatrix[i][j] =0;
            }
         }
         
         // gnum+1번째 kmatrix의 군집간 거리 행렬 산출
         for (int i = 1; i <= num-gnum; i++) {
            for (int j = 1; j <= i; j++) {
               if (i !=j ) {
                  for (int k = 1; k <=grouping[gnum+1][i][0]; k++) {
                     for (int l = 1; l <=grouping[gnum+1][j][0]; l++) {                  
                        popin = matrix[grouping[gnum+1][i][k]][grouping[gnum+1][j][l]];
                        total += popin;
                     }               
                  }
                  total = total / (grouping[gnum+1][i][0] * grouping[gnum+1][j][0]);
                  kmatrix[i][j] = total;
                  total=0;
               }
            }
         }
         
         System.out.println(" ");
         for (int i = 1; i <= num-gnum; i++) {
            for (int j = 1; j <= i; j++) {
               System.out.print(kmatrix[i][j] + "      ");
            }
            System.out.println();
         }
      } while(gnum <= num-1);
      
      System.out.println(); System.out.println();
      for (int i = 1; i <= num; i++) {
         System.out.println(i+"번째 군집의 형태");
         for (int j = 1; j <= num-i+1; j++) {
            for (int k=1;k <=grouping[i][j][0];k++) {
               System.out.print(grouping[i][j][k] + "   ");
            }
            System.out.println();
         }
         System.out.println();
      }
      // 출력할 부분 : matrix[][] --> 기본 거리행렬, grouping[][][] --> 군집형태추적
      
      /*
          for (int j = 1; j <= i; j++) {
              System.out.println(matrix[i][j]);
             ffpop.write("asdasd");
          }
       */
      
   }
}

// 커스터마이징쪽 알고리즘은 일단은 유저 유입시 grouping을 다시한다고 가정하고 작성. 러닝타임 등 제약 존재시 유클리드 거리가 가장 짧은 기존 유저의 세분그룹에 신규유저를 배치하는 것으로 가정  