/* 
Given a 6 x 6 2D array named arr, this challenge is to find the largest hourglass sum in the array.
An hourglass sum is defined as the sum of array values that form an hourglass shape.
An hourglass shape is 3 values across the top and bottom with 1 value in the center connecting them:
1 2 3
  4
5 6 7
*/

int hourglassSum(vector<vector<int>> arr)
{
    // Vector to track hourglass sums
    vector<int> hourglass;
    // Nested for loop to access both rows and columns
    for (int i=0;i<arr.size();i++)
    {
        for (int j=0;j<arr.size();j++)
        {
            // Check if this row has 2 values after the current one and if a row exists 2 rows down
            if (!(j+3 > arr.size()) && !(i+3 > arr.size()))
            {
                // If hourglass requirements are met, add the array elements constituting the hourglass. 
                // The current element, two elements in a row to the right, the element one row down and 
                // one column to the right, the element 2 rows down, and the two in a row to its right.
                // Then add that sum to the hourglass ArrayList.
                hourglass.push_back(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+
                                arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            }
        }
    }
    // Return the highest hourglass sum
    return *max_element(begin(hourglass), end(hourglass));
}
