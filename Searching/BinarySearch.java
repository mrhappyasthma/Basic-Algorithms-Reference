public static int binarySearch(int arr[], int value) throws IllegalArgumentException
{
  if(arr == null)
  {
    throw new IllegalArgumentException("Array is null");
  }
  
  return binarySearch(arr, 0, arr.length-1, value);
}

private static int binarySearch(int arr[], int left, int right, int value)
{
  if(left > right)
  {
    return -1;
  }
  
  int mid = left + (right-left)/2; //Pick middle most value
  
  if(arr[mid] == value)
  {
    return mid;
  }
  else if(arr[mid] > value)
  {
    return binarySearch(arr, left, mid-1, value);
  }
  else
  {
    return binarySearch(arr, mid+1, right, value);
  }
}
