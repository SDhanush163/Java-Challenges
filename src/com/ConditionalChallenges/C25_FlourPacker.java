package com.ConditionalChallenges;

/*--------------------------------------------------------------------------------------------------
Managing Flour Pack Requirements With Limited Bucket Sizes
Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
The parameter bigCount represents the count of big flour bags (5 kilos each). The parameter
smallCount represents the count of small flour bags (1 kilo each).The parameter goal represents the
goal amount of kilos of flour needed to assemble a package. Therefore, the sum of the kilos of
bigCount and smallCount must be at least equal to the value of goal. The method should return true
if it is possible to make a package with goal kilos of flour. If the sum is greater than goal,
ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2,
and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be
divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true
because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are
additional bags left over. If any of the parameters are negative, return false.

EXAMPLE INPUT/OUTPUT:
canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is
                    4 kilos, and we have 1 bag left which is ok as mentioned above.
canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount
                    is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
canPack (-3, 2, 12); should return false since bigCount is negative.

NOTE: The method canPack should be defined as public static like we have been doing so far in the course.
--------------------------------------------------------------------------------------------------*/

public class C25_FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
        System.out.println(canPack (0, 5, 4));
        System.out.println(canPack (2, 2, 11));
        System.out.println(canPack(1, 0, 6));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int sum = 0, bigRecount = 0, smallRecount = 0;

        for (int i = 0; i < bigCount; i++) {
            if (sum + 5 <= goal) {
                sum += 5;
                bigRecount ++;
            }
            else break;
        }

        for (int i = 0; i < smallCount; i++) {
            if (sum + 1 <= goal) {
                sum += 1;
                smallRecount ++;
            }
            else break;
        }
        return  (!((bigRecount == 0) && (smallRecount == 0)) && (sum == goal));
    }

    // Alternate method
    public static boolean canPack2(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigCount * 5;
        if (totalBigWeight >= goal) {
            int remaining = goal % 5;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }

}
