//package advanced_Sorting;
//
//public class mergeSorting_review2 {
//	public int[] mergeSort(int[] array, int LEFT, int RIGHT) {
//		
//		//Chia ra 
//		if(LEFT>RIGHT) {
//			return;
//		}
//		if(LEFT==RIGHT) {
//			//Truong hop chi co 1 phan tu 
//			int[] singleElement = {array[LEFT]};
//			return singleElement;
//		}
//		//Truong hop tong quat 
//		System.out.println("Chia : " + LEFT + "- " + RIGHT);
//		int MID = (LEFT+RIGHT)/2;
//		int[] subArray1 = mergeSort(array,LEFT,MID);
//		int[] subArray2 = mergeSort(array,MID+1,RIGHT);
//	
//		
//		//Tron vao 
//		//Tron 2 mang subArray1 va subArray2 da duoc sap xep 
//		int newLength = subArray1.length+subArray2.length;
//		int[] result = new int[newLength];
//		int i=0, i1=0, i2=0;
//		while(i<newLength) {
//			if(i1<subArray1.length && i2<subArray2.length) {
//				if(subArray1[i1]<=subArray2[i2]) {
//					result[i]=subArray[i1];
//					i++;
//				}else {
//					
//					
//				}
//			}
//		}
//		
//	}
//	public int[] sortingArray(int[] array) {
//		
//		
//	}
//
//}
