package org.knoldus.com

object sort_List {
  // sorting by quick sort 
  def quickSort(initialList:List[Int]): List[Int] ={
    // checking if the list contain one element or  it is empty
    if(initialList.length<=1)
    {
      initialList
    }
    //if length of the  elemnet is grater then 1...  
    else {
      val pivot_element=initialList(initialList.length/2)
      List.concat(
        quickSort(initialList filter(pivot_element >)),
        initialList filter(pivot_element ==),
        quickSort(initialList filter(pivot_element <))
      )
    }
  }
 // main function...
  def main(args: Array[String]): Unit = {

    val initialList=List(6,5,7,3,8,9,3,0)
    println("List Before Sorting  : "+initialList) // given list . 
    val sortedList=quickSort(initialList)
    println(" List After sorting :  "+sortedList)   //sorted list.
  }
}
