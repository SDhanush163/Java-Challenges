package com.BasicChallenges;

/*--------------------------------------------------------------------------------------------------
Designing A 'Playing Cat' Logic Program To Refine Conditional Implementation
The cats spend most of the day playing. In particular, they play if the temperature is between 25
and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35. Write
a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is
playing, otherwise return false

1st parameter should be of type boolean and be named summer it represents if it is summer.
2nd parameter represents the temperature and is of type int with the name temperature.

EXAMPLES OF INPUT/OUTPUT:
isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35
                        (summer parameter is false)
isCatPlaying(false, 35); should return true since temperature is in range 25 - 35

NOTES
The isCatPlaying method needs to be defined as public static ​like we have
been doing so far in the course.
--------------------------------------------------------------------------------------------------*/

public class C12_PlayingCat {
    public static void main(String[] args) {
        System.out.println("Is cat playing: " + isCatPlaying(true, 10));
        System.out.println("Is cat playing: " + isCatPlaying(false, 36));
        System.out.println("Is cat playing: " + isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45) return true;
        else return temperature >= 25 && temperature <= 35;
    }
}
