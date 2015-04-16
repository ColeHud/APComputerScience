/*
This progarm displays the song lyrics to a popular children's song.

By Cole Hudson
09/24/14
V1

*/

public class RowRowRow
{
    public static void main(String[] args)
    {
        //initialize info variables
        String title = "Row Row Row Your Boat";
        String composer = "Eliphalet Oram Lyte";
        int year = 1852;

        //initialize lyric variables
        String chorusL1 = "Row, row, row your boat,";
        String chorusL2 = "Gently down the stream.";

        String verse1L1 = "Merrily, merrily, merrily, merrily,";
        String verse1L2 = "Life is but a dream.";

        String verse2L1 = "If you see an alligator,";
        String verse2L2 = "Don't forget to scream.";

        String verse3L1 = "Throw your teacher overboard";
        String verse3L2 = "And listen to her scream.";

        //print everything out

        System.out.println(title);
        System.out.println(composer + ", " + year);
        System.out.println("**************************\n");

        System.out.println(chorusL1);
        System.out.println(chorusL2);
        System.out.println(verse1L1);
        System.out.println(verse1L2);

        System.out.println();

        System.out.println(chorusL1);
        System.out.println(chorusL2);
        System.out.println(verse2L1);
        System.out.println(verse2L2);

        System.out.println();

        System.out.println(chorusL1);
        System.out.println(chorusL2);
        System.out.println(verse3L1);
        System.out.println(verse3L2);

    }

}