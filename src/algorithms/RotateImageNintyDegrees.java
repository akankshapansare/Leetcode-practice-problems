package algorithms;

/**
 * Created by akanksha on 2/5/2018.
 */
public class RotateImageNintyDegrees {
    public static void main(String[] args) {

        int image[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int N = 4;

        System.out.println("Image image");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

        for (int layer = 0; layer < N / 2; layer++) {
            int first = layer;
            int last = N - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = image[first][i];
                image[first][i] = image[last - offset][first];
                image[last - offset][first] = image[last][last - offset];
                image[last][last-offset] = image[i][last];
                image[i][last] = top;
            }
        }

        System.out.println("Image image after rotating each pixel to 90 degrees");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
