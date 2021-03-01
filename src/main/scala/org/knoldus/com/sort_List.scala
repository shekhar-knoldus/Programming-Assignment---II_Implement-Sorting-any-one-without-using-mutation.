package org.knoldus.com

object sort_List {
  def quickSort(initialList:List[Int]): List[Int] ={
    if(initialList.length<=1)
    {
      initialList
    }
    else {
      val pivot_element=initialList(initialList.length/2)
      List.concat(
        quickSort(initialList filter(pivot_element >)),
        initialList filter(pivot_element ==),
        quickSort(initialList filter(pivot_element <))
      )
    }
  }

  def main(args: Array[String]): Unit = {

    val initialList=List(6,5,7,3,8,9,3,0)
    println("List Before Sorting  : "+initialList)
    val sortedList=quickSort(initialList)
    println(" List After sorting :  "+sortedList)
  }
}
