/*
Given a 6 x 6 2D array named arr, this challenge is to find the largest hourglass sum in the array.
An hourglass sum is defined as the sum of array values that form an hourglass shape.
An hourglass shape is 3 values across the top and bottom with 1 value in the center connecting them.
*/

func hourglassSum(arr [][]int32) int32 {
    // Slice to track hourglass sums
    var s []int32

    // Nested for loop to access both rows and columns [r][c]
    for i, _ := range arr {
        for j, _ := range arr {
            if !(j+3 > len(arr)) && !(i+3 > len(arr)) {
                // If hourglass requirements are met, add the array elements constituting the hourglass. 
                // The current element, two elements in a row to the right, the element one row down and 
                // one column to the right, the element 2 rows down, and the two in a row to its right.
                // Then add that sum to the hourglass ArrayList.
                s = append(s, arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+
                    arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2])
            }
        }
    }
    
    // Loop through the hourglass sum slice and find the highest sum
    a := s[0]
    for _, v := range s {
        if v > a {
            a = v
        }
    }
    
    // Return the highest hourglass sum
    return a
}
