 open class Chicken : Bird {
     constructor(color: String, numberOfFeathers: Int) : super(color, numberOfFeathers)

     constructor(color: String) : super(color, 8000)

     companion object {
         fun testChicken() {
             val chick1 = Chicken("yellow", 2160)
             val chick2 = Chicken("red")
             println(chick1.getColor() == "yellow")
             println(chick1.getNumberOfFeathers() == 2160)
             println(chick1.isEdible() == true)
             println(chick2.getColor() == "red")
             println(chick2.getNumberOfFeathers() == 8000)
             println(chick2.isEdible() == true)
         }
     }
 }