import com.kodilla.rsp.Logic;
import org.junit.*;

public class RSPTestSuite {

    @Test
    public void testCompareMovesTie(){
        //Given

        //When
        int compareResult = Logic.compareMoves(1, 1);

        //Then
        Assert.assertEquals(compareResult,0);
    }

    @Test
    public void testCompareMovesCompWin(){
        //Given

        //When
        int compareResult = Logic.compareMoves(1, 2);

        //Then
        Assert.assertEquals(compareResult,-1);
    }

    @Test
    public void testCompareMovesUserWin(){
        //Given

        //When
        int compareResult = Logic.compareMoves(1, 3);

        //Then
        Assert.assertEquals(compareResult,1);
    }
}
