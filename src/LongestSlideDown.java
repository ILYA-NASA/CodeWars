
public class LongestSlideDown {
    public static void main(String[] args) {
        System.out.println(longestSlideDown(
                new int[][]{{75},
                          {95, 64},
                        {17, 47, 82},
                      {18, 35, 87, 10},
                     {20, 4, 82, 47, 65},
                    {19, 1, 23, 75, 3, 34},
                  {88, 2, 77, 73, 7, 63, 67},
                {99, 65, 4, 28, 6, 16, 70, 92},
              {41, 41, 26, 56, 83, 40, 80, 70, 33},
            {41, 48, 72, 33, 47, 32, 37, 16, 94, 29},
          {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14},
        {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57},
      {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48},
    {63, 66, 4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31},
   {4, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 4, 23},
                }));
        System.out.println(longestSlideDown(
                new int[][]{{3},
                          {7, 4},
                         {2, 4, 6},
                        {8, 8, 9, 3}}));
    }

    public static int longestSlideDown(int[][] pyramid) {
        int[][] result = pyramid;
        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                result[i][j] = pyramid[i][j] + Math.max(pyramid[i + 1][j], pyramid[i + 1][j + 1]);
//                System.out.print(result[i][j] + " ");
            }
//            System.out.println();
        }
        return result[0][0];
    }

//    public static int longestSlideDown(int[][] p) {
//
//    for (int i = p.length - 1; i >= 1; i--)
//        for (int j = 0; j < i; j++)
//            p[i - 1][j] += Math.max(p[i][j], p[i][j + 1]);
//
//    return p[0][0];
//    }

//    скольжение сверху вниз по максимальным значениям
//    public static int longestSlideDown(int[][] pyramid) {
//        int result = pyramid[0][0];
//        int maxSlide;
//        int secondIndexMaxSlide = 0;
//        for (int i = 1; i < pyramid.length; i++) {
//            maxSlide = Math.max(pyramid[i][secondIndexMaxSlide], pyramid[i][secondIndexMaxSlide + 1]);
//            result += maxSlide;
//            if (maxSlide != pyramid[i][secondIndexMaxSlide]
//                    || pyramid[i][secondIndexMaxSlide] == pyramid[i][secondIndexMaxSlide + 1])
//                secondIndexMaxSlide++;
//        }
//        return result;
//    }
}
