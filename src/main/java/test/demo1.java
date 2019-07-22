package test;

import java.util.HashMap;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //定义用户数量
        int usernum = scanner.nextInt();
        HashMap user = new HashMap();
        int[] k = new int[usernum];
        for (int i = 0; i < usernum; i++) {
            k[i] = scanner.nextInt();
        }

        //将用户编号及好感度存入map中
        for (int i = 1; i <= usernum; i++) {
            user.put(i, k[i - 1]);
        }

        int snum = scanner.nextInt();//查找的组数
        int result;
        if (snum > 0) {
            while (scanner.hasNext()) {
                int[] tmp = new int[3];
                for (int i = 0; i < 3; i++) {
                    tmp[i] = scanner.nextInt();
                }

                result = search(user, tmp[0], tmp[1], tmp[2]);
                System.out.println(result);
                snum--;
                if (snum==0){
                    Thread.yield();
                }
            }
        }
    }

/**
 *查询方法
 * @return index;
 * */
    private static int search(HashMap user, int l, int r, int k) {
        int index = 0;
        for (int i = l; i <= r; i++) {
            if ((int) user.get(i) == k) {
                index++;
            }
        }
        return index;
    }

}
