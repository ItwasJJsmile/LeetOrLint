package dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: 5
 * Output:
 * [
 *      [1],
 *      [1,1],
 *      [1,2,1],
 *      [1,3,3,1],
 *      [1,4,6,4,1]
 * ]
 */

public class YhTriangle {

//        public List<List<Integer>> generate(int numRows) {
//            List<List<Integer>> triangle = new ArrayList<List<Integer>>();
//
//            // First base case; if user requests zero rows, they get zero rows.
//            if (numRows == 0) {
//                return triangle;
//            }
//
//            // Second base case; first row is always [1].
//            triangle.add(new ArrayList<>());
//            triangle.get(0).add(1);
//
//            for (int rowNum = 1; rowNum < numRows; rowNum++) {
//                List<Integer> row = new ArrayList<>();
//                List<Integer> prevRow = triangle.get(rowNum-1);
//
//                // The first row element is always 1.
//                row.add(1);
//
//                // Each triangle element (other than the first and last of each row)
//                // is equal to the sum of the elements above-and-to-the-left and
//                // above-and-to-the-right.
//                for (int j = 1; j < rowNum; j++) {
//                    row.add(prevRow.get(j-1) + prevRow.get(j));
//                }
//
//                // The last row element is always 1.
//                row.add(1);
//
//                triangle.add(row);
//            }
//
//            return triangle;
//        }

    public List<List<Integer>> generateMyOwn(int numRows) {

            List<List<Integer>> triangle = new ArrayList<>();

            if(numRows==0){
                return triangle;
            }

            triangle.add(new ArrayList<>());
            triangle.get(0).add(1);

            for(int lineNumber=1;lineNumber<numRows;lineNumber++){
                List<Integer> currentRow = new ArrayList<>();
                List<Integer> preRow = triangle.get(lineNumber-1);

                currentRow.add(1);
                for(int j=1;j<lineNumber;j++){
                    currentRow.add(preRow.get(j-1) + preRow.get(j));
                }
                currentRow.add(1);
                triangle.add(currentRow);
            }

            return triangle;
    }


        @Test
        public void test01(){

            List<Integer> a = new ArrayList<>();
            a.add(4);

            System.out.println(generateMyOwn(3));
        }
    }
