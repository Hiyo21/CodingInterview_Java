package algorithm.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class testMergeSort {
    @Test
    public void testSort(){
        int[] testArr = {5, 3, 4, 34, 2, 15};
        MergeSort m = new MergeSort();
        m.sort(testArr);
        System.out.println(testArr);

        int[] resArr1 = m.orgArr;
        Arrays.sort(testArr);

        Assert.assertArrayEquals(resArr1, testArr);
    }
}
