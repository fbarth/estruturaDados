public static void main(String[] args) {
    int a[] = {1,7,8,5,6,4,2,3,9,11,25,13,14};
    QuickSort.quickSort(a,0,a.length-1);
    for(int i=0; i<a.length; i++)
	System.out.print(a[i]+" , ");
}